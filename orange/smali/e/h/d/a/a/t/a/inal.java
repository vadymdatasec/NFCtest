public class inal {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Le/h/d/a/a/t/a/a; */
		 /* invoke-direct {v0}, Le/h/d/a/a/t/a/a;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static final Integer a ( ) {
		 /* .locals 14 */
		 /* .line 1 */
		 v0 = android.os.Build$VERSION.RELEASE;
		 final String v6 = "RELEASE"; // const-string v6, "RELEASE"
		 i.h.c.k .b ( v0,v6 );
		 final String v7 = "."; // const-string v7, "."
		 /* filled-new-array {v7}, [Ljava/lang/String; */
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 6; // const/4 v4, 0x6
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-static/range {v0 ..v5}, Li/l/p;->a(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* check-cast v0, Ljava/lang/String; */
		 v0 = 		 java.lang.Integer .parseInt ( v0 );
		 java.lang.Integer .valueOf ( v0 );
		 final String v2 = "getOsVersion: "; // const-string v2, "getOsVersion: "
		 i.h.c.k .a ( v2,v0 );
		 final String v2 = "VersionUtils"; // const-string v2, "VersionUtils"
		 android.util.Log .d ( v2,v0 );
		 /* .line 2 */
		 v8 = android.os.Build$VERSION.RELEASE;
		 i.h.c.k .b ( v8,v6 );
		 /* filled-new-array {v7}, [Ljava/lang/String; */
		 int v10 = 0; // const/4 v10, 0x0
		 int v11 = 0; // const/4 v11, 0x0
		 int v12 = 6; // const/4 v12, 0x6
		 int v13 = 0; // const/4 v13, 0x0
		 /* invoke-static/range {v8 ..v13}, Li/l/p;->a(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List; */
		 /* check-cast v0, Ljava/lang/String; */
		 v0 = 		 java.lang.Integer .parseInt ( v0 );
	 } // .end method
