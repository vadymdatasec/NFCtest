public class c.b.q.w0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.graphics.RectF k;
	 public static java.util.concurrent.ConcurrentHashMap l;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/ConcurrentHashMap<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/reflect/Method;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static java.util.concurrent.ConcurrentHashMap m;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Field;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer a;
public Boolean b;
public Float c;
public Float d;
public Float e;
public f;
public Boolean g;
public android.text.TextPaint h;
public final android.widget.TextView i;
public final android.content.Context j;
/* # direct methods */
public static c.b.q.w0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroid/graphics/RectF; */
/* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
return;
} // .end method
public c.b.q.w0 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lc/b/q/w0;->a:I */
/* .line 3 */
/* iput-boolean v0, p0, Lc/b/q/w0;->b:Z */
/* const/high16 v1, -0x40800000 # -1.0f */
/* .line 4 */
/* iput v1, p0, Lc/b/q/w0;->c:F */
/* .line 5 */
/* iput v1, p0, Lc/b/q/w0;->d:F */
/* .line 6 */
/* iput v1, p0, Lc/b/q/w0;->e:F */
/* new-array v1, v0, [I */
/* .line 7 */
this.f = v1;
/* .line 8 */
/* iput-boolean v0, p0, Lc/b/q/w0;->g:Z */
/* .line 9 */
this.i = p1;
/* .line 10 */
(( android.widget.TextView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
this.j = p1;
return;
} // .end method
public static java.lang.Object a ( java.lang.Object p0, java.lang.String p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/String;", */
/* "TT;)TT;" */
/* } */
} // .end annotation
/* .line 142 */
try { // :try_start_0
c.b.q.w0 .a ( p1 );
/* if-nez v0, :cond_0 */
/* .line 143 */
} // :cond_0
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 144 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Failed to access TextView#"; // const-string v1, "Failed to access TextView#"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " member"; // const-string p1, " member"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "ACTVAutoSizeHelper"; // const-string v0, "ACTVAutoSizeHelper"
android.util.Log .w ( v0,p1,p0 );
} // .end method
public static java.lang.reflect.Field a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 145 */
try { // :try_start_0
v0 = c.b.q.w0.m;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/reflect/Field; */
/* if-nez v0, :cond_0 */
/* .line 146 */
/* const-class v0, Landroid/widget/TextView; */
(( java.lang.Class ) v0 ).getDeclaredField ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 147 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* .line 148 */
v1 = c.b.q.w0.m;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).put ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
/* :catch_0 */
/* move-exception v0 */
/* .line 149 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to access TextView#"; // const-string v2, "Failed to access TextView#"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " member"; // const-string p0, " member"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "ACTVAutoSizeHelper"; // const-string v1, "ACTVAutoSizeHelper"
android.util.Log .w ( v1,p0,v0 );
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Object b ( java.lang.Object p0, java.lang.String p1, java.lang.Object p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/String;", */
/* "TT;)TT;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 37 */
try { // :try_start_0
c.b.q.w0 .b ( p1 );
/* new-array v2, v0, [Ljava/lang/Object; */
/* .line 38 */
(( java.lang.reflect.Method ) v1 ).invoke ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception p0 */
/* :catch_0 */
/* move-exception p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
final String v1 = "ACTVAutoSizeHelper"; // const-string v1, "ACTVAutoSizeHelper"
/* .line 39 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to invoke TextView#"; // const-string v3, "Failed to invoke TextView#"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "() method"; // const-string p1, "() method"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,p1,p0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* .line 40 */
} // :goto_1
/* throw p0 */
} // .end method
public static java.lang.reflect.Method b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 41 */
try { // :try_start_0
v0 = c.b.q.w0.l;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/reflect/Method; */
/* if-nez v0, :cond_0 */
/* .line 42 */
/* const-class v0, Landroid/widget/TextView; */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getDeclaredMethod ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 43 */
(( java.lang.reflect.Method ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* .line 44 */
v1 = c.b.q.w0.l;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).put ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
/* :catch_0 */
/* move-exception v0 */
/* .line 45 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to retrieve TextView#"; // const-string v2, "Failed to retrieve TextView#"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "() method"; // const-string p0, "() method"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "ACTVAutoSizeHelper"; // const-string v1, "ACTVAutoSizeHelper"
android.util.Log .w ( v1,p0,v0 );
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public final Integer a ( android.graphics.RectF p0 ) {
/* .locals 5 */
/* .line 108 */
v0 = this.f;
/* array-length v0, v0 */
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-gt v1, v0, :cond_1 */
/* add-int v2, v1, v0 */
/* .line 109 */
/* div-int/lit8 v2, v2, 0x2 */
/* .line 110 */
v3 = this.f;
/* aget v3, v3, v2 */
v3 = (( c.b.q.w0 ) p0 ).a ( v3, p1 ); // invoke-virtual {p0, v3, p1}, Lc/b/q/w0;->a(ILandroid/graphics/RectF;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* move v4, v2 */
/* move v2, v1 */
/* move v1, v4 */
} // :cond_0
/* add-int/lit8 v2, v2, -0x1 */
/* move v0, v2 */
/* .line 111 */
} // :cond_1
p1 = this.f;
/* aget p1, p1, v2 */
/* .line 112 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "No available text sizes to choose from."; // const-string v0, "No available text sizes to choose from."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final android.text.StaticLayout a ( java.lang.CharSequence p0, android.text.Layout$Alignment p1, Integer p2 ) {
/* .locals 9 */
/* .line 132 */
v0 = this.i;
/* const/high16 v1, 0x3f800000 # 1.0f */
/* .line 133 */
java.lang.Float .valueOf ( v1 );
final String v2 = "mSpacingMult"; // const-string v2, "mSpacingMult"
/* .line 134 */
c.b.q.w0 .a ( v0,v2,v1 );
/* check-cast v0, Ljava/lang/Float; */
v6 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* .line 135 */
v0 = this.i;
int v1 = 0; // const/4 v1, 0x0
/* .line 136 */
java.lang.Float .valueOf ( v1 );
final String v2 = "mSpacingAdd"; // const-string v2, "mSpacingAdd"
/* .line 137 */
c.b.q.w0 .a ( v0,v2,v1 );
/* check-cast v0, Ljava/lang/Float; */
v7 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* .line 138 */
v0 = this.i;
int v1 = 1; // const/4 v1, 0x1
/* .line 139 */
java.lang.Boolean .valueOf ( v1 );
final String v2 = "mIncludePad"; // const-string v2, "mIncludePad"
/* .line 140 */
c.b.q.w0 .a ( v0,v2,v1 );
/* check-cast v0, Ljava/lang/Boolean; */
v8 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 141 */
/* new-instance v0, Landroid/text/StaticLayout; */
v3 = this.h;
/* move-object v1, v0 */
/* move-object v2, p1 */
/* move v4, p3 */
/* move-object v5, p2 */
/* invoke-direct/range {v1 ..v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
} // .end method
public android.text.StaticLayout a ( java.lang.CharSequence p0, android.text.Layout$Alignment p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .line 118 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 119 */
(( c.b.q.w0 ) p0 ).b ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lc/b/q/w0;->b(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;II)Landroid/text/StaticLayout;
} // :cond_0
/* const/16 p4, 0x10 */
/* if-lt v0, p4, :cond_1 */
/* .line 120 */
(( c.b.q.w0 ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/b/q/w0;->b(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;
/* .line 121 */
} // :cond_1
(( c.b.q.w0 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/b/q/w0;->a(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;
} // .end method
public void a ( ) {
/* .locals 5 */
/* .line 72 */
v0 = (( c.b.q.w0 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/b/q/w0;->h()Z
/* if-nez v0, :cond_0 */
return;
/* .line 73 */
} // :cond_0
/* iget-boolean v0, p0, Lc/b/q/w0;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 74 */
v0 = this.i;
v0 = (( android.widget.TextView ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I
/* if-lez v0, :cond_6 */
v0 = this.i;
v0 = (( android.widget.TextView ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I
/* if-gtz v0, :cond_1 */
/* goto/16 :goto_2 */
/* .line 75 */
} // :cond_1
/* const/16 v1, 0x1d */
int v2 = 0; // const/4 v2, 0x0
/* if-lt v0, v1, :cond_2 */
v0 = this.i;
/* .line 76 */
v0 = (( android.widget.TextView ) v0 ).isHorizontallyScrollable ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->isHorizontallyScrollable()Z
} // :cond_2
v0 = this.i;
/* .line 77 */
java.lang.Boolean .valueOf ( v2 );
final String v3 = "getHorizontallyScrolling"; // const-string v3, "getHorizontallyScrolling"
c.b.q.w0 .b ( v0,v3,v1 );
/* check-cast v0, Ljava/lang/Boolean; */
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* const/high16 v0, 0x100000 */
/* .line 78 */
} // :cond_3
v0 = this.i;
/* .line 79 */
v0 = (( android.widget.TextView ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I
v1 = this.i;
v1 = (( android.widget.TextView ) v1 ).getTotalPaddingLeft ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getTotalPaddingLeft()I
/* sub-int/2addr v0, v1 */
v1 = this.i;
/* .line 80 */
v1 = (( android.widget.TextView ) v1 ).getTotalPaddingRight ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getTotalPaddingRight()I
/* sub-int/2addr v0, v1 */
/* .line 81 */
} // :goto_1
v1 = this.i;
v1 = (( android.widget.TextView ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getHeight()I
v3 = this.i;
v3 = (( android.widget.TextView ) v3 ).getCompoundPaddingBottom ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundPaddingBottom()I
/* sub-int/2addr v1, v3 */
v3 = this.i;
/* .line 82 */
v3 = (( android.widget.TextView ) v3 ).getCompoundPaddingTop ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundPaddingTop()I
/* sub-int/2addr v1, v3 */
/* if-lez v0, :cond_6 */
/* if-gtz v1, :cond_4 */
/* .line 83 */
} // :cond_4
v3 = c.b.q.w0.k;
/* monitor-enter v3 */
/* .line 84 */
try { // :try_start_0
v4 = c.b.q.w0.k;
(( android.graphics.RectF ) v4 ).setEmpty ( ); // invoke-virtual {v4}, Landroid/graphics/RectF;->setEmpty()V
/* .line 85 */
v4 = c.b.q.w0.k;
/* int-to-float v0, v0 */
/* iput v0, v4, Landroid/graphics/RectF;->right:F */
/* .line 86 */
v0 = c.b.q.w0.k;
/* int-to-float v1, v1 */
/* iput v1, v0, Landroid/graphics/RectF;->bottom:F */
/* .line 87 */
v0 = c.b.q.w0.k;
v0 = (( c.b.q.w0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/w0;->a(Landroid/graphics/RectF;)I
/* int-to-float v0, v0 */
/* .line 88 */
v1 = this.i;
v1 = (( android.widget.TextView ) v1 ).getTextSize ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getTextSize()F
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 89 */
(( c.b.q.w0 ) p0 ).a ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lc/b/q/w0;->a(IF)V
/* .line 90 */
} // :cond_5
/* monitor-exit v3 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_6
} // :goto_2
return;
} // :cond_7
} // :goto_3
int v0 = 1; // const/4 v0, 0x1
/* .line 91 */
/* iput-boolean v0, p0, Lc/b/q/w0;->b:Z */
return;
} // .end method
public final void a ( Float p0 ) {
/* .locals 3 */
/* .line 96 */
v0 = this.i;
(( android.widget.TextView ) v0 ).getPaint ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
v0 = (( android.text.TextPaint ) v0 ).getTextSize ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F
/* cmpl-float v0, p1, v0 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 97 */
v0 = this.i;
(( android.widget.TextView ) v0 ).getPaint ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) v0 ).setTextSize ( p1 ); // invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V
/* .line 98 */
/* const/16 v0, 0x12 */
int v1 = 0; // const/4 v1, 0x0
/* if-lt p1, v0, :cond_0 */
/* .line 99 */
p1 = this.i;
p1 = (( android.widget.TextView ) p1 ).isInLayout ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->isInLayout()Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 100 */
} // :goto_0
v0 = this.i;
(( android.widget.TextView ) v0 ).getLayout ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 101 */
/* iput-boolean v1, p0, Lc/b/q/w0;->b:Z */
try { // :try_start_0
final String v0 = "nullLayouts"; // const-string v0, "nullLayouts"
/* .line 102 */
c.b.q.w0 .b ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 103 */
v2 = this.i;
/* new-array v1, v1, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v0 ).invoke ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "ACTVAutoSizeHelper"; // const-string v1, "ACTVAutoSizeHelper"
final String v2 = "Failed to invoke TextView#nullLayouts() method"; // const-string v2, "Failed to invoke TextView#nullLayouts() method"
/* .line 104 */
android.util.Log .w ( v1,v2,v0 );
} // :cond_1
} // :goto_1
/* if-nez p1, :cond_2 */
/* .line 105 */
p1 = this.i;
(( android.widget.TextView ) p1 ).requestLayout ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->requestLayout()V
/* .line 106 */
} // :cond_2
p1 = this.i;
(( android.widget.TextView ) p1 ).forceLayout ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->forceLayout()V
/* .line 107 */
} // :goto_2
p1 = this.i;
(( android.widget.TextView ) p1 ).invalidate ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->invalidate()V
} // :cond_3
return;
} // .end method
public final void a ( Float p0, Float p1, Float p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
final String v0 = "px) is less or equal to (0px)"; // const-string v0, "px) is less or equal to (0px)"
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v2, p1, v1 */
/* if-lez v2, :cond_2 */
/* cmpg-float v2, p2, p1 */
/* if-lez v2, :cond_1 */
/* cmpg-float v1, p3, v1 */
/* if-lez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 64 */
/* iput v0, p0, Lc/b/q/w0;->a:I */
/* .line 65 */
/* iput p1, p0, Lc/b/q/w0;->d:F */
/* .line 66 */
/* iput p2, p0, Lc/b/q/w0;->e:F */
/* .line 67 */
/* iput p3, p0, Lc/b/q/w0;->c:F */
int p1 = 0; // const/4 p1, 0x0
/* .line 68 */
/* iput-boolean p1, p0, Lc/b/q/w0;->g:Z */
return;
/* .line 69 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "The auto-size step granularity ("; // const-string v1, "The auto-size step granularity ("
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 70 */
} // :cond_1
/* new-instance p3, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Maximum auto-size text size ("; // const-string v1, "Maximum auto-size text size ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String p2 = "px) is less or equal to minimum auto-size text size ("; // const-string p2, "px) is less or equal to minimum auto-size text size ("
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String p1 = "px)"; // const-string p1, "px)"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p3 */
/* .line 71 */
} // :cond_2
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Minimum auto-size text size ("; // const-string v1, "Minimum auto-size text size ("
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public void a ( Integer p0 ) {
/* .locals 2 */
/* .line 113 */
v0 = this.h;
/* if-nez v0, :cond_0 */
/* .line 114 */
/* new-instance v0, Landroid/text/TextPaint; */
/* invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V */
this.h = v0;
/* .line 115 */
} // :cond_0
(( android.text.TextPaint ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->reset()V
/* .line 116 */
} // :goto_0
v0 = this.h;
v1 = this.i;
(( android.widget.TextView ) v1 ).getPaint ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V
/* .line 117 */
v0 = this.h;
/* int-to-float p1, p1 */
(( android.text.TextPaint ) v0 ).setTextSize ( p1 ); // invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V
return;
} // .end method
public void a ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .line 92 */
v0 = this.j;
/* if-nez v0, :cond_0 */
/* .line 93 */
android.content.res.Resources .getSystem ( );
/* .line 94 */
} // :cond_0
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 95 */
} // :goto_0
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
p1 = android.util.TypedValue .applyDimension ( p1,p2,v0 );
(( c.b.q.w0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/w0;->a(F)V
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 27 */
v0 = (( c.b.q.w0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/w0;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 28 */
v0 = this.j;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* int-to-float p1, p1 */
/* .line 29 */
p1 = android.util.TypedValue .applyDimension ( p4,p1,v0 );
/* int-to-float p2, p2 */
/* .line 30 */
p2 = android.util.TypedValue .applyDimension ( p4,p2,v0 );
/* int-to-float p3, p3 */
/* .line 31 */
p3 = android.util.TypedValue .applyDimension ( p4,p3,v0 );
/* .line 32 */
(( c.b.q.w0 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/b/q/w0;->a(FFF)V
/* .line 33 */
p1 = (( c.b.q.w0 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/q/w0;->i()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 34 */
(( c.b.q.w0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/w0;->a()V
} // :cond_0
return;
} // .end method
public final void a ( android.content.res.TypedArray p0 ) {
/* .locals 4 */
/* .line 49 */
v0 = (( android.content.res.TypedArray ) p1 ).length ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->length()I
/* .line 50 */
/* new-array v1, v0, [I */
/* if-lez v0, :cond_1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
int v3 = -1; // const/4 v3, -0x1
/* .line 51 */
v3 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* aput v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 52 */
} // :cond_0
(( c.b.q.w0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/w0;->a([I)[I
this.f = p1;
/* .line 53 */
(( c.b.q.w0 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/w0;->j()Z
} // :cond_1
return;
} // .end method
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 6 */
/* .line 1 */
v0 = this.j;
v1 = c.b.j.AppCompatTextView;
int v2 = 0; // const/4 v2, 0x0
(( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1, p2, v2 ); // invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 2 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
p2 = (( android.content.res.TypedArray ) p1 ).getInt ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p2, p0, Lc/b/q/w0;->a:I */
/* .line 4 */
} // :cond_0
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
/* const/high16 v0, -0x40800000 # -1.0f */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
p2 = (( android.content.res.TypedArray ) p1 ).getDimension ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F
} // :cond_1
/* const/high16 p2, -0x40800000 # -1.0f */
/* .line 6 */
} // :goto_0
v1 = (( android.content.res.TypedArray ) p1 ).hasValue ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
v1 = (( android.content.res.TypedArray ) p1 ).getDimension ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F
} // :cond_2
/* const/high16 v1, -0x40800000 # -1.0f */
/* .line 8 */
} // :goto_1
v3 = (( android.content.res.TypedArray ) p1 ).hasValue ( v3 ); // invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 9 */
v3 = (( android.content.res.TypedArray ) p1 ).getDimension ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F
} // :cond_3
/* const/high16 v3, -0x40800000 # -1.0f */
/* .line 10 */
} // :goto_2
v4 = (( android.content.res.TypedArray ) p1 ).hasValue ( v4 ); // invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 11 */
v4 = (( android.content.res.TypedArray ) p1 ).getResourceId ( v4, v2 ); // invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* if-lez v4, :cond_4 */
/* .line 12 */
(( android.content.res.TypedArray ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;
/* .line 13 */
(( android.content.res.Resources ) v5 ).obtainTypedArray ( v4 ); // invoke-virtual {v5, v4}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;
/* .line 14 */
(( c.b.q.w0 ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Lc/b/q/w0;->a(Landroid/content/res/TypedArray;)V
/* .line 15 */
(( android.content.res.TypedArray ) v4 ).recycle ( ); // invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V
/* .line 16 */
} // :cond_4
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 17 */
p1 = (( c.b.q.w0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/w0;->k()Z
if ( p1 != null) { // if-eqz p1, :cond_9
/* .line 18 */
/* iget p1, p0, Lc/b/q/w0;->a:I */
int v2 = 1; // const/4 v2, 0x1
/* if-ne p1, v2, :cond_a */
/* .line 19 */
/* iget-boolean p1, p0, Lc/b/q/w0;->g:Z */
/* if-nez p1, :cond_8 */
/* .line 20 */
p1 = this.j;
/* .line 21 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
int v2 = 2; // const/4 v2, 0x2
/* cmpl-float v4, v1, v0 */
/* if-nez v4, :cond_5 */
/* const/high16 v1, 0x41400000 # 12.0f */
/* .line 22 */
v1 = android.util.TypedValue .applyDimension ( v2,v1,p1 );
} // :cond_5
/* cmpl-float v4, v3, v0 */
/* if-nez v4, :cond_6 */
/* const/high16 v3, 0x42e00000 # 112.0f */
/* .line 23 */
v3 = android.util.TypedValue .applyDimension ( v2,v3,p1 );
} // :cond_6
/* cmpl-float p1, p2, v0 */
/* if-nez p1, :cond_7 */
/* const/high16 p2, 0x3f800000 # 1.0f */
/* .line 24 */
} // :cond_7
(( c.b.q.w0 ) p0 ).a ( v1, v3, p2 ); // invoke-virtual {p0, v1, v3, p2}, Lc/b/q/w0;->a(FFF)V
/* .line 25 */
} // :cond_8
(( c.b.q.w0 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/q/w0;->i()Z
/* .line 26 */
} // :cond_9
/* iput v2, p0, Lc/b/q/w0;->a:I */
} // :cond_a
} // :goto_3
return;
} // .end method
public void a ( Integer[] p0, Integer p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 35 */
v0 = (( c.b.q.w0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/w0;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 36 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_3 */
/* .line 37 */
/* new-array v2, v0, [I */
/* if-nez p2, :cond_0 */
/* .line 38 */
java.util.Arrays .copyOf ( p1,v0 );
/* .line 39 */
} // :cond_0
v3 = this.j;
/* .line 40 */
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getDisplayMetrics ( ); // invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 41 */
/* aget v4, p1, v1 */
/* int-to-float v4, v4 */
v4 = android.util.TypedValue .applyDimension ( p2,v4,v3 );
v4 = java.lang.Math .round ( v4 );
/* aput v4, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 42 */
} // :cond_1
} // :goto_1
(( c.b.q.w0 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/b/q/w0;->a([I)[I
this.f = p2;
/* .line 43 */
p2 = (( c.b.q.w0 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/w0;->j()Z
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 44 */
} // :cond_2
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "None of the preset sizes is valid: "; // const-string v1, "None of the preset sizes is valid: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 45 */
java.util.Arrays .toString ( p1 );
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 46 */
} // :cond_3
/* iput-boolean v1, p0, Lc/b/q/w0;->g:Z */
/* .line 47 */
} // :goto_2
p1 = (( c.b.q.w0 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/q/w0;->i()Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 48 */
(( c.b.q.w0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/w0;->a()V
} // :cond_4
return;
} // .end method
public final Boolean a ( Integer p0, android.graphics.RectF p1 ) {
/* .locals 5 */
/* .line 122 */
v0 = this.i;
(( android.widget.TextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
/* .line 123 */
v1 = this.i;
(( android.widget.TextView ) v1 ).getTransformationMethod ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 124 */
v2 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_0
/* move-object v0, v1 */
/* .line 125 */
} // :cond_0
/* const/16 v2, 0x10 */
int v3 = -1; // const/4 v3, -0x1
/* if-lt v1, v2, :cond_1 */
v1 = this.i;
v1 = (( android.widget.TextView ) v1 ).getMaxLines ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getMaxLines()I
} // :cond_1
int v1 = -1; // const/4 v1, -0x1
/* .line 126 */
} // :goto_0
(( c.b.q.w0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/w0;->a(I)V
/* .line 127 */
p1 = this.i;
v2 = android.text.Layout$Alignment.ALIGN_NORMAL;
final String v4 = "getLayoutAlignment"; // const-string v4, "getLayoutAlignment"
c.b.q.w0 .b ( p1,v4,v2 );
/* check-cast p1, Landroid/text/Layout$Alignment; */
/* .line 128 */
/* iget v2, p2, Landroid/graphics/RectF;->right:F */
v2 = java.lang.Math .round ( v2 );
(( c.b.q.w0 ) p0 ).a ( v0, p1, v2, v1 ); // invoke-virtual {p0, v0, p1, v2, v1}, Lc/b/q/w0;->a(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;II)Landroid/text/StaticLayout;
int v2 = 0; // const/4 v2, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-eq v1, v3, :cond_3 */
/* .line 129 */
v3 = (( android.text.StaticLayout ) p1 ).getLineCount ( ); // invoke-virtual {p1}, Landroid/text/StaticLayout;->getLineCount()I
/* if-gt v3, v1, :cond_2 */
/* .line 130 */
v1 = (( android.text.StaticLayout ) p1 ).getLineCount ( ); // invoke-virtual {p1}, Landroid/text/StaticLayout;->getLineCount()I
/* sub-int/2addr v1, v4 */
v0 = v1 = (( android.text.StaticLayout ) p1 ).getLineEnd ( v1 ); // invoke-virtual {p1, v1}, Landroid/text/StaticLayout;->getLineEnd(I)I
/* if-eq v1, v0, :cond_3 */
} // :cond_2
/* .line 131 */
} // :cond_3
p1 = (( android.text.StaticLayout ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/text/StaticLayout;->getHeight()I
/* int-to-float p1, p1 */
/* iget p2, p2, Landroid/graphics/RectF;->bottom:F */
/* cmpl-float p1, p1, p2 */
/* if-lez p1, :cond_4 */
} // :cond_4
} // .end method
public final a ( Integer[] p0 ) {
/* .locals 6 */
/* .line 54 */
/* array-length v0, p1 */
/* if-nez v0, :cond_0 */
/* .line 55 */
} // :cond_0
java.util.Arrays .sort ( p1 );
/* .line 56 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_2 */
/* .line 57 */
/* aget v4, p1, v3 */
/* if-lez v4, :cond_1 */
/* .line 58 */
java.lang.Integer .valueOf ( v4 );
v5 = java.util.Collections .binarySearch ( v1,v5 );
/* if-gez v5, :cond_1 */
/* .line 59 */
java.lang.Integer .valueOf ( v4 );
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 60 */
v3 = } // :cond_2
/* if-ne v0, v3, :cond_3 */
/* .line 61 */
p1 = } // :cond_3
/* .line 62 */
/* new-array v0, p1, [I */
} // :goto_1
/* if-ge v2, p1, :cond_4 */
/* .line 63 */
/* check-cast v3, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aput v3, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
} // .end method
public final android.text.StaticLayout b ( java.lang.CharSequence p0, android.text.Layout$Alignment p1, Integer p2 ) {
/* .locals 9 */
/* .line 33 */
v0 = this.i;
v6 = (( android.widget.TextView ) v0 ).getLineSpacingMultiplier ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F
/* .line 34 */
v0 = this.i;
v7 = (( android.widget.TextView ) v0 ).getLineSpacingExtra ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getLineSpacingExtra()F
/* .line 35 */
v0 = this.i;
v8 = (( android.widget.TextView ) v0 ).getIncludeFontPadding ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getIncludeFontPadding()Z
/* .line 36 */
/* new-instance v0, Landroid/text/StaticLayout; */
v3 = this.h;
/* move-object v1, v0 */
/* move-object v2, p1 */
/* move v4, p3 */
/* move-object v5, p2 */
/* invoke-direct/range {v1 ..v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
} // .end method
public final android.text.StaticLayout b ( java.lang.CharSequence p0, android.text.Layout$Alignment p1, Integer p2, Integer p3 ) {
/* .locals 3 */
v0 = /* .line 17 */
v1 = this.h;
int v2 = 0; // const/4 v2, 0x0
/* .line 18 */
android.text.StaticLayout$Builder .obtain ( p1,v2,v0,v1,p3 );
/* .line 19 */
(( android.text.StaticLayout$Builder ) p1 ).setAlignment ( p2 ); // invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;
p3 = this.i;
/* .line 20 */
p3 = (( android.widget.TextView ) p3 ).getLineSpacingExtra ( ); // invoke-virtual {p3}, Landroid/widget/TextView;->getLineSpacingExtra()F
v0 = this.i;
/* .line 21 */
v0 = (( android.widget.TextView ) v0 ).getLineSpacingMultiplier ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F
/* .line 22 */
(( android.text.StaticLayout$Builder ) p2 ).setLineSpacing ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;
p3 = this.i;
/* .line 23 */
p3 = (( android.widget.TextView ) p3 ).getIncludeFontPadding ( ); // invoke-virtual {p3}, Landroid/widget/TextView;->getIncludeFontPadding()Z
(( android.text.StaticLayout$Builder ) p2 ).setIncludePad ( p3 ); // invoke-virtual {p2, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;
p3 = this.i;
/* .line 24 */
p3 = (( android.widget.TextView ) p3 ).getBreakStrategy ( ); // invoke-virtual {p3}, Landroid/widget/TextView;->getBreakStrategy()I
(( android.text.StaticLayout$Builder ) p2 ).setBreakStrategy ( p3 ); // invoke-virtual {p2, p3}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;
p3 = this.i;
/* .line 25 */
p3 = (( android.widget.TextView ) p3 ).getHyphenationFrequency ( ); // invoke-virtual {p3}, Landroid/widget/TextView;->getHyphenationFrequency()I
(( android.text.StaticLayout$Builder ) p2 ).setHyphenationFrequency ( p3 ); // invoke-virtual {p2, p3}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;
int p3 = -1; // const/4 p3, -0x1
/* if-ne p4, p3, :cond_0 */
/* const p4, 0x7fffffff */
/* .line 26 */
} // :cond_0
(( android.text.StaticLayout$Builder ) p2 ).setMaxLines ( p4 ); // invoke-virtual {p2, p4}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;
/* .line 27 */
try { // :try_start_0
/* const/16 p3, 0x1d */
/* if-lt p2, p3, :cond_1 */
p2 = this.i;
/* .line 28 */
(( android.widget.TextView ) p2 ).getTextDirectionHeuristic ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->getTextDirectionHeuristic()Landroid/text/TextDirectionHeuristic;
} // :cond_1
p2 = this.i;
final String p3 = "getTextDirectionHeuristic"; // const-string p3, "getTextDirectionHeuristic"
p4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
/* .line 29 */
c.b.q.w0 .b ( p2,p3,p4 );
/* check-cast p2, Landroid/text/TextDirectionHeuristic; */
/* .line 30 */
} // :goto_0
(( android.text.StaticLayout$Builder ) p1 ).setTextDirection ( p2 ); // invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p2 = "ACTVAutoSizeHelper"; // const-string p2, "ACTVAutoSizeHelper"
final String p3 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"; // const-string p3, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
/* .line 31 */
android.util.Log .w ( p2,p3 );
/* .line 32 */
} // :goto_1
(( android.text.StaticLayout$Builder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;
} // .end method
public final void b ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
/* iput v0, p0, Lc/b/q/w0;->a:I */
/* const/high16 v1, -0x40800000 # -1.0f */
/* .line 12 */
/* iput v1, p0, Lc/b/q/w0;->d:F */
/* .line 13 */
/* iput v1, p0, Lc/b/q/w0;->e:F */
/* .line 14 */
/* iput v1, p0, Lc/b/q/w0;->c:F */
/* new-array v1, v0, [I */
/* .line 15 */
this.f = v1;
/* .line 16 */
/* iput-boolean v0, p0, Lc/b/q/w0;->b:Z */
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( c.b.q.w0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/w0;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 2 */
p1 = this.j;
/* .line 3 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* const/high16 v0, 0x41400000 # 12.0f */
int v1 = 2; // const/4 v1, 0x2
/* .line 4 */
v0 = android.util.TypedValue .applyDimension ( v1,v0,p1 );
/* const/high16 v2, 0x42e00000 # 112.0f */
/* .line 5 */
p1 = android.util.TypedValue .applyDimension ( v1,v2,p1 );
/* const/high16 v1, 0x3f800000 # 1.0f */
/* .line 6 */
(( c.b.q.w0 ) p0 ).a ( v0, p1, v1 ); // invoke-virtual {p0, v0, p1, v1}, Lc/b/q/w0;->a(FFF)V
/* .line 7 */
p1 = (( c.b.q.w0 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/q/w0;->i()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
(( c.b.q.w0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/w0;->a()V
/* .line 9 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown auto-size text type: "; // const-string v2, "Unknown auto-size text type: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 10 */
} // :cond_1
(( c.b.q.w0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/w0;->b()V
} // :cond_2
} // :goto_0
return;
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/w0;->e:F */
v0 = java.lang.Math .round ( v0 );
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/w0;->d:F */
v0 = java.lang.Math .round ( v0 );
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/w0;->c:F */
v0 = java.lang.Math .round ( v0 );
} // .end method
public f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/w0;->a:I */
} // .end method
public Boolean h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( c.b.q.w0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/w0;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lc/b/q/w0;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean i ( ) {
/* .locals 7 */
/* .line 1 */
v0 = (( c.b.q.w0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/w0;->k()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v0, p0, Lc/b/q/w0;->a:I */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_3 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/q/w0;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.f;
/* array-length v0, v0 */
/* if-nez v0, :cond_2 */
/* .line 3 */
} // :cond_0
/* iget v0, p0, Lc/b/q/w0;->e:F */
/* iget v3, p0, Lc/b/q/w0;->d:F */
/* sub-float/2addr v0, v3 */
/* iget v3, p0, Lc/b/q/w0;->c:F */
/* div-float/2addr v0, v3 */
/* float-to-double v3, v0 */
java.lang.Math .floor ( v3,v4 );
/* move-result-wide v3 */
/* double-to-int v0, v3 */
/* add-int/2addr v0, v2 */
/* .line 4 */
/* new-array v3, v0, [I */
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 5 */
/* iget v4, p0, Lc/b/q/w0;->d:F */
/* int-to-float v5, v1 */
/* iget v6, p0, Lc/b/q/w0;->c:F */
/* mul-float v5, v5, v6 */
/* add-float/2addr v4, v5 */
v4 = java.lang.Math .round ( v4 );
/* aput v4, v3, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
} // :cond_1
(( c.b.q.w0 ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lc/b/q/w0;->a([I)[I
this.f = v0;
/* .line 7 */
} // :cond_2
/* iput-boolean v2, p0, Lc/b/q/w0;->b:Z */
/* .line 8 */
} // :cond_3
/* iput-boolean v1, p0, Lc/b/q/w0;->b:Z */
/* .line 9 */
} // :goto_1
/* iget-boolean v0, p0, Lc/b/q/w0;->b:Z */
} // .end method
public final Boolean j ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.f;
/* array-length v0, v0 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-lez v0, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 2 */
} // :goto_0
/* iput-boolean v3, p0, Lc/b/q/w0;->g:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 3 */
/* iput v2, p0, Lc/b/q/w0;->a:I */
/* .line 4 */
v3 = this.f;
/* aget v1, v3, v1 */
/* int-to-float v1, v1 */
/* iput v1, p0, Lc/b/q/w0;->d:F */
/* sub-int/2addr v0, v2 */
/* .line 5 */
/* aget v0, v3, v0 */
/* int-to-float v0, v0 */
/* iput v0, p0, Lc/b/q/w0;->e:F */
/* const/high16 v0, -0x40800000 # -1.0f */
/* .line 6 */
/* iput v0, p0, Lc/b/q/w0;->c:F */
/* .line 7 */
} // :cond_1
/* iget-boolean v0, p0, Lc/b/q/w0;->g:Z */
} // .end method
public final Boolean k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
/* instance-of v0, v0, Lc/b/q/t; */
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
