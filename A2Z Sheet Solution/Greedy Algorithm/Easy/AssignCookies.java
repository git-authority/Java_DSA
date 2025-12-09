import java.util.*;

class AssignCookies {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {

        int m = Student.length, n = Cookie.length;
        Arrays.sort(Student);
        Arrays.sort(Cookie);

        // l = pointer for Student
        // r = pointer for Cookie
        int l = 0, r = 0;

        while(l<m && r<n){
            if(Cookie[r]>=Student[l]){
                l++;
            }
            r++;
        }

        return l;

    }
}