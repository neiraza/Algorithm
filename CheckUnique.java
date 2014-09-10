/**
 * ある文字列が、すべてユニークである（重複する文字がない）かどうかを
 * 判定するアルゴリズムを実装してください。
 * また、それを実装するのに新たなデータ構造が使えない場合、
 * どのようにすればよいですか？
 */
public class CheckUnique {
  public static void main (String[] args){
    System.out.println(isUnique("hoege"));
    System.out.println(isUniqueChars2("hoege"));
  }

  public static boolean isUnique (String s) {

    // ASCIIと仮定した場合
    if (s.length() > 256) return false;
    boolean isUnique = false;
    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      for (int j = i + 1; j < s.length(); j++) {
        if (current == s.charAt(j)) {
          isUnique = true;
          break;
        }
      }
      if (isUnique) break;
    }
    return isUnique;
  }

  public static boolean isUniqueChars2 (String s) {
    if (s.length() > 256) return false;
    boolean[] charSet = new boolean[256];
    for (int i = 0; i < s.length(); i++) {
      int val = s.charAt(i);
      if (charSet[val]) {
        return false;
      }
      charSet[val] = true;
    }
    return true;
  }
}

