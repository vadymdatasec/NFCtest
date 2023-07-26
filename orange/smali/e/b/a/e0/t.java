public abstract class e.b.a.e0.t {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 public static final b;
	 public static volatile android.os.Handler c;
	 /* # direct methods */
	 public static e.b.a.e0.t ( ) {
		 /* .locals 1 */
		 final String v0 = "0123456789abcdef"; // const-string v0, "0123456789abcdef"
		 /* .line 1 */
		 (( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
		 /* const/16 v0, 0x40 */
		 /* new-array v0, v0, [C */
		 /* .line 2 */
		 return;
	 } // .end method
	 public static Integer a ( Float p0 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x11 */
		 /* .line 28 */
		 p0 = 		 e.b.a.e0.t .a ( p0,v0 );
	 } // .end method
	 public static Integer a ( Float p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 29 */
		 p0 = 		 java.lang.Float .floatToIntBits ( p0 );
		 p0 = 		 e.b.a.e0.t .a ( p0,p1 );
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* mul-int/lit8 p1, p1, 0x1f */
		 /* add-int/2addr p1, p0 */
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
		 /* .locals 0 */
		 /* mul-int p0, p0, p1 */
		 /* .line 17 */
		 p1 = 		 e.b.a.e0.t .a ( p2 );
		 /* mul-int p0, p0, p1 */
	 } // .end method
	 public static Integer a ( android.graphics.Bitmap$Config p0 ) {
		 /* .locals 3 */
		 /* if-nez p0, :cond_0 */
		 /* .line 18 */
		 p0 = android.graphics.Bitmap$Config.ARGB_8888;
		 /* .line 19 */
	 } // :cond_0
	 v0 = e.b.a.e0.s.a;
	 p0 = 	 (( android.graphics.Bitmap$Config ) p0 ).ordinal ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap$Config;->ordinal()I
	 /* aget p0, v0, p0 */
	 int v0 = 4; // const/4 v0, 0x4
	 int v1 = 2; // const/4 v1, 0x2
	 int v2 = 1; // const/4 v2, 0x1
	 /* if-eq p0, v2, :cond_3 */
	 /* if-eq p0, v1, :cond_2 */
	 int v2 = 3; // const/4 v2, 0x3
	 /* if-eq p0, v2, :cond_2 */
	 /* if-eq p0, v0, :cond_1 */
} // :cond_1
/* const/16 v0, 0x8 */
} // :cond_2
int v0 = 2; // const/4 v0, 0x2
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // .end method
public static Integer a ( android.graphics.Bitmap p0 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x13 */
} // .end annotation
/* .line 9 */
v0 = (( android.graphics.Bitmap ) p0 ).isRecycled ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z
/* if-nez v0, :cond_1 */
/* .line 10 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 11 */
try { // :try_start_0
p0 = (( android.graphics.Bitmap ) p0 ).getAllocationByteCount ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I
/* :try_end_0 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 12 */
/* :catch_0 */
} // :cond_0
v0 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
p0 = (( android.graphics.Bitmap ) p0 ).getRowBytes ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I
/* mul-int v0, v0, p0 */
/* .line 13 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Cannot obtain size for recycled Bitmap: "; // const-string v2, "Cannot obtain size for recycled Bitmap: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "["; // const-string v2, "["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
v2 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "x"; // const-string v2, "x"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
v2 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "] "; // const-string v2, "] "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 16 */
(( android.graphics.Bitmap ) p0 ).getConfig ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static Integer a ( java.lang.Object p0, Integer p1 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 30 */
} // :cond_0
p0 = (( java.lang.Object ) p0 ).hashCode ( ); // invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
} // :goto_0
p0 = e.b.a.e0.t .a ( p0,p1 );
} // .end method
public static Integer a ( Boolean p0, Integer p1 ) {
/* .locals 0 */
/* .line 31 */
p0 = e.b.a.e0.t .a ( p0,p1 );
} // .end method
public static java.lang.String a ( Object[] p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = e.b.a.e0.t.b;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = e.b.a.e0.t.b;
e.b.a.e0.t .a ( p0,v1 );
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 3 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static java.lang.String a ( Object[] p0, Object[] p1 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
/* array-length v1, p0 */
/* if-ge v0, v1, :cond_0 */
/* .line 5 */
/* aget-byte v1, p0, v0 */
/* and-int/lit16 v1, v1, 0xff */
/* mul-int/lit8 v2, v0, 0x2 */
/* .line 6 */
v3 = e.b.a.e0.t.a;
/* ushr-int/lit8 v4, v1, 0x4 */
/* aget-char v4, v3, v4 */
/* aput-char v4, p1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* and-int/lit8 v1, v1, 0xf */
/* .line 7 */
/* aget-char v1, v3, v1 */
/* aput-char v1, p1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 8 */
} // :cond_0
/* new-instance p0, Ljava/lang/String; */
/* invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V */
} // .end method
public static java.util.List a ( java.util.Collection p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Collection<", */
/* "TT;>;)", */
/* "Ljava/util/List<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 24 */
v1 = /* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 25 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 26 */
} // :cond_1
} // .end method
public static java.util.Queue a ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(I)", */
/* "Ljava/util/Queue<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 23 */
/* new-instance v0, Ljava/util/ArrayDeque; */
/* invoke-direct {v0, p0}, Ljava/util/ArrayDeque;-><init>(I)V */
} // .end method
public static void a ( ) {
/* .locals 2 */
/* .line 21 */
v0 = e.b.a.e0.t .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 22 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "You must call this method on a background thread"; // const-string v1, "You must call this method on a background thread"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .line 20 */
e.b.a.e0.t .c ( );
(( android.os.Handler ) v0 ).post ( p0 ); // invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* if-nez p0, :cond_1 */
/* if-nez p1, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
/* .line 27 */
} // :cond_1
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // .end method
public static void b ( ) {
/* .locals 2 */
/* .line 3 */
v0 = e.b.a.e0.t .e ( );
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "You must call this method on the main thread"; // const-string v1, "You must call this method on the main thread"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void b ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .line 2 */
e.b.a.e0.t .c ( );
(( android.os.Handler ) v0 ).removeCallbacks ( p0 ); // invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
return;
} // .end method
public static Boolean b ( Integer p0 ) {
/* .locals 1 */
/* if-gtz p0, :cond_1 */
/* const/high16 v0, -0x80000000 */
/* if-ne p0, v0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Boolean b ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p0 = e.b.a.e0.t .b ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_0
p0 = e.b.a.e0.t .b ( p1 );
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean b ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* if-nez p0, :cond_1 */
/* if-nez p1, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 5 */
} // :cond_1
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // :goto_0
} // .end method
public static android.os.Handler c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = e.b.a.e0.t.c;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* const-class v0, Le/b/a/e0/t; */
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = e.b.a.e0.t.c;
/* if-nez v1, :cond_0 */
/* .line 4 */
/* new-instance v1, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 5 */
} // :cond_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
/* .line 6 */
} // :cond_1
} // :goto_0
v0 = e.b.a.e0.t.c;
} // .end method
public static Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.e0.t .e ( );
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public static Boolean e ( ) {
/* .locals 2 */
/* .line 1 */
android.os.Looper .myLooper ( );
android.os.Looper .getMainLooper ( );
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
