public abstract class m.a.a.c.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static m.a.a.c.e ( ) {
		 /* .locals 1 */
		 final String v0 = "(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*"; // const-string v0, "(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*"
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0 );
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.Iterable p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/Iterable<", */
		 /* "*>;", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/lang/String;" */
		 /* } */
	 } // .end annotation
	 /* if-nez p0, :cond_0 */
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 15 */
} // :cond_0
m.a.a.c.e .a ( p0,p1 );
} // .end method
public static java.lang.String a ( java.util.Iterator p0, java.lang.String p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Iterator<", */
/* "*>;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 4 */
v0 = } // :cond_0
/* if-nez v0, :cond_1 */
final String p0 = ""; // const-string p0, ""
/* .line 5 */
} // :cond_1
v1 = /* .line 6 */
/* if-nez v1, :cond_2 */
/* .line 7 */
m.a.a.c.d .a ( v0 );
/* .line 8 */
} // :cond_2
/* new-instance v1, Ljava/lang/StringBuilder; */
/* const/16 v2, 0x100 */
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 9 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 10 */
} // :cond_3
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_5
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 11 */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
} // :cond_4
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 13 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 14 */
} // :cond_5
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean a ( java.lang.CharSequence p0, java.lang.CharSequence p1 ) {
/* .locals 6 */
/* if-ne p0, p1, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
if ( p0 != null) { // if-eqz p0, :cond_3
/* if-nez p1, :cond_1 */
/* .line 1 */
} // :cond_1
/* instance-of v0, p0, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
v3 = v0 = /* .line 3 */
v5 = java.lang.Math .max ( v0,v3 );
/* move-object v0, p0 */
/* move-object v3, p1 */
p0 = /* invoke-static/range {v0 ..v5}, Lm/a/a/c/b;->a(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z */
} // :cond_3
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
