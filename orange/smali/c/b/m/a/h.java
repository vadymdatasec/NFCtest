public class c.b.m.a.h extends c.b.m.a.o implements c.h.g.r.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "RestrictedAPI" */
	 /* } */
} // .end annotation
/* # instance fields */
public c.b.m.a.c p;
public c.b.m.a.g q;
public Integer r;
public Integer s;
public Boolean t;
/* # direct methods */
public static c.b.m.a.h ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* const-class v0, Lc/b/m/a/h; */
	 return;
} // .end method
public c.b.m.a.h ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, v0, v0}, Lc/b/m/a/h;-><init>(Lc/b/m/a/c;Landroid/content/res/Resources;)V */
	 return;
} // .end method
public c.b.m.a.h ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* invoke-direct {p0, v0}, Lc/b/m/a/o;-><init>(Lc/b/m/a/n;)V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 3 */
	 /* iput v0, p0, Lc/b/m/a/h;->r:I */
	 /* .line 4 */
	 /* iput v0, p0, Lc/b/m/a/h;->s:I */
	 /* .line 5 */
	 /* new-instance v0, Lc/b/m/a/c; */
	 /* invoke-direct {v0, p1, p0, p2}, Lc/b/m/a/c;-><init>(Lc/b/m/a/c;Lc/b/m/a/h;Landroid/content/res/Resources;)V */
	 /* .line 6 */
	 (( c.b.m.a.h ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/h;->a(Lc/b/m/a/k;)V
	 /* .line 7 */
	 (( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
	 (( c.b.m.a.h ) p0 ).onStateChange ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/h;->onStateChange([I)Z
	 /* .line 8 */
	 (( c.b.m.a.h ) p0 ).jumpToCurrentState ( ); // invoke-virtual {p0}, Lc/b/m/a/h;->jumpToCurrentState()V
	 return;
} // .end method
public static c.b.m.a.h e ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
	 /* .locals 8 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException;, */
	 /* Lorg/xmlpull/v1/XmlPullParserException; */
	 /* } */
} // .end annotation
/* .line 1 */
final String v1 = "animated-selector"; // const-string v1, "animated-selector"
/* .line 2 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 3 */
	 /* new-instance v0, Lc/b/m/a/h; */
	 /* invoke-direct {v0}, Lc/b/m/a/h;-><init>()V */
	 /* move-object v2, v0 */
	 /* move-object v3, p0 */
	 /* move-object v4, p1 */
	 /* move-object v5, p2 */
	 /* move-object v6, p3 */
	 /* move-object v7, p4 */
	 /* .line 4 */
	 /* invoke-virtual/range {v2 ..v7}, Lc/b/m/a/h;->a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V */
	 /* .line 5 */
} // :cond_0
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 6 */
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ": invalid animated-selector tag "; // const-string p2, ": invalid animated-selector tag "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public c.b.m.a.c a ( ) {
/* .locals 3 */
/* .line 25 */
/* new-instance v0, Lc/b/m/a/c; */
v1 = this.p;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, p0, v2}, Lc/b/m/a/c;-><init>(Lc/b/m/a/c;Lc/b/m/a/h;Landroid/content/res/Resources;)V */
} // .end method
public c.b.m.a.k a ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( c.b.m.a.h ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/m/a/h;->a()Lc/b/m/a/c;
} // .end method
public void a ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = c.b.n.b.AnimatedStateListDrawableCompat;
c.h.f.i.t .a ( p2,p5,p4,v0 );
/* .line 3 */
int v2 = 1; // const/4 v2, 0x1
v1 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( c.b.m.a.h ) p0 ).setVisible ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lc/b/m/a/h;->setVisible(ZZ)Z
/* .line 4 */
(( c.b.m.a.h ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/h;->a(Landroid/content/res/TypedArray;)V
/* .line 5 */
(( c.b.m.a.l ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/m/a/l;->a(Landroid/content/res/Resources;)V
/* .line 6 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 7 */
/* invoke-virtual/range {p0 ..p5}, Lc/b/m/a/h;->b(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V */
/* .line 8 */
(( c.b.m.a.h ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/m/a/h;->d()V
return;
} // .end method
public final void a ( android.content.res.TypedArray p0 ) {
/* .locals 3 */
/* .line 9 */
v0 = this.p;
/* .line 10 */
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_0 */
/* .line 11 */
/* iget v1, v0, Lc/b/m/a/k;->d:I */
v2 = (( android.content.res.TypedArray ) p1 ).getChangingConfigurations ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getChangingConfigurations()I
/* or-int/2addr v1, v2 */
/* iput v1, v0, Lc/b/m/a/k;->d:I */
/* .line 12 */
} // :cond_0
/* iget-boolean v2, v0, Lc/b/m/a/k;->i:Z */
/* .line 13 */
v1 = (( android.content.res.TypedArray ) p1 ).getBoolean ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 14 */
(( c.b.m.a.k ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/b/m/a/k;->b(Z)V
/* .line 15 */
/* iget-boolean v2, v0, Lc/b/m/a/k;->l:Z */
/* .line 16 */
v1 = (( android.content.res.TypedArray ) p1 ).getBoolean ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 17 */
(( c.b.m.a.k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/m/a/k;->a(Z)V
/* .line 18 */
/* iget v2, v0, Lc/b/m/a/k;->A:I */
/* .line 19 */
v1 = (( android.content.res.TypedArray ) p1 ).getInt ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
/* .line 20 */
(( c.b.m.a.k ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/b/m/a/k;->b(I)V
/* .line 21 */
/* iget v2, v0, Lc/b/m/a/k;->B:I */
/* .line 22 */
v1 = (( android.content.res.TypedArray ) p1 ).getInt ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
/* .line 23 */
(( c.b.m.a.k ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lc/b/m/a/k;->c(I)V
/* .line 24 */
/* iget-boolean v0, v0, Lc/b/m/a/k;->x:Z */
p1 = (( android.content.res.TypedArray ) p1 ).getBoolean ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( c.b.m.a.l ) p0 ).setDither ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/l;->setDither(Z)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 26 */
/* invoke-super {p0, p1}, Lc/b/m/a/o;->a(Lc/b/m/a/k;)V */
/* .line 27 */
/* instance-of v0, p1, Lc/b/m/a/c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 28 */
/* check-cast p1, Lc/b/m/a/c; */
this.p = p1;
} // :cond_0
return;
} // .end method
public final void b ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = /* .line 31 */
int v1 = 1; // const/4 v1, 0x1
/* add-int/2addr v0, v1 */
/* .line 32 */
} // :cond_0
v2 = } // :goto_0
/* if-eq v2, v1, :cond_5 */
v3 = /* .line 33 */
/* if-ge v3, v0, :cond_1 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq v2, v4, :cond_5 */
} // :cond_1
int v4 = 2; // const/4 v4, 0x2
/* if-eq v2, v4, :cond_2 */
} // :cond_2
/* if-le v3, v0, :cond_3 */
/* .line 34 */
} // :cond_3
final String v3 = "item"; // const-string v3, "item"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 35 */
/* invoke-virtual/range {p0 ..p5}, Lc/b/m/a/h;->c(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I */
/* .line 36 */
} // :cond_4
final String v3 = "transition"; // const-string v3, "transition"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 37 */
/* invoke-virtual/range {p0 ..p5}, Lc/b/m/a/h;->d(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I */
} // :cond_5
return;
} // .end method
public final Boolean b ( Integer p0 ) {
/* .locals 9 */
/* .line 1 */
v0 = this.q;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
/* iget v2, p0, Lc/b/m/a/h;->r:I */
/* if-ne p1, v2, :cond_0 */
/* .line 3 */
} // :cond_0
/* iget v2, p0, Lc/b/m/a/h;->s:I */
/* if-ne p1, v2, :cond_1 */
v2 = (( c.b.m.a.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/m/a/g;->a()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 4 */
(( c.b.m.a.g ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/m/a/g;->b()V
/* .line 5 */
/* iget v0, p0, Lc/b/m/a/h;->s:I */
/* iput v0, p0, Lc/b/m/a/h;->r:I */
/* .line 6 */
/* iput p1, p0, Lc/b/m/a/h;->s:I */
/* .line 7 */
} // :cond_1
/* iget v2, p0, Lc/b/m/a/h;->r:I */
/* .line 8 */
(( c.b.m.a.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/m/a/g;->d()V
/* .line 9 */
} // :cond_2
v2 = (( c.b.m.a.l ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->b()I
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
this.q = v0;
int v0 = -1; // const/4 v0, -0x1
/* .line 11 */
/* iput v0, p0, Lc/b/m/a/h;->s:I */
/* .line 12 */
/* iput v0, p0, Lc/b/m/a/h;->r:I */
/* .line 13 */
v0 = this.p;
/* .line 14 */
v3 = (( c.b.m.a.c ) v0 ).d ( v2 ); // invoke-virtual {v0, v2}, Lc/b/m/a/c;->d(I)I
/* .line 15 */
v4 = (( c.b.m.a.c ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/b/m/a/c;->d(I)I
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_7
/* if-nez v3, :cond_3 */
/* .line 16 */
} // :cond_3
v6 = (( c.b.m.a.c ) v0 ).c ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lc/b/m/a/c;->c(II)I
/* if-gez v6, :cond_4 */
/* .line 17 */
} // :cond_4
v7 = (( c.b.m.a.c ) v0 ).e ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lc/b/m/a/c;->e(II)Z
/* .line 18 */
(( c.b.m.a.l ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Lc/b/m/a/l;->a(I)Z
/* .line 19 */
(( c.b.m.a.l ) p0 ).getCurrent ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->getCurrent()Landroid/graphics/drawable/Drawable;
/* .line 20 */
/* instance-of v8, v6, Landroid/graphics/drawable/AnimationDrawable; */
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 21 */
v0 = (( c.b.m.a.c ) v0 ).d ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lc/b/m/a/c;->d(II)Z
/* .line 22 */
/* new-instance v3, Lc/b/m/a/e; */
/* check-cast v6, Landroid/graphics/drawable/AnimationDrawable; */
/* invoke-direct {v3, v6, v0, v7}, Lc/b/m/a/e;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V */
/* .line 23 */
} // :cond_5
/* instance-of v0, v6, Lc/w/a/a/g; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 24 */
/* new-instance v3, Lc/b/m/a/d; */
/* check-cast v6, Lc/w/a/a/g; */
/* invoke-direct {v3, v6}, Lc/b/m/a/d;-><init>(Lc/w/a/a/g;)V */
/* .line 25 */
} // :cond_6
/* instance-of v0, v6, Landroid/graphics/drawable/Animatable; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 26 */
/* new-instance v3, Lc/b/m/a/b; */
/* check-cast v6, Landroid/graphics/drawable/Animatable; */
/* invoke-direct {v3, v6}, Lc/b/m/a/b;-><init>(Landroid/graphics/drawable/Animatable;)V */
/* .line 27 */
} // :goto_1
(( c.b.m.a.g ) v3 ).c ( ); // invoke-virtual {v3}, Lc/b/m/a/g;->c()V
/* .line 28 */
this.q = v3;
/* .line 29 */
/* iput v2, p0, Lc/b/m/a/h;->s:I */
/* .line 30 */
/* iput p1, p0, Lc/b/m/a/h;->r:I */
} // :cond_7
} // :goto_2
} // .end method
public final Integer c ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = c.b.n.b.AnimatedStateListDrawableItem;
c.h.f.i.t .a ( p2,p5,p4,v0 );
/* .line 2 */
int v2 = 0; // const/4 v2, 0x0
v1 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 3 */
int v3 = -1; // const/4 v3, -0x1
/* .line 4 */
v2 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* if-lez v2, :cond_0 */
/* .line 5 */
c.b.q.z1 .a ( );
(( c.b.q.z1 ) v3 ).b ( p1, v2 ); // invoke-virtual {v3, p1, v2}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
} // :goto_0
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 7 */
(( c.b.m.a.o ) p0 ).a ( p4 ); // invoke-virtual {p0, p4}, Lc/b/m/a/o;->a(Landroid/util/AttributeSet;)[I
final String v2 = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"; // const-string v2, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"
/* if-nez p1, :cond_5 */
/* .line 8 */
p1 = } // :goto_1
int v3 = 4; // const/4 v3, 0x4
/* if-ne p1, v3, :cond_1 */
} // :cond_1
int v3 = 2; // const/4 v3, 0x2
/* if-ne p1, v3, :cond_4 */
/* .line 9 */
final String v3 = "vector"; // const-string v3, "vector"
p1 = (( java.lang.String ) p1 ).equals ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 10 */
c.w.a.a.w .createFromXmlInner ( p2,p3,p4,p5 );
/* .line 11 */
} // :cond_2
/* const/16 v3, 0x15 */
/* if-lt p1, v3, :cond_3 */
/* .line 12 */
android.graphics.drawable.Drawable .createFromXmlInner ( p2,p3,p4,p5 );
/* .line 13 */
} // :cond_3
android.graphics.drawable.Drawable .createFromXmlInner ( p2,p3,p4 );
/* .line 14 */
} // :cond_4
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 15 */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_5
} // :goto_2
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 16 */
p2 = this.p;
p1 = (( c.b.m.a.c ) p2 ).a ( v0, p1, v1 ); // invoke-virtual {p2, v0, p1, v1}, Lc/b/m/a/c;->a([ILandroid/graphics/drawable/Drawable;I)I
/* .line 17 */
} // :cond_6
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 18 */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Integer d ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = c.b.n.b.AnimatedStateListDrawableTransition;
c.h.f.i.t .a ( p2,p5,p4,v0 );
/* .line 3 */
int v2 = -1; // const/4 v2, -0x1
v1 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 4 */
v3 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 5 */
v4 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v4, v2 ); // invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* if-lez v4, :cond_0 */
/* .line 6 */
c.b.q.z1 .a ( );
(( c.b.q.z1 ) v5 ).b ( p1, v4 ); // invoke-virtual {v5, p1, v4}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 7 */
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
v5 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 8 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
final String v0 = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"; // const-string v0, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"
/* if-nez v4, :cond_5 */
/* .line 9 */
v4 = } // :goto_1
int v6 = 4; // const/4 v6, 0x4
/* if-ne v4, v6, :cond_1 */
} // :cond_1
int v6 = 2; // const/4 v6, 0x2
/* if-ne v4, v6, :cond_4 */
/* .line 10 */
final String v6 = "animated-vector"; // const-string v6, "animated-vector"
v4 = (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 11 */
c.w.a.a.g .a ( p1,p2,p3,p4,p5 );
/* .line 12 */
} // :cond_2
/* const/16 v4, 0x15 */
/* if-lt p1, v4, :cond_3 */
/* .line 13 */
android.graphics.drawable.Drawable .createFromXmlInner ( p2,p3,p4,p5 );
/* .line 14 */
} // :cond_3
android.graphics.drawable.Drawable .createFromXmlInner ( p2,p3,p4 );
/* .line 15 */
} // :cond_4
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 16 */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_5
} // :goto_2
if ( v4 != null) { // if-eqz v4, :cond_7
/* if-eq v1, v2, :cond_6 */
/* if-eq v3, v2, :cond_6 */
/* .line 17 */
p1 = this.p;
p1 = (( c.b.m.a.c ) p1 ).a ( v1, v3, v4, v5 ); // invoke-virtual {p1, v1, v3, v4, v5}, Lc/b/m/a/c;->a(IILandroid/graphics/drawable/Drawable;Z)I
/* .line 18 */
} // :cond_6
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 19 */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = ": <transition> tag requires \'fromId\' & \'toId\' attributes"; // const-string p3, ": <transition> tag requires \'fromId\' & \'toId\' attributes"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 20 */
} // :cond_7
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 21 */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void d ( ) {
/* .locals 1 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
(( c.b.m.a.h ) p0 ).onStateChange ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/h;->onStateChange([I)Z
return;
} // .end method
public Boolean isStateful ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void jumpToCurrentState ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Lc/b/m/a/l;->jumpToCurrentState()V */
/* .line 2 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.m.a.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/m/a/g;->d()V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.q = v0;
/* .line 5 */
/* iget v0, p0, Lc/b/m/a/h;->r:I */
(( c.b.m.a.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/l;->a(I)Z
int v0 = -1; // const/4 v0, -0x1
/* .line 6 */
/* iput v0, p0, Lc/b/m/a/h;->r:I */
/* .line 7 */
/* iput v0, p0, Lc/b/m/a/h;->s:I */
} // :cond_0
return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/m/a/h;->t:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Lc/b/m/a/o;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne p0, p0, :cond_0 */
/* .line 2 */
v0 = this.p;
(( c.b.m.a.c ) v0 ).n ( ); // invoke-virtual {v0}, Lc/b/m/a/c;->n()V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/b/m/a/h;->t:Z */
} // :cond_0
} // .end method
public Boolean onStateChange ( Integer[] p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.p;
v0 = (( c.b.m.a.c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/m/a/c;->b([I)I
/* .line 2 */
v1 = (( c.b.m.a.l ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->b()I
/* if-eq v0, v1, :cond_1 */
/* .line 3 */
v1 = (( c.b.m.a.h ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/h;->b(I)Z
/* if-nez v1, :cond_0 */
v0 = (( c.b.m.a.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/l;->a(I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
(( c.b.m.a.l ) p0 ).getCurrent ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->getCurrent()Landroid/graphics/drawable/Drawable;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
p1 = (( android.graphics.drawable.Drawable ) v1 ).setState ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v0, p1 */
} // :cond_2
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = /* invoke-super {p0, p1, p2}, Lc/b/m/a/l;->setVisible(ZZ)Z */
/* .line 2 */
v1 = this.q;
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-nez v0, :cond_0 */
if ( p2 != null) { // if-eqz p2, :cond_2
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
p1 = this.q;
(( c.b.m.a.g ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/m/a/g;->c()V
/* .line 4 */
} // :cond_1
(( c.b.m.a.h ) p0 ).jumpToCurrentState ( ); // invoke-virtual {p0}, Lc/b/m/a/h;->jumpToCurrentState()V
} // :cond_2
} // :goto_0
} // .end method
