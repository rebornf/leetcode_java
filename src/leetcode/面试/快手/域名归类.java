package leetcode.面试.快手;

import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/26 17:24
 * @Version V1.0
 **/

public class 域名归类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Set<String>> map = new HashMap<>();    //<域名，路径集合>
        for (int i = 0; i < n; i++) {
            String inputStr = sc.nextLine();
            String tmp = inputStr.substring(7);
            String[] splitStr = tmp.split("/");
            Set<String> tmpSet = map.get(splitStr[0]);
            if (tmpSet == null) {
                tmpSet = new HashSet<>();
            }
            //空路径处理,最后有/和没有是不一样的
            if (splitStr.length == 1)
                if (tmp.substring(tmp.length() - 1).equals("/"))
                    tmpSet.add("_");
                else
                    tmpSet.add("*");
            else
                tmpSet.add(splitStr[1]);
            map.put(splitStr[0], tmpSet);
        }
        List<String> ip_list = new ArrayList<>(map.keySet());
        HashMap<String, Set<String>> resMap = new HashMap<>();
        for (int i = 0; i < ip_list.size(); i++) {
            for (int j = i; j < ip_list.size(); j++) {
                Set<String> ip1 = map.get(ip_list.get(i));
                Set<String> ip2 = map.get(ip_list.get(j));
                if (ip1.size() == ip2.size()) {
                    int tmpSize = ip1.size();
                    for (String tmpStr : ip2) {
                        ip1.add(tmpStr);
                    }
                    if (ip1.size() == tmpSize) {
                        List<String> hashRes = new ArrayList<>(ip1);
                        Collections.sort(hashRes);
                        String tmpStrRes = "";
                        for (String str : hashRes) {
                            tmpStrRes += str;
                        }
                        Set<String> resIps = resMap.get(tmpStrRes);
                        if (resIps == null)
                            resIps = new HashSet<>();
                        resIps.add(ip_list.get(i));
                        resIps.add(ip_list.get(j));
                        resMap.put(tmpStrRes, resIps);
                    }
                } else
                    break;
            }
        }
        List<Set<String>> resList = new ArrayList<>();
        for (Set<String> tmpSetRes : resMap.values()) {
            if (tmpSetRes.size() != 1)
                resList.add(tmpSetRes);
        }
        System.out.println(resList.size());
        for (Set<String> tmpSetRes : resList) {
            String string = "";
            for (String tmpStr : tmpSetRes) {
                string = string + "http://" + tmpStr + " ";
            }
            string.trim();
            System.out.println(string);
        }
    }
}


