public class e.b.a.y.x.f1.r implements e.b.a.y.x.f1.g {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.graphics.Bitmap$Config j;
	 /* # instance fields */
	 public final e.b.a.y.x.f1.s a;
	 public final java.util.Set b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Landroid/graphics/Bitmap$Config;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.f1.p c;
public Long d;
public Long e;
public Integer f;
public Integer g;
public Integer h;
public Integer i;
/* # direct methods */
public static e.b.a.y.x.f1.r ( ) {
/* .locals 1 */
/* .line 1 */
v0 = android.graphics.Bitmap$Config.ARGB_8888;
return;
} // .end method
public e.b.a.y.x.f1.r ( ) {
/* .locals 2 */
/* .line 6 */
e.b.a.y.x.f1.r .g ( );
e.b.a.y.x.f1.r .f ( );
/* invoke-direct {p0, p1, p2, v0, v1}, Le/b/a/y/x/f1/r;-><init>(JLe/b/a/y/x/f1/s;Ljava/util/Set;)V */
return;
} // .end method
public e.b.a.y.x.f1.r ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(J", */
/* "Le/b/a/y/x/f1/s;", */
/* "Ljava/util/Set<", */
/* "Landroid/graphics/Bitmap$Config;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* iput-wide p1, p0, Le/b/a/y/x/f1/r;->d:J */
/* .line 3 */
this.a = p3;
/* .line 4 */
this.b = p4;
/* .line 5 */
/* new-instance p1, Le/b/a/y/x/f1/q; */
/* invoke-direct {p1}, Le/b/a/y/x/f1/q;-><init>()V */
this.c = p1;
return;
} // .end method
public static void a ( android.graphics.Bitmap$Config p0 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1a */
} // .end annotation
/* .line 28 */
/* const/16 v1, 0x1a */
/* if-ge v0, v1, :cond_0 */
return;
/* .line 29 */
} // :cond_0
v0 = android.graphics.Bitmap$Config.HARDWARE;
/* if-eq p0, v0, :cond_1 */
return;
/* .line 30 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Cannot create a mutable Bitmap with config: "; // const-string v2, "Cannot create a mutable Bitmap with config: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = ".Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"; // const-string p0, ".Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void b ( android.graphics.Bitmap p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x13 */
} // .end annotation
/* .line 3 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
(( android.graphics.Bitmap ) p0 ).setPremultiplied ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/Bitmap;->setPremultiplied(Z)V
} // :cond_0
return;
} // .end method
public static void c ( android.graphics.Bitmap p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 14 */
(( android.graphics.Bitmap ) p0 ).setHasAlpha ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V
/* .line 15 */
e.b.a.y.x.f1.r .b ( p0 );
return;
} // .end method
public static android.graphics.Bitmap d ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
/* .locals 0 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
} // :cond_0
p2 = e.b.a.y.x.f1.r.j;
} // :goto_0
android.graphics.Bitmap .createBitmap ( p0,p1,p2 );
} // .end method
public static java.util.Set f ( ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1a */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Landroid/graphics/Bitmap$Config;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/HashSet; */
android.graphics.Bitmap$Config .values ( );
java.util.Arrays .asList ( v1 );
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 2 */
/* const/16 v2, 0x13 */
/* if-lt v1, v2, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* .line 4 */
} // :cond_0
/* const/16 v2, 0x1a */
/* if-lt v1, v2, :cond_1 */
/* .line 5 */
v1 = android.graphics.Bitmap$Config.HARDWARE;
/* .line 6 */
} // :cond_1
java.util.Collections .unmodifiableSet ( v0 );
} // .end method
public static e.b.a.y.x.f1.s g ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Le/b/a/y/x/f1/x; */
/* invoke-direct {v0}, Le/b/a/y/x/f1/x;-><init>()V */
/* .line 3 */
} // :cond_0
/* new-instance v0, Le/b/a/y/x/f1/e; */
/* invoke-direct {v0}, Le/b/a/y/x/f1/e;-><init>()V */
} // :goto_0
} // .end method
/* # virtual methods */
public android.graphics.Bitmap a ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
/* .locals 1 */
/* .line 25 */
(( e.b.a.y.x.f1.r ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/x/f1/r;->c(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 26 */
(( android.graphics.Bitmap ) v0 ).eraseColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->eraseColor(I)V
/* .line 27 */
} // :cond_0
e.b.a.y.x.f1.r .d ( p1,p2,p3 );
} // :goto_0
} // .end method
public void a ( ) {
/* .locals 2 */
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
int v1 = 3; // const/4 v1, 0x3
/* .line 31 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "clearMemory"; // const-string v1, "clearMemory"
/* .line 32 */
android.util.Log .d ( v0,v1 );
} // :cond_0
/* const-wide/16 v0, 0x0 */
/* .line 33 */
(( e.b.a.y.x.f1.r ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/y/x/f1/r;->a(J)V
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 4 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "InlinedApi" */
/* } */
} // .end annotation
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
int v1 = 3; // const/4 v1, 0x3
/* .line 34 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 35 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "trimMemory, level="; // const-string v2, "trimMemory, level="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
} // :cond_0
/* const/16 v0, 0x28 */
/* if-ge p1, v0, :cond_3 */
/* .line 36 */
/* const/16 v1, 0x17 */
/* const/16 v2, 0x14 */
/* if-lt v0, v1, :cond_1 */
/* if-lt p1, v2, :cond_1 */
} // :cond_1
/* if-ge p1, v2, :cond_2 */
/* const/16 v0, 0xf */
/* if-ne p1, v0, :cond_4 */
/* .line 37 */
} // :cond_2
(( e.b.a.y.x.f1.r ) p0 ).e ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->e()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x2 */
/* div-long/2addr v0, v2 */
(( e.b.a.y.x.f1.r ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/y/x/f1/r;->a(J)V
/* .line 38 */
} // :cond_3
} // :goto_0
(( e.b.a.y.x.f1.r ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->a()V
} // :cond_4
} // :goto_1
return;
} // .end method
public synchronized final void a ( Long p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
/* .line 39 */
} // :goto_0
try { // :try_start_0
/* iget-wide v0, p0, Le/b/a/y/x/f1/r;->e:J */
/* cmp-long v2, v0, p1 */
/* if-lez v2, :cond_3 */
/* .line 40 */
v0 = this.a;
/* if-nez v0, :cond_1 */
final String p1 = "LruBitmapPool"; // const-string p1, "LruBitmapPool"
int p2 = 5; // const/4 p2, 0x5
/* .line 41 */
p1 = android.util.Log .isLoggable ( p1,p2 );
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "LruBitmapPool"; // const-string p1, "LruBitmapPool"
final String p2 = "Size mismatch, resetting"; // const-string p2, "Size mismatch, resetting"
/* .line 42 */
android.util.Log .w ( p1,p2 );
/* .line 43 */
(( e.b.a.y.x.f1.r ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->c()V
} // :cond_0
/* const-wide/16 p1, 0x0 */
/* .line 44 */
/* iput-wide p1, p0, Le/b/a/y/x/f1/r;->e:J */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 45 */
/* monitor-exit p0 */
return;
/* .line 46 */
} // :cond_1
try { // :try_start_1
v1 = this.c;
/* .line 47 */
/* iget-wide v1, p0, Le/b/a/y/x/f1/r;->e:J */
v3 = v3 = this.a;
/* int-to-long v3, v3 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Le/b/a/y/x/f1/r;->e:J */
/* .line 48 */
/* iget v1, p0, Le/b/a/y/x/f1/r;->i:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Le/b/a/y/x/f1/r;->i:I */
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
int v2 = 3; // const/4 v2, 0x3
/* .line 49 */
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
/* .line 50 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Evicting bitmap="; // const-string v3, "Evicting bitmap="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.a;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 51 */
} // :cond_2
(( e.b.a.y.x.f1.r ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->b()V
/* .line 52 */
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 53 */
} // :cond_3
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( android.graphics.Bitmap p0 ) {
/* .locals 6 */
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 1 */
try { // :try_start_0
v0 = (( android.graphics.Bitmap ) p1 ).isRecycled ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z
/* if-nez v0, :cond_4 */
/* .line 2 */
v0 = (( android.graphics.Bitmap ) p1 ).isMutable ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z
int v1 = 2; // const/4 v1, 0x2
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
v0 = /* .line 3 */
/* int-to-long v2, v0 */
/* iget-wide v4, p0, Le/b/a/y/x/f1/r;->d:J */
/* cmp-long v0, v2, v4 */
/* if-gtz v0, :cond_2 */
v0 = this.b;
/* .line 4 */
v0 = (( android.graphics.Bitmap ) p1 ).getConfig ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
/* if-nez v0, :cond_0 */
/* .line 5 */
} // :cond_0
v0 = v0 = this.a;
/* .line 6 */
v2 = this.a;
/* .line 7 */
v2 = this.c;
/* .line 8 */
/* iget v2, p0, Le/b/a/y/x/f1/r;->h:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Le/b/a/y/x/f1/r;->h:I */
/* .line 9 */
/* iget-wide v2, p0, Le/b/a/y/x/f1/r;->e:J */
/* int-to-long v4, v0 */
/* add-long/2addr v2, v4 */
/* iput-wide v2, p0, Le/b/a/y/x/f1/r;->e:J */
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
/* .line 10 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
/* .line 11 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Put bitmap in pool="; // const-string v2, "Put bitmap in pool="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,p1 );
/* .line 12 */
} // :cond_1
(( e.b.a.y.x.f1.r ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->b()V
/* .line 13 */
(( e.b.a.y.x.f1.r ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->d()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 14 */
/* monitor-exit p0 */
return;
} // :cond_2
} // :goto_0
try { // :try_start_1
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
/* .line 15 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
/* .line 16 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Reject bitmap from pool, bitmap: "; // const-string v2, "Reject bitmap from pool, bitmap: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
/* .line 17 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", is mutable: "; // const-string v2, ", is mutable: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
v2 = (( android.graphics.Bitmap ) p1 ).isMutable ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = ", is allowed config: "; // const-string v2, ", is allowed config: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
/* .line 19 */
v2 = (( android.graphics.Bitmap ) p1 ).getConfig ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 20 */
android.util.Log .v ( v0,v1 );
/* .line 21 */
} // :cond_3
(( android.graphics.Bitmap ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 22 */
/* monitor-exit p0 */
return;
/* .line 23 */
} // :cond_4
try { // :try_start_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Cannot pool recycled bitmap"; // const-string v0, "Cannot pool recycled bitmap"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 24 */
} // :cond_5
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "Bitmap must not be null"; // const-string v0, "Bitmap must not be null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public android.graphics.Bitmap b ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
/* .locals 1 */
/* .line 1 */
(( e.b.a.y.x.f1.r ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/x/f1/r;->c(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
/* if-nez v0, :cond_0 */
/* .line 2 */
e.b.a.y.x.f1.r .d ( p1,p2,p3 );
} // :cond_0
} // .end method
public final void b ( ) {
/* .locals 2 */
final String v0 = "LruBitmapPool"; // const-string v0, "LruBitmapPool"
int v1 = 2; // const/4 v1, 0x2
/* .line 5 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( e.b.a.y.x.f1.r ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->c()V
} // :cond_0
return;
} // .end method
public synchronized final android.graphics.Bitmap c ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
/* .locals 5 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
e.b.a.y.x.f1.r .a ( p3 );
/* .line 2 */
v0 = this.a;
if ( p3 != null) { // if-eqz p3, :cond_0
/* move-object v1, p3 */
} // :cond_0
v1 = e.b.a.y.x.f1.r.j;
} // :goto_0
/* if-nez v0, :cond_2 */
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
int v2 = 3; // const/4 v2, 0x3
/* .line 3 */
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
/* .line 4 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Missing bitmap="; // const-string v3, "Missing bitmap="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.a;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 5 */
} // :cond_1
/* iget v1, p0, Le/b/a/y/x/f1/r;->g:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Le/b/a/y/x/f1/r;->g:I */
/* .line 6 */
} // :cond_2
/* iget v1, p0, Le/b/a/y/x/f1/r;->f:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Le/b/a/y/x/f1/r;->f:I */
/* .line 7 */
/* iget-wide v1, p0, Le/b/a/y/x/f1/r;->e:J */
v3 = v3 = this.a;
/* int-to-long v3, v3 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Le/b/a/y/x/f1/r;->e:J */
/* .line 8 */
v1 = this.c;
/* .line 9 */
e.b.a.y.x.f1.r .c ( v0 );
} // :goto_1
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
int v2 = 2; // const/4 v2, 0x2
/* .line 10 */
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_3
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
/* .line 11 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Get bitmap="; // const-string v3, "Get bitmap="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.a;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,p1 );
/* .line 12 */
} // :cond_3
(( e.b.a.y.x.f1.r ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/r;->b()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 13 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void c ( ) {
/* .locals 3 */
/* .line 16 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Hits="; // const-string v1, "Hits="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/f1/r;->f:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", misses="; // const-string v1, ", misses="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/f1/r;->g:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", puts="; // const-string v1, ", puts="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/f1/r;->h:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", evictions="; // const-string v1, ", evictions="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/f1/r;->i:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", currentSize="; // const-string v1, ", currentSize="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Le/b/a/y/x/f1/r;->e:J */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", maxSize="; // const-string v1, ", maxSize="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Le/b/a/y/x/f1/r;->d:J */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = "\nStrategy="; // const-string v1, "\nStrategy="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "LruBitmapPool"; // const-string v1, "LruBitmapPool"
android.util.Log .v ( v1,v0 );
return;
} // .end method
public final void d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/b/a/y/x/f1/r;->d:J */
(( e.b.a.y.x.f1.r ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/y/x/f1/r;->a(J)V
return;
} // .end method
public Long e ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/b/a/y/x/f1/r;->d:J */
/* return-wide v0 */
} // .end method
