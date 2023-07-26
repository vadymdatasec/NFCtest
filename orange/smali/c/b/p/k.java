public class c.b.p.k extends android.view.MenuInflater {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Class e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "[", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.Class f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final java.lang.Object a;
public final java.lang.Object b;
public android.content.Context c;
public java.lang.Object d;
/* # direct methods */
public static c.b.p.k ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
/* const-class v2, Landroid/content/Context; */
/* aput-object v2, v0, v1 */
/* .line 2 */
return;
} // .end method
public c.b.p.k ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V */
/* .line 2 */
this.c = p1;
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, v0, v1 */
/* .line 3 */
this.a = v0;
/* .line 4 */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
/* .locals 1 */
/* .line 29 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 30 */
v0 = this.c;
(( c.b.p.k ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/p/k;->a(Ljava/lang/Object;)Ljava/lang/Object;
this.d = v0;
/* .line 31 */
} // :cond_0
v0 = this.d;
} // .end method
public final java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 32 */
/* instance-of v0, p1, Landroid/app/Activity; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 33 */
} // :cond_0
/* instance-of v0, p1, Landroid/content/ContextWrapper; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 34 */
/* check-cast p1, Landroid/content/ContextWrapper; */
(( android.content.ContextWrapper ) p1 ).getBaseContext ( ); // invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
(( c.b.p.k ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/k;->a(Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
} // .end method
public final void a ( org.xmlpull.v1.XmlPullParser p0, android.util.AttributeSet p1, android.view.Menu p2 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/b/p/j; */
/* invoke-direct {v0, p0, p3}, Lc/b/p/j;-><init>(Lc/b/p/k;Landroid/view/Menu;)V */
p3 = /* .line 2 */
} // :cond_0
int v1 = 2; // const/4 v1, 0x2
final String v2 = "menu"; // const-string v2, "menu"
int v3 = 1; // const/4 v3, 0x1
/* if-ne p3, v1, :cond_2 */
/* .line 3 */
/* .line 4 */
v4 = (( java.lang.String ) p3 ).equals ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
p3 = /* .line 5 */
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/RuntimeException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Expecting menu, got "; // const-string v0, "Expecting menu, got "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 7 */
p3 = } // :cond_2
/* if-ne p3, v3, :cond_0 */
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object v8, v4 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
/* if-nez v6, :cond_f */
/* if-eq p3, v3, :cond_e */
final String v9 = "item"; // const-string v9, "item"
final String v10 = "group"; // const-string v10, "group"
/* if-eq p3, v1, :cond_8 */
int v11 = 3; // const/4 v11, 0x3
/* if-eq p3, v11, :cond_3 */
/* goto/16 :goto_2 */
/* .line 8 */
} // :cond_3
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 9 */
v11 = (( java.lang.String ) p3 ).equals ( v8 ); // invoke-virtual {p3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_4
/* move-object v8, v4 */
int v7 = 0; // const/4 v7, 0x0
/* .line 10 */
} // :cond_4
v10 = (( java.lang.String ) p3 ).equals ( v10 ); // invoke-virtual {p3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 11 */
(( c.b.p.j ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/p/j;->d()V
/* .line 12 */
} // :cond_5
v9 = (( java.lang.String ) p3 ).equals ( v9 ); // invoke-virtual {p3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_7
/* .line 13 */
p3 = (( c.b.p.j ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/p/j;->c()Z
/* if-nez p3, :cond_d */
/* .line 14 */
p3 = this.A;
if ( p3 != null) { // if-eqz p3, :cond_6
/* .line 15 */
p3 = (( c.h.n.g ) p3 ).a ( ); // invoke-virtual {p3}, Lc/h/n/g;->a()Z
if ( p3 != null) { // if-eqz p3, :cond_6
/* .line 16 */
(( c.b.p.j ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/j;->b()Landroid/view/SubMenu;
/* .line 17 */
} // :cond_6
(( c.b.p.j ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/j;->a()V
/* .line 18 */
} // :cond_7
p3 = (( java.lang.String ) p3 ).equals ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p3 != null) { // if-eqz p3, :cond_d
int v6 = 1; // const/4 v6, 0x1
} // :cond_8
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 19 */
} // :cond_9
/* .line 20 */
v10 = (( java.lang.String ) p3 ).equals ( v10 ); // invoke-virtual {p3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v10 != null) { // if-eqz v10, :cond_a
/* .line 21 */
(( c.b.p.j ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/b/p/j;->a(Landroid/util/AttributeSet;)V
/* .line 22 */
} // :cond_a
v9 = (( java.lang.String ) p3 ).equals ( v9 ); // invoke-virtual {p3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_b
/* .line 23 */
(( c.b.p.j ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Lc/b/p/j;->b(Landroid/util/AttributeSet;)V
/* .line 24 */
} // :cond_b
v9 = (( java.lang.String ) p3 ).equals ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_c
/* .line 25 */
(( c.b.p.j ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/j;->b()Landroid/view/SubMenu;
/* .line 26 */
(( c.b.p.k ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/b/p/k;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
} // :cond_c
/* move-object v8, p3 */
int v7 = 1; // const/4 v7, 0x1
/* .line 27 */
} // :cond_d
p3 = } // :goto_2
/* .line 28 */
} // :cond_e
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "Unexpected end of document"; // const-string p2, "Unexpected end of document"
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_f
return;
} // .end method
public void inflate ( Integer p0, android.view.Menu p1 ) {
/* .locals 3 */
final String v0 = "Error inflating menu XML"; // const-string v0, "Error inflating menu XML"
/* .line 1 */
/* instance-of v1, p2, Lc/h/h/a/a; */
/* if-nez v1, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V */
return;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
try { // :try_start_0
v2 = this.c;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getLayout ( p1 ); // invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;
/* .line 4 */
android.util.Xml .asAttributeSet ( v1 );
/* .line 5 */
(( c.b.p.k ) p0 ).a ( v1, p1, p2 ); // invoke-virtual {p0, v1, p1, p2}, Lc/b/p/k;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
} // :cond_1
return;
/* :catchall_0 */
/* move-exception p1 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
try { // :try_start_1
/* new-instance p2, Landroid/view/InflateException; */
/* invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p1 */
/* .line 8 */
/* new-instance p2, Landroid/view/InflateException; */
/* invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 9 */
/* .line 10 */
} // :cond_2
/* throw p1 */
} // .end method
