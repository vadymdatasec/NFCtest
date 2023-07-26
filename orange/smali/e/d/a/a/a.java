public class e.d.a.a.a implements android.util.Printer {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 /* # direct methods */
	 public e.d.a.a.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Le/d/a/a/a;->a:I */
		 return;
	 } // .end method
	 public static Integer a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( e.d.a.a.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/d/a/a/a;->a()I
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* iget v0, p0, Le/d/a/a/a;->a:I */
	 } // .end method
	 public void println ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p0, Le/d/a/a/a;->a:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne v0, v1, :cond_0 */
		 final String v0 = "networkSecurityConfigRes=0x"; // const-string v0, "networkSecurityConfigRes=0x"
		 /* .line 2 */
		 v0 = 		 (( java.lang.String ) p1 ).contains ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* const/16 v0, 0x1b */
			 /* .line 3 */
			 (( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
			 /* const/16 v0, 0x10 */
			 p1 = 			 java.lang.Integer .parseInt ( p1,v0 );
			 /* iput p1, p0, Le/d/a/a/a;->a:I */
		 } // :cond_0
		 return;
	 } // .end method
