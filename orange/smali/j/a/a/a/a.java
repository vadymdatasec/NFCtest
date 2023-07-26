public abstract class j.a.a.a.a extends android.widget.FrameLayout implements android.hardware.Camera$PreviewCallback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public j.a.a.a.i b;
	 public j.a.a.a.g c;
	 public j.a.a.a.k d;
	 public android.graphics.Rect e;
	 public j.a.a.a.d f;
	 public java.lang.Boolean g;
	 public Boolean h;
	 public Boolean i;
	 public Boolean j;
	 public Integer k;
	 public Integer l;
	 public Integer m;
	 public Integer n;
	 public Integer o;
	 public Boolean p;
	 public Integer q;
	 public Boolean r;
	 public Float s;
	 public Integer t;
	 public Float u;
	 /* # direct methods */
	 public j.a.a.a.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lj/a/a/a/a;->h:Z */
		 /* .line 3 */
		 /* iput-boolean p1, p0, Lj/a/a/a/a;->i:Z */
		 /* .line 4 */
		 /* iput-boolean p1, p0, Lj/a/a/a/a;->j:Z */
		 /* .line 5 */
		 (( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
		 p1 = 		 (( android.content.res.Resources ) p1 ).getColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I
		 /* iput p1, p0, Lj/a/a/a/a;->k:I */
		 /* .line 6 */
		 (( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
		 p1 = 		 (( android.content.res.Resources ) p1 ).getColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I
		 /* iput p1, p0, Lj/a/a/a/a;->l:I */
		 /* .line 7 */
		 (( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
		 p1 = 		 (( android.content.res.Resources ) p1 ).getColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I
		 /* iput p1, p0, Lj/a/a/a/a;->m:I */
		 /* .line 8 */
		 (( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
		 p1 = 		 (( android.content.res.Resources ) p1 ).getInteger ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I
		 /* iput p1, p0, Lj/a/a/a/a;->n:I */
		 /* .line 9 */
		 (( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
		 p1 = 		 (( android.content.res.Resources ) p1 ).getInteger ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I
		 /* iput p1, p0, Lj/a/a/a/a;->o:I */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 10 */
		 /* iput-boolean p1, p0, Lj/a/a/a/a;->p:Z */
		 /* .line 11 */
		 /* iput p1, p0, Lj/a/a/a/a;->q:I */
		 /* .line 12 */
		 /* iput-boolean p1, p0, Lj/a/a/a/a;->r:Z */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* .line 13 */
		 /* iput v0, p0, Lj/a/a/a/a;->s:F */
		 /* .line 14 */
		 /* iput p1, p0, Lj/a/a/a/a;->t:I */
		 /* const p1, 0x3dcccccd # 0.1f */
		 /* .line 15 */
		 /* iput p1, p0, Lj/a/a/a/a;->u:F */
		 /* .line 16 */
		 (( j.a.a.a.a ) p0 ).a ( ); // invoke-virtual {p0}, Lj/a/a/a/a;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized android.graphics.Rect a ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 /* monitor-enter p0 */
		 /* .line 16 */
		 try { // :try_start_0
			 v0 = this.e;
			 /* if-nez v0, :cond_4 */
			 /* .line 17 */
			 v0 = this.d;
			 /* .line 18 */
			 v1 = 			 v1 = this.d;
			 /* .line 19 */
			 v2 = 			 v2 = this.d;
			 if ( v0 != null) { // if-eqz v0, :cond_3
				 if ( v1 != null) { // if-eqz v1, :cond_3
					 /* if-nez v2, :cond_0 */
					 /* .line 20 */
				 } // :cond_0
				 /* new-instance v3, Landroid/graphics/Rect; */
				 /* invoke-direct {v3, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V */
				 /* if-ge p1, v1, :cond_1 */
				 /* .line 21 */
				 /* iget v0, v3, Landroid/graphics/Rect;->left:I */
				 /* mul-int v0, v0, p1 */
				 /* div-int/2addr v0, v1 */
				 /* iput v0, v3, Landroid/graphics/Rect;->left:I */
				 /* .line 22 */
				 /* iget v0, v3, Landroid/graphics/Rect;->right:I */
				 /* mul-int v0, v0, p1 */
				 /* div-int/2addr v0, v1 */
				 /* iput v0, v3, Landroid/graphics/Rect;->right:I */
			 } // :cond_1
			 /* if-ge p2, v2, :cond_2 */
			 /* .line 23 */
			 /* iget p1, v3, Landroid/graphics/Rect;->top:I */
			 /* mul-int p1, p1, p2 */
			 /* div-int/2addr p1, v2 */
			 /* iput p1, v3, Landroid/graphics/Rect;->top:I */
			 /* .line 24 */
			 /* iget p1, v3, Landroid/graphics/Rect;->bottom:I */
			 /* mul-int p1, p1, p2 */
			 /* div-int/2addr p1, v2 */
			 /* iput p1, v3, Landroid/graphics/Rect;->bottom:I */
			 /* .line 25 */
		 } // :cond_2
		 this.e = v3;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 } // :cond_3
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 26 */
/* monitor-exit p0 */
/* .line 27 */
} // :cond_4
} // :goto_1
try { // :try_start_1
p1 = this.e;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public j.a.a.a.k a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Lj/a/a/a/n; */
/* invoke-direct {v0, p1}, Lj/a/a/a/n;-><init>(Landroid/content/Context;)V */
/* .line 3 */
/* iget p1, p0, Lj/a/a/a/a;->l:I */
(( j.a.a.a.n ) v0 ).setBorderColor ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderColor(I)V
/* .line 4 */
/* iget p1, p0, Lj/a/a/a/a;->k:I */
(( j.a.a.a.n ) v0 ).setLaserColor ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setLaserColor(I)V
/* .line 5 */
/* iget-boolean p1, p0, Lj/a/a/a/a;->j:Z */
(( j.a.a.a.n ) v0 ).setLaserEnabled ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setLaserEnabled(Z)V
/* .line 6 */
/* iget p1, p0, Lj/a/a/a/a;->n:I */
(( j.a.a.a.n ) v0 ).setBorderStrokeWidth ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderStrokeWidth(I)V
/* .line 7 */
/* iget p1, p0, Lj/a/a/a/a;->o:I */
(( j.a.a.a.n ) v0 ).setBorderLineLength ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderLineLength(I)V
/* .line 8 */
/* iget p1, p0, Lj/a/a/a/a;->m:I */
(( j.a.a.a.n ) v0 ).setMaskColor ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setMaskColor(I)V
/* .line 9 */
/* iget-boolean p1, p0, Lj/a/a/a/a;->p:Z */
(( j.a.a.a.n ) v0 ).setBorderCornerRounded ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderCornerRounded(Z)V
/* .line 10 */
/* iget p1, p0, Lj/a/a/a/a;->q:I */
(( j.a.a.a.n ) v0 ).setBorderCornerRadius ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderCornerRadius(I)V
/* .line 11 */
/* iget-boolean p1, p0, Lj/a/a/a/a;->r:Z */
(( j.a.a.a.n ) v0 ).setSquareViewFinder ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setSquareViewFinder(Z)V
/* .line 12 */
/* iget p1, p0, Lj/a/a/a/a;->t:I */
(( j.a.a.a.n ) v0 ).setViewFinderOffset ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/n;->setViewFinderOffset(I)V
} // .end method
public final void a ( ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
(( j.a.a.a.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lj/a/a/a/a;->a(Landroid/content/Context;)Lj/a/a/a/k;
this.d = v0;
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 14 */
/* new-instance v0, Lj/a/a/a/d; */
/* invoke-direct {v0, p0}, Lj/a/a/a/d;-><init>(Lj/a/a/a/a;)V */
this.f = v0;
/* .line 15 */
} // :cond_0
v0 = this.f;
(( j.a.a.a.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/d;->a(I)V
return;
} // .end method
public a ( Object[] p0, android.hardware.Camera p1 ) {
/* .locals 11 */
/* .line 28 */
(( android.hardware.Camera ) p2 ).getParameters ( ); // invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
/* .line 29 */
(( android.hardware.Camera$Parameters ) p2 ).getPreviewSize ( ); // invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;
/* .line 30 */
/* iget v0, p2, Landroid/hardware/Camera$Size;->width:I */
/* .line 31 */
/* iget p2, p2, Landroid/hardware/Camera$Size;->height:I */
/* .line 32 */
v1 = (( j.a.a.a.a ) p0 ).getRotationCount ( ); // invoke-virtual {p0}, Lj/a/a/a/a;->getRotationCount()I
int v2 = 1; // const/4 v2, 0x1
/* if-eq v1, v2, :cond_0 */
int v3 = 3; // const/4 v3, 0x3
/* if-ne v1, v3, :cond_3 */
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v1, :cond_3 */
/* .line 33 */
/* array-length v5, p1 */
/* new-array v5, v5, [B */
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
/* if-ge v6, p2, :cond_2 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_2
/* if-ge v7, v0, :cond_1 */
/* mul-int v8, v7, p2 */
/* add-int/2addr v8, p2 */
/* sub-int/2addr v8, v6 */
/* sub-int/2addr v8, v2 */
/* mul-int v9, v6, v0 */
/* add-int/2addr v9, v7 */
/* .line 34 */
/* aget-byte v9, p1, v9 */
/* aput-byte v9, v5, v8 */
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_1
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_2
/* add-int/lit8 v4, v4, 0x1 */
/* move-object p1, v5 */
/* move v10, v0 */
/* move v0, p2 */
/* move p2, v10 */
} // :cond_3
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( j.a.a.a.g ) v0 ).d ( ); // invoke-virtual {v0}, Lj/a/a/a/g;->d()V
} // :cond_0
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = j.a.a.a.h .a ( );
(( j.a.a.a.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lj/a/a/a/a;->a(I)V
return;
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
(( j.a.a.a.g ) v0 ).e ( ); // invoke-virtual {v0}, Lj/a/a/a/g;->e()V
/* .line 3 */
v0 = this.c;
(( j.a.a.a.g ) v0 ).b ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Lj/a/a/a/g;->b(Lj/a/a/a/i;Landroid/hardware/Camera$PreviewCallback;)V
/* .line 4 */
v0 = this.b;
v0 = this.a;
(( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
/* .line 5 */
this.b = v1;
/* .line 6 */
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
(( android.os.HandlerThread ) v0 ).quit ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z
/* .line 8 */
this.f = v1;
} // :cond_1
return;
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( j.a.a.a.g ) v0 ).e ( ); // invoke-virtual {v0}, Lj/a/a/a/g;->e()V
} // :cond_0
return;
} // .end method
public Boolean getFlash ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = j.a.a.a.h .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v0 = this.a;
(( android.hardware.Camera ) v0 ).getParameters ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
/* .line 3 */
(( android.hardware.Camera$Parameters ) v0 ).getFlashMode ( ); // invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;
final String v2 = "torch"; // const-string v2, "torch"
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // .end method
public Integer getRotationCount ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = (( j.a.a.a.g ) v0 ).getDisplayOrientation ( ); // invoke-virtual {v0}, Lj/a/a/a/g;->getDisplayOrientation()I
/* .line 2 */
/* div-int/lit8 v0, v0, 0x5a */
} // .end method
public void setAspectTolerance ( Float p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->u:F */
return;
} // .end method
public void setAutoFocus ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/a;->h:Z */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( j.a.a.a.g ) v0 ).setAutoFocus ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/g;->setAutoFocus(Z)V
} // :cond_0
return;
} // .end method
public void setBorderAlpha ( Float p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->s:F */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setBorderColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->l:I */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setBorderCornerRadius ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->q:I */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setBorderLineLength ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->o:I */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setBorderStrokeWidth ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->n:I */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setFlash ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
java.lang.Boolean .valueOf ( p1 );
this.g = v0;
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.a;
v0 = j.a.a.a.h .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 3 */
v0 = this.b;
v0 = this.a;
(( android.hardware.Camera ) v0 ).getParameters ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.hardware.Camera$Parameters ) v0 ).getFlashMode ( ); // invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;
final String v1 = "torch"; // const-string v1, "torch"
p1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
return;
/* .line 5 */
} // :cond_0
(( android.hardware.Camera$Parameters ) v0 ).setFlashMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V
/* .line 6 */
} // :cond_1
(( android.hardware.Camera$Parameters ) v0 ).getFlashMode ( ); // invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;
final String v1 = "off"; // const-string v1, "off"
p1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
return;
/* .line 7 */
} // :cond_2
(( android.hardware.Camera$Parameters ) v0 ).setFlashMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V
/* .line 8 */
} // :goto_0
p1 = this.b;
p1 = this.a;
(( android.hardware.Camera ) p1 ).setParameters ( v0 ); // invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
} // :cond_3
return;
} // .end method
public void setIsBorderCornerRounded ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/a;->p:Z */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setLaserColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->k:I */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setLaserEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/a;->j:Z */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setMaskColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/a;->m:I */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setShouldScaleToFill ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/a;->i:Z */
return;
} // .end method
public void setSquareViewFinder ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/a;->r:Z */
/* .line 2 */
v0 = this.d;
/* .line 3 */
p1 = this.d;
return;
} // .end method
public void setupCameraPreview ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 2 */
(( j.a.a.a.a ) p0 ).setupLayout ( p1 ); // invoke-virtual {p0, p1}, Lj/a/a/a/a;->setupLayout(Lj/a/a/a/i;)V
/* .line 3 */
p1 = this.d;
/* .line 4 */
p1 = this.g;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
(( j.a.a.a.a ) p0 ).setFlash ( p1 ); // invoke-virtual {p0, p1}, Lj/a/a/a/a;->setFlash(Z)V
/* .line 6 */
} // :cond_0
/* iget-boolean p1, p0, Lj/a/a/a/a;->h:Z */
(( j.a.a.a.a ) p0 ).setAutoFocus ( p1 ); // invoke-virtual {p0, p1}, Lj/a/a/a/a;->setAutoFocus(Z)V
} // :cond_1
return;
} // .end method
public final void setupLayout ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.widget.FrameLayout ) p0 ).removeAllViews ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->removeAllViews()V
/* .line 2 */
/* new-instance v0, Lj/a/a/a/g; */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1, p0}, Lj/a/a/a/g;-><init>(Landroid/content/Context;Lj/a/a/a/i;Landroid/hardware/Camera$PreviewCallback;)V */
this.c = v0;
/* .line 3 */
/* iget p1, p0, Lj/a/a/a/a;->u:F */
(( j.a.a.a.g ) v0 ).setAspectTolerance ( p1 ); // invoke-virtual {v0, p1}, Lj/a/a/a/g;->setAspectTolerance(F)V
/* .line 4 */
p1 = this.c;
/* iget-boolean v0, p0, Lj/a/a/a/a;->i:Z */
(( j.a.a.a.g ) p1 ).setShouldScaleToFill ( v0 ); // invoke-virtual {p1, v0}, Lj/a/a/a/g;->setShouldScaleToFill(Z)V
/* .line 5 */
/* iget-boolean p1, p0, Lj/a/a/a/a;->i:Z */
/* if-nez p1, :cond_0 */
/* .line 6 */
/* new-instance p1, Landroid/widget/RelativeLayout; */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
/* invoke-direct {p1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
/* const/16 v0, 0x11 */
/* .line 7 */
(( android.widget.RelativeLayout ) p1 ).setGravity ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setGravity(I)V
/* const/high16 v0, -0x1000000 */
/* .line 8 */
(( android.widget.RelativeLayout ) p1 ).setBackgroundColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
/* .line 9 */
v0 = this.c;
(( android.widget.RelativeLayout ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
/* .line 10 */
(( android.widget.FrameLayout ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 11 */
} // :cond_0
p1 = this.c;
(( android.widget.FrameLayout ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 12 */
} // :goto_0
p1 = this.d;
/* instance-of v0, p1, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 13 */
/* check-cast p1, Landroid/view/View; */
(( android.widget.FrameLayout ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
return;
/* .line 14 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "IViewFinder object returned by \'createViewFinderView()\' should be instance of android.view.View"; // const-string v0, "IViewFinder object returned by \'createViewFinderView()\' should be instance of android.view.View"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
