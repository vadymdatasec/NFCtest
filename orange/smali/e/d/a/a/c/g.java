public class e.d.a.a.c.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Set a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/d/a/a/c/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final Boolean b;
public final java.util.Set c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Ljava/security/cert/Certificate;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.d.a.a.c.g ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set<", */
/* "Le/d/a/a/c/b;", */
/* ">;)V" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0, v1}, Le/d/a/a/c/g;-><init>(Ljava/util/Set;ZLjava/util/Set;)V */
return;
} // .end method
public e.d.a.a.c.g ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set<", */
/* "Le/d/a/a/c/b;", */
/* ">;Z", */
/* "Ljava/util/Set<", */
/* "Ljava/security/cert/Certificate;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 4 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/d/a/a/c/b; */
/* .line 5 */
v3 = (( e.d.a.a.c.b ) v2 ).b ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->b()Ljava/lang/String;
/* if-nez v3, :cond_0 */
/* .line 6 */
(( e.d.a.a.c.b ) v2 ).b ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->b()Ljava/lang/String;
/* .line 7 */
} // :cond_0
/* new-instance p1, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Policy contains the same domain defined twice: "; // const-string p3, "Policy contains the same domain defined twice: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
(( e.d.a.a.c.b ) v2 ).b ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 9 */
} // :cond_1
this.a = p1;
/* .line 10 */
/* iput-boolean p2, p0, Le/d/a/a/c/g;->b:Z */
/* .line 11 */
this.c = p3;
return;
} // .end method
public static e.d.a.a.c.g a ( android.content.Context p0, org.xmlpull.v1.XmlPullParser p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/cert/CertificateException;, */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.d.a.a.c.m .a ( p0,p1 );
} // .end method
public static Boolean a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 11 */
v0 = (( java.lang.String ) p1 ).endsWith ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
p0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v0, p0 */
/* sub-int/2addr v0, v1 */
p0 = (( java.lang.String ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 p1, 0x2e */
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public e.d.a.a.c.b a ( java.lang.String p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
e.d.a.a.c.d .a ( v0 );
/* .line 4 */
v0 = (( e.d.a.a.c.d ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/d/a/a/c/d;->b(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
v1 = this.a;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Le/d/a/a/c/b; */
/* .line 6 */
(( e.d.a.a.c.b ) v2 ).b ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->b()Ljava/lang/String;
v3 = (( java.lang.String ) v3 ).equals ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* move-object v0, v2 */
/* .line 7 */
} // :cond_1
v3 = (( e.d.a.a.c.b ) v2 ).f ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->f()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 8 */
(( e.d.a.a.c.b ) v2 ).b ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->b()Ljava/lang/String;
v3 = e.d.a.a.c.g .a ( v3,p1 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* if-nez v0, :cond_2 */
/* .line 9 */
} // :cond_2
(( e.d.a.a.c.b ) v2 ).b ( ); // invoke-virtual {v2}, Le/d/a/a/c/b;->b()Ljava/lang/String;
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
(( e.d.a.a.c.b ) v0 ).b ( ); // invoke-virtual {v0}, Le/d/a/a/c/b;->b()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-le v3, v4, :cond_0 */
} // :goto_1
/* move-object v0, v2 */
} // :cond_3
} // :goto_2
/* .line 10 */
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid domain supplied: "; // const-string v2, "Invalid domain supplied: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.util.Set a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/security/cert/Certificate;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.c;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/d/a/a/c/g;->b:Z */
} // .end method
