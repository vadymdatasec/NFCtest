public abstract class m.a.a.b.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Object a;
	 /* # direct methods */
	 public static m.a.a.b.a ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x2e */
		 /* .line 1 */
		 java.lang.Character .toString ( v0 );
		 /* .line 2 */
		 /* sget-char v0, Ljava/io/File;->separatorChar:C */
		 /* sput-char v0, Lm/a/a/b/a;->a:C */
		 /* .line 3 */
		 v0 = 		 m.a.a.b.a .a ( );
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 v0 = 	 m.a.a.b.a .b ( p0 );
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* .line 3 */
	 (( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // .end method
public static Boolean a ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* sget-char v0, Lm/a/a/b/a;->a:C */
	 /* const/16 v1, 0x5c */
	 /* if-ne v0, v1, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static Integer b ( java.lang.String p0 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
int p0 = -1; // const/4 p0, -0x1
} // :cond_0
/* const/16 v0, 0x2f */
/* .line 1 */
v0 = (( java.lang.String ) p0 ).lastIndexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I
/* const/16 v1, 0x5c */
/* .line 2 */
p0 = (( java.lang.String ) p0 ).lastIndexOf ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I
/* .line 3 */
p0 = java.lang.Math .max ( v0,p0 );
} // .end method
