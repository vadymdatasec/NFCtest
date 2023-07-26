public class e.b.a.y.y.s1 implements e.b.a.y.y.w0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Data:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/w0<", */
	 /* "Ljava/lang/String;", */
	 /* "TData;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.y.w0 a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/w0<", */
/* "Landroid/net/Uri;", */
/* "TData;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.y.s1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/w0<", */
/* "Landroid/net/Uri;", */
/* "TData;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
public static android.net.Uri b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = android.text.TextUtils .isEmpty ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
v0 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v1, 0x2f */
/* if-ne v0, v1, :cond_1 */
/* .line 3 */
e.b.a.y.y.s1 .c ( p0 );
/* .line 4 */
} // :cond_1
android.net.Uri .parse ( p0 );
/* .line 5 */
(( android.net.Uri ) v0 ).getScheme ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* if-nez v1, :cond_2 */
/* .line 6 */
e.b.a.y.y.s1 .c ( p0 );
} // :cond_2
/* move-object p0, v0 */
} // :goto_0
} // .end method
public static android.net.Uri c ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
android.net.Uri .fromFile ( v0 );
} // .end method
/* # virtual methods */
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Ljava/lang/String; */
(( e.b.a.y.y.s1 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/s1;->a(Ljava/lang/String;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public e.b.a.y.y.v0 a ( java.lang.String p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/y/v0<", */
/* "TData;>;" */
/* } */
} // .end annotation
/* .line 3 */
e.b.a.y.y.s1 .b ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
v0 = v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 5 */
} // :cond_0
v0 = this.a;
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Ljava/lang/String; */
p1 = (( e.b.a.y.y.s1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/s1;->a(Ljava/lang/String;)Z
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
