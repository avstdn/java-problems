package leetcode;

import java.util.HashSet;

public class N929_Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails) {
        int result = 0;
        HashSet<String> set = new HashSet();

        for (int i = 0; i < emails.length; i++) {
            String name = emails[i].substring(0, emails[i].indexOf('@'));
            String domain = emails[i].substring(emails[i].indexOf('@'));

            name = name.replace(".", "");
            if (name.indexOf('+') > 0) {
                name = name.substring(0, name.indexOf('+'));
            }
            set.add(name + domain);
        }

        return set.size();
    }
}
// https://leetcode.com/problems/unique-email-addresses/