public class androidx.appcompat.app.AppCompatViewInflater {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String LOG_TAG;
	 public static final java.lang.String sClassPrefixList;
	 public static final java.util.Map sConstructorMap;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/reflect/Constructor<", */
	 /* "+", */
	 /* "Landroid/view/View;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.Class sConstructorSignature;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public static final sOnClickAttrs;
/* # instance fields */
public final java.lang.Object mConstructorArgs;
/* # direct methods */
public static androidx.appcompat.app.AppCompatViewInflater ( ) {
/* .locals 4 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Class; */
/* .line 1 */
/* const-class v1, Landroid/content/Context; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
/* const-class v1, Landroid/util/AttributeSet; */
int v3 = 1; // const/4 v3, 0x1
/* aput-object v1, v0, v3 */
/* new-array v0, v3, [I */
/* const v1, 0x101026f */
/* aput v1, v0, v2 */
/* .line 2 */
final String v0 = "android.widget."; // const-string v0, "android.widget."
final String v1 = "android.view."; // const-string v1, "android.view."
final String v2 = "android.webkit."; // const-string v2, "android.webkit."
/* .line 3 */
/* filled-new-array {v0, v1, v2}, [Ljava/lang/String; */
/* .line 4 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
return;
} // .end method
public androidx.appcompat.app.AppCompatViewInflater ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 2 */
this.mConstructorArgs = v0;
return;
} // .end method
public static android.content.Context a ( android.content.Context p0, android.util.AttributeSet p1, Boolean p2, Boolean p3 ) {
/* .locals 2 */
/* .line 37 */
v0 = c.b.j.View;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).obtainStyledAttributes ( p1, v0, v1, v1 ); // invoke-virtual {p0, p1, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 38 */
p2 = (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* if-nez p2, :cond_1 */
/* .line 39 */
p2 = (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
if ( p2 != null) { // if-eqz p2, :cond_1
final String p3 = "AppCompatViewInflater"; // const-string p3, "AppCompatViewInflater"
final String v0 = "app:theme is now deprecated.Please move to using android:theme instead."; // const-string v0, "app:theme is now deprecated.Please move to using android:theme instead."
/* .line 40 */
android.util.Log .i ( p3,v0 );
/* .line 41 */
} // :cond_1
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 42 */
/* instance-of p1, p0, Lc/b/p/e; */
if ( p1 != null) { // if-eqz p1, :cond_2
/* move-object p1, p0 */
/* check-cast p1, Lc/b/p/e; */
/* .line 43 */
p1 = (( c.b.p.e ) p1 ).b ( ); // invoke-virtual {p1}, Lc/b/p/e;->b()I
/* if-eq p1, p2, :cond_3 */
/* .line 44 */
} // :cond_2
/* new-instance p1, Lc/b/p/e; */
/* invoke-direct {p1, p0, p2}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V */
/* move-object p0, p1 */
} // :cond_3
} // .end method
/* # virtual methods */
public final android.view.View a ( android.content.Context p0, java.lang.String p1, android.util.AttributeSet p2 ) {
/* .locals 4 */
final String v0 = "view"; // const-string v0, "view"
/* .line 2 */
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
final String p2 = "class"; // const-string p2, "class"
/* .line 3 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 4 */
try { // :try_start_0
v3 = this.mConstructorArgs;
/* aput-object p1, v3, v2 */
/* .line 5 */
v3 = this.mConstructorArgs;
/* aput-object p3, v3, v0 */
int p3 = -1; // const/4 p3, -0x1
/* const/16 v3, 0x2e */
/* .line 6 */
v3 = (( java.lang.String ) p2 ).indexOf ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(I)I
/* if-ne p3, v3, :cond_3 */
int p3 = 0; // const/4 p3, 0x0
/* .line 7 */
} // :goto_0
v3 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList;
/* array-length v3, v3 */
/* if-ge p3, v3, :cond_2 */
/* .line 8 */
v3 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList;
/* aget-object v3, v3, p3 */
(( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 9 */
p1 = this.mConstructorArgs;
/* aput-object v1, p1, v2 */
/* .line 10 */
/* aput-object v1, p1, v0 */
} // :cond_1
/* add-int/lit8 p3, p3, 0x1 */
/* .line 11 */
} // :cond_2
p1 = this.mConstructorArgs;
/* aput-object v1, p1, v2 */
/* .line 12 */
/* aput-object v1, p1, v0 */
/* .line 13 */
} // :cond_3
try { // :try_start_1
(( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 14 */
p2 = this.mConstructorArgs;
/* aput-object v1, p2, v2 */
/* .line 15 */
/* aput-object v1, p2, v0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 16 */
p2 = this.mConstructorArgs;
/* aput-object v1, p2, v2 */
/* .line 17 */
/* aput-object v1, p2, v0 */
/* .line 18 */
/* throw p1 */
/* .line 19 */
/* :catch_0 */
p1 = this.mConstructorArgs;
/* aput-object v1, p1, v2 */
/* .line 20 */
/* aput-object v1, p1, v0 */
} // .end method
public final android.view.View a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/ClassNotFoundException;, */
/* Landroid/view/InflateException; */
/* } */
} // .end annotation
/* .line 28 */
v0 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap;
/* check-cast v0, Ljava/lang/reflect/Constructor; */
/* if-nez v0, :cond_1 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 29 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
/* move-object p3, p2 */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 30 */
(( android.content.Context ) p1 ).getClassLoader ( ); // invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 31 */
java.lang.Class .forName ( p3,v0,p1 );
/* const-class p3, Landroid/view/View; */
/* .line 32 */
(( java.lang.Class ) p1 ).asSubclass ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
/* .line 33 */
p3 = androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature;
(( java.lang.Class ) p1 ).getConstructor ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* .line 34 */
p1 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap;
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
/* .line 35 */
(( java.lang.reflect.Constructor ) v0 ).setAccessible ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
/* .line 36 */
p1 = this.mConstructorArgs;
(( java.lang.reflect.Constructor ) v0 ).newInstance ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/View; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( android.view.View p0, android.util.AttributeSet p1 ) {
/* .locals 3 */
/* .line 21 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
/* .line 22 */
/* instance-of v1, v0, Landroid/content/ContextWrapper; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* const/16 v2, 0xf */
/* if-lt v1, v2, :cond_0 */
/* .line 23 */
v1 = c.h.n.v0 .y ( p1 );
/* if-nez v1, :cond_0 */
/* .line 24 */
} // :cond_0
v1 = androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs;
(( android.content.Context ) v0 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int v0 = 0; // const/4 v0, 0x0
/* .line 25 */
(( android.content.res.TypedArray ) p2 ).getString ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 26 */
/* new-instance v1, Lc/b/k/q0; */
/* invoke-direct {v1, p1, v0}, Lc/b/k/q0;-><init>(Landroid/view/View;Ljava/lang/String;)V */
(( android.view.View ) p1 ).setOnClickListener ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 27 */
} // :cond_1
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_2
} // :goto_0
return;
} // .end method
public final void a ( android.view.View p0, java.lang.String p1 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
return;
/* .line 1 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " asked to inflate view for <"; // const-string v1, " asked to inflate view for <"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ">, but returned null"; // const-string p2, ">, but returned null"
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public c.b.q.l createAutoCompleteTextView ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/l; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.n createButton ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/n; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.o createCheckBox ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/o; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.p createCheckedTextView ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/p; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.t createEditText ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/t; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/t;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.v createImageButton ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/v; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.x createImageView ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/x; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.y createMultiAutoCompleteTextView ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/y; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.b0 createRadioButton ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/b0; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/b0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.c0 createRatingBar ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/c0; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.d0 createSeekBar ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/d0; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/d0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.q0 createSpinner ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/q0; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.v0 createTextView ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/v0; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public c.b.q.x0 createToggleButton ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/x0; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/x0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public android.view.View createView ( android.content.Context p0, java.lang.String p1, android.util.AttributeSet p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final android.view.View createView ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3, Boolean p4, Boolean p5, Boolean p6, Boolean p7 ) {
/* .locals 0 */
if ( p5 != null) { // if-eqz p5, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
} // :cond_0
/* move-object p1, p3 */
} // :goto_0
/* if-nez p6, :cond_1 */
if ( p7 != null) { // if-eqz p7, :cond_2
/* .line 2 */
} // :cond_1
androidx.appcompat.app.AppCompatViewInflater .a ( p1,p4,p6,p7 );
} // :cond_2
if ( p8 != null) { // if-eqz p8, :cond_3
/* .line 3 */
c.b.q.h2 .b ( p1 );
} // :cond_3
int p5 = -1; // const/4 p5, -0x1
/* .line 4 */
p6 = (( java.lang.String ) p2 ).hashCode ( ); // invoke-virtual {p2}, Ljava/lang/String;->hashCode()I
/* sparse-switch p6, :sswitch_data_0 */
/* goto/16 :goto_1 */
/* :sswitch_0 */
final String p6 = "Button"; // const-string p6, "Button"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
int p5 = 2; // const/4 p5, 0x2
/* goto/16 :goto_1 */
/* :sswitch_1 */
final String p6 = "EditText"; // const-string p6, "EditText"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
int p5 = 3; // const/4 p5, 0x3
/* goto/16 :goto_1 */
/* :sswitch_2 */
final String p6 = "CheckBox"; // const-string p6, "CheckBox"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
int p5 = 6; // const/4 p5, 0x6
/* goto/16 :goto_1 */
/* :sswitch_3 */
final String p6 = "AutoCompleteTextView"; // const-string p6, "AutoCompleteTextView"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
/* const/16 p5, 0x9 */
/* goto/16 :goto_1 */
/* :sswitch_4 */
final String p6 = "ImageView"; // const-string p6, "ImageView"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
int p5 = 1; // const/4 p5, 0x1
/* :sswitch_5 */
final String p6 = "ToggleButton"; // const-string p6, "ToggleButton"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
/* const/16 p5, 0xd */
/* :sswitch_6 */
final String p6 = "RadioButton"; // const-string p6, "RadioButton"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
int p5 = 7; // const/4 p5, 0x7
/* :sswitch_7 */
final String p6 = "Spinner"; // const-string p6, "Spinner"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
int p5 = 4; // const/4 p5, 0x4
/* :sswitch_8 */
final String p6 = "SeekBar"; // const-string p6, "SeekBar"
p6 = (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p6 != null) { // if-eqz p6, :cond_4
	 /* const/16 p5, 0xc */
	 /* :sswitch_9 */
	 final String p6 = "ImageButton"; // const-string p6, "ImageButton"
	 p6 = 	 (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p6 != null) { // if-eqz p6, :cond_4
		 int p5 = 5; // const/4 p5, 0x5
		 /* :sswitch_a */
		 final String p6 = "TextView"; // const-string p6, "TextView"
		 p6 = 		 (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p6 != null) { // if-eqz p6, :cond_4
			 int p5 = 0; // const/4 p5, 0x0
			 /* :sswitch_b */
			 final String p6 = "MultiAutoCompleteTextView"; // const-string p6, "MultiAutoCompleteTextView"
			 p6 = 			 (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( p6 != null) { // if-eqz p6, :cond_4
				 /* const/16 p5, 0xa */
				 /* :sswitch_c */
				 final String p6 = "CheckedTextView"; // const-string p6, "CheckedTextView"
				 p6 = 				 (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( p6 != null) { // if-eqz p6, :cond_4
					 /* const/16 p5, 0x8 */
					 /* :sswitch_d */
					 final String p6 = "RatingBar"; // const-string p6, "RatingBar"
					 p6 = 					 (( java.lang.String ) p2 ).equals ( p6 ); // invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( p6 != null) { // if-eqz p6, :cond_4
						 /* const/16 p5, 0xb */
					 } // :cond_4
				 } // :goto_1
				 /* packed-switch p5, :pswitch_data_0 */
				 /* .line 5 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createView ( p1, p2, p4 ); // invoke-virtual {p0, p1, p2, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
				 /* goto/16 :goto_2 */
				 /* .line 6 */
				 /* :pswitch_0 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createToggleButton ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createToggleButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/x0;
				 /* .line 7 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* goto/16 :goto_2 */
				 /* .line 8 */
				 /* :pswitch_1 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createSeekBar ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createSeekBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/d0;
				 /* .line 9 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 10 */
				 /* :pswitch_2 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createRatingBar ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createRatingBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/c0;
				 /* .line 11 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 12 */
				 /* :pswitch_3 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createMultiAutoCompleteTextView ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createMultiAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/y;
				 /* .line 13 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 14 */
				 /* :pswitch_4 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createAutoCompleteTextView ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/l;
				 /* .line 15 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 16 */
				 /* :pswitch_5 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createCheckedTextView ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createCheckedTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/p;
				 /* .line 17 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 18 */
				 /* :pswitch_6 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createRadioButton ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createRadioButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/b0;
				 /* .line 19 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 20 */
				 /* :pswitch_7 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createCheckBox ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createCheckBox(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/o;
				 /* .line 21 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 22 */
				 /* :pswitch_8 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createImageButton ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createImageButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/v;
				 /* .line 23 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 24 */
				 /* :pswitch_9 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createSpinner ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createSpinner(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/q0;
				 /* .line 25 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 26 */
				 /* :pswitch_a */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createEditText ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createEditText(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/t;
				 /* .line 27 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 28 */
				 /* :pswitch_b */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createButton ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/n;
				 /* .line 29 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 30 */
				 /* :pswitch_c */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createImageView ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createImageView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/x;
				 /* .line 31 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
				 /* .line 32 */
				 /* :pswitch_d */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).createTextView ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/v0;
				 /* .line 33 */
				 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p2 ); // invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V
			 } // :goto_2
			 /* if-nez p5, :cond_5 */
			 /* if-eq p3, p1, :cond_5 */
			 /* .line 34 */
			 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p1, p2, p4 ); // invoke-virtual {p0, p1, p2, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
		 } // :cond_5
		 if ( p5 != null) { // if-eqz p5, :cond_6
			 /* .line 35 */
			 (( androidx.appcompat.app.AppCompatViewInflater ) p0 ).a ( p5, p4 ); // invoke-virtual {p0, p5, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Landroid/util/AttributeSet;)V
		 } // :cond_6
		 /* :sswitch_data_0 */
		 /* .sparse-switch */
		 /* -0x7404ceea -> :sswitch_d */
		 /* -0x56c015e7 -> :sswitch_c */
		 /* -0x503aa7ad -> :sswitch_b */
		 /* -0x37f7066e -> :sswitch_a */
		 /* -0x37e04bb3 -> :sswitch_9 */
		 /* -0x274065a5 -> :sswitch_8 */
		 /* -0x1440b607 -> :sswitch_7 */
		 /* 0x2e46a6ed -> :sswitch_6 */
		 /* 0x2fa453c6 -> :sswitch_5 */
		 /* 0x431b5280 -> :sswitch_4 */
		 /* 0x5445f9ba -> :sswitch_3 */
		 /* 0x5f7507c3 -> :sswitch_2 */
		 /* 0x63577677 -> :sswitch_1 */
		 /* 0x77471352 -> :sswitch_0 */
	 } // .end sparse-switch
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_d */
	 /* :pswitch_c */
	 /* :pswitch_b */
	 /* :pswitch_a */
	 /* :pswitch_9 */
	 /* :pswitch_8 */
	 /* :pswitch_7 */
	 /* :pswitch_6 */
	 /* :pswitch_5 */
	 /* :pswitch_4 */
	 /* :pswitch_3 */
	 /* :pswitch_2 */
	 /* :pswitch_1 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
