public class m.a.b.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Class c; //synthetic
	 /* # instance fields */
	 public java.lang.String a;
	 public Integer b;
	 /* # direct methods */
	 public m.a.b.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 p1 = 		 (( java.lang.String ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
		 /* iput p1, p0, Lm/a/b/a;->b:I */
		 return;
	 } // .end method
	 public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
		 /* .locals 1 */
		 /* .line 1 */
		 try { // :try_start_0
			 java.lang.Class .forName ( p0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
			 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
			 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
			 /* throw p0 */
		 } // .end method
		 /* # virtual methods */
		 public final Boolean equals ( java.lang.Object p0 ) {
			 /* .locals 2 */
			 /* if-ne p0, p1, :cond_0 */
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 1 */
			 v0 = m.a.b.a.c;
			 /* if-nez v0, :cond_1 */
			 final String v0 = "org.apache.log4j.CategoryKey"; // const-string v0, "org.apache.log4j.CategoryKey"
			 m.a.b.a .a ( v0 );
		 } // :cond_1
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 /* if-ne v0, v1, :cond_2 */
		 /* .line 2 */
		 v0 = this.a;
		 /* check-cast p1, Lm/a/b/a; */
		 p1 = this.a;
		 p1 = 		 (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 } // :cond_2
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Integer hashCode ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Lm/a/b/a;->b:I */
} // .end method
