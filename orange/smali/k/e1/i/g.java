public abstract class k.e1.i.g {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static k.e1.i.g ( ) {
		 /* .locals 1 */
		 final String v0 = "\"\\"; // const-string v0, "\"\\"
		 /* .line 1 */
		 l.i .c ( v0 );
		 final String v0 = "\t ,="; // const-string v0, "\t ,="
		 /* .line 2 */
		 l.i .c ( v0 );
		 return;
	 } // .end method
	 public static Integer a ( java.lang.String p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .line 10 */
		 try { // :try_start_0
			 java.lang.Long .parseLong ( p0 );
			 /* move-result-wide p0 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* const-wide/32 v0, 0x7fffffff */
			 /* cmp-long v2, p0, v0 */
			 /* if-lez v2, :cond_0 */
			 /* const p0, 0x7fffffff */
		 } // :cond_0
		 /* const-wide/16 v0, 0x0 */
		 /* cmp-long v2, p0, v0 */
		 /* if-gez v2, :cond_1 */
		 int p0 = 0; // const/4 p0, 0x0
	 } // :cond_1
	 /* long-to-int p1, p0 */
	 /* :catch_0 */
} // .end method
public static Integer a ( java.lang.String p0, Integer p1, java.lang.String p2 ) {
	 /* .locals 2 */
	 /* .line 8 */
} // :goto_0
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge p1, v0, :cond_1 */
/* .line 9 */
v0 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
v0 = (( java.lang.String ) p2 ).indexOf ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
} // :goto_1
} // .end method
public static Long a ( java.lang.String p0 ) {
/* .locals 2 */
/* const-wide/16 v0, -0x1 */
/* if-nez p0, :cond_0 */
/* return-wide v0 */
/* .line 3 */
} // :cond_0
try { // :try_start_0
java.lang.Long .parseLong ( p0 );
/* move-result-wide v0 */
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* return-wide v0 */
} // .end method
public static Long a ( k.d0 p0 ) {
/* .locals 2 */
final String v0 = "Content-Length"; // const-string v0, "Content-Length"
/* .line 2 */
(( k.d0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lk/d0;->a(Ljava/lang/String;)Ljava/lang/String;
k.e1.i.g .a ( p0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static Long a ( k.z0 p0 ) {
/* .locals 2 */
/* .line 1 */
(( k.z0 ) p0 ).o ( ); // invoke-virtual {p0}, Lk/z0;->o()Lk/d0;
k.e1.i.g .a ( p0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static void a ( Object p0, k.f0 p1, k.d0 p2 ) {
/* .locals 1 */
/* .line 4 */
v0 = k.t.a;
/* if-ne p0, v0, :cond_0 */
return;
/* .line 5 */
} // :cond_0
k.r .a ( p1,p2 );
v0 = /* .line 6 */
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 7 */
} // :cond_1
return;
} // .end method
public static Integer b ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
/* .line 5 */
} // :goto_0
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge p1, v0, :cond_1 */
/* .line 6 */
v0 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
/* const/16 v1, 0x20 */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0x9 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
} // :goto_1
} // .end method
public static Boolean b ( k.z0 p0 ) {
/* .locals 8 */
/* .line 1 */
(( k.z0 ) p0 ).s ( ); // invoke-virtual {p0}, Lk/z0;->s()Lk/u0;
(( k.u0 ) v0 ).e ( ); // invoke-virtual {v0}, Lk/u0;->e()Ljava/lang/String;
final String v1 = "HEAD"; // const-string v1, "HEAD"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = (( k.z0 ) p0 ).m ( ); // invoke-virtual {p0}, Lk/z0;->m()I
/* const/16 v2, 0x64 */
int v3 = 1; // const/4 v3, 0x1
/* if-lt v0, v2, :cond_1 */
/* const/16 v2, 0xc8 */
/* if-lt v0, v2, :cond_2 */
} // :cond_1
/* const/16 v2, 0xcc */
/* if-eq v0, v2, :cond_2 */
/* const/16 v2, 0x130 */
/* if-eq v0, v2, :cond_2 */
/* .line 3 */
} // :cond_2
k.e1.i.g .a ( p0 );
/* move-result-wide v4 */
/* const-wide/16 v6, -0x1 */
/* cmp-long v0, v4, v6 */
/* if-nez v0, :cond_4 */
final String v0 = "Transfer-Encoding"; // const-string v0, "Transfer-Encoding"
/* .line 4 */
(( k.z0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "chunked"; // const-string v0, "chunked"
p0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_3
} // :cond_3
} // :cond_4
} // :goto_0
} // .end method
