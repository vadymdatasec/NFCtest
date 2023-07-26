public class j.a.a.a.g extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public j.a.a.a.i b;
	 public android.os.Handler c;
	 public Boolean d;
	 public Boolean e;
	 public Boolean f;
	 public Boolean g;
	 public android.hardware.Camera$PreviewCallback h;
	 public Float i;
	 public java.lang.Runnable j;
	 public android.hardware.Camera$AutoFocusCallback k;
	 /* # direct methods */
	 public j.a.a.a.g ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lj/a/a/a/g;->d:Z */
		 /* .line 3 */
		 /* iput-boolean p1, p0, Lj/a/a/a/g;->e:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lj/a/a/a/g;->f:Z */
		 /* .line 5 */
		 /* iput-boolean p1, p0, Lj/a/a/a/g;->g:Z */
		 /* const p1, 0x3dcccccd # 0.1f */
		 /* .line 6 */
		 /* iput p1, p0, Lj/a/a/a/g;->i:F */
		 /* .line 7 */
		 /* new-instance p1, Lj/a/a/a/e; */
		 /* invoke-direct {p1, p0}, Lj/a/a/a/e;-><init>(Lj/a/a/a/g;)V */
		 this.j = p1;
		 /* .line 8 */
		 /* new-instance p1, Lj/a/a/a/f; */
		 /* invoke-direct {p1, p0}, Lj/a/a/a/f;-><init>(Lj/a/a/a/g;)V */
		 this.k = p1;
		 /* .line 9 */
		 (( j.a.a.a.g ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lj/a/a/a/g;->a(Lj/a/a/a/i;Landroid/hardware/Camera$PreviewCallback;)V
		 return;
	 } // .end method
	 public static j.a.a.a.i a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.b;
	 } // .end method
	 public static Boolean b ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* iget-boolean p0, p0, Lj/a/a/a/g;->d:Z */
	 } // .end method
	 public static Boolean c ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* iget-boolean p0, p0, Lj/a/a/a/g;->e:Z */
	 } // .end method
	 public static Boolean d ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* iget-boolean p0, p0, Lj/a/a/a/g;->f:Z */
	 } // .end method
	 public static void e ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( j.a.a.a.g ) p0 ).b ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->b()V
		 return;
	 } // .end method
	 private android.hardware.Camera$Size getOptimalPreviewSize ( ) {
		 /* .locals 18 */
		 /* move-object/from16 v0, p0 */
		 /* .line 1 */
		 v1 = this.b;
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-nez v1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 v1 = this.a;
	 (( android.hardware.Camera ) v1 ).getParameters ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
	 (( android.hardware.Camera$Parameters ) v1 ).getSupportedPreviewSizes ( ); // invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;
	 /* .line 3 */
	 v3 = 	 /* invoke-virtual/range {p0 ..p0}, Landroid/view/SurfaceView;->getWidth()I */
	 /* .line 4 */
	 v4 = 	 /* invoke-virtual/range {p0 ..p0}, Landroid/view/SurfaceView;->getHeight()I */
	 /* .line 5 */
	 /* invoke-virtual/range {p0 ..p0}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context; */
	 v5 = 	 j.a.a.a.j .a ( v5 );
	 int v6 = 1; // const/4 v6, 0x1
	 /* if-ne v5, v6, :cond_1 */
	 /* move/from16 v17, v4 */
	 /* move v4, v3 */
	 /* move/from16 v3, v17 */
} // :cond_1
/* int-to-double v5, v3 */
/* int-to-double v7, v4 */
/* div-double/2addr v5, v7 */
/* if-nez v1, :cond_2 */
/* .line 6 */
} // :cond_2
/* const-wide v7, 0x7fefffffffffffffL # Double.MAX_VALUE */
/* move-wide v9, v7 */
} // :cond_3
v11 = } // :goto_0
if ( v11 != null) { // if-eqz v11, :cond_5
/* check-cast v11, Landroid/hardware/Camera$Size; */
/* .line 7 */
/* iget v12, v11, Landroid/hardware/Camera$Size;->width:I */
/* int-to-double v12, v12 */
/* iget v14, v11, Landroid/hardware/Camera$Size;->height:I */
/* int-to-double v14, v14 */
/* div-double/2addr v12, v14 */
/* sub-double/2addr v12, v5 */
/* .line 8 */
java.lang.Math .abs ( v12,v13 );
/* move-result-wide v12 */
/* iget v14, v0, Lj/a/a/a/g;->i:F */
/* float-to-double v14, v14 */
/* cmpl-double v16, v12, v14 */
/* if-lez v16, :cond_4 */
/* .line 9 */
} // :cond_4
/* iget v12, v11, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v12, v4 */
v12 = java.lang.Math .abs ( v12 );
/* int-to-double v12, v12 */
/* cmpg-double v14, v12, v9 */
/* if-gez v14, :cond_3 */
/* .line 10 */
/* iget v2, v11, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v2, v4 */
v2 = java.lang.Math .abs ( v2 );
/* int-to-double v9, v2 */
/* move-object v2, v11 */
} // :cond_5
/* if-nez v2, :cond_7 */
/* .line 11 */
} // :cond_6
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_7
/* check-cast v3, Landroid/hardware/Camera$Size; */
/* .line 12 */
/* iget v5, v3, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v5, v4 */
v5 = java.lang.Math .abs ( v5 );
/* int-to-double v5, v5 */
/* cmpg-double v9, v5, v7 */
/* if-gez v9, :cond_6 */
/* .line 13 */
/* iget v2, v3, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v2, v4 */
v2 = java.lang.Math .abs ( v2 );
/* int-to-double v5, v2 */
/* move-object v2, v3 */
/* move-wide v7, v5 */
} // :cond_7
} // .end method
/* # virtual methods */
public final android.graphics.Point a ( android.graphics.Point p0 ) {
/* .locals 2 */
/* .line 13 */
v0 = (( j.a.a.a.g ) p0 ).getDisplayOrientation ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->getDisplayOrientation()I
/* rem-int/lit16 v0, v0, 0xb4 */
/* if-nez v0, :cond_0 */
/* .line 14 */
} // :cond_0
/* new-instance v0, Landroid/graphics/Point; */
/* iget v1, p1, Landroid/graphics/Point;->y:I */
/* iget p1, p1, Landroid/graphics/Point;->x:I */
/* invoke-direct {v0, v1, p1}, Landroid/graphics/Point;-><init>(II)V */
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 6 */
try { // :try_start_0
v0 = this.b;
v0 = this.a;
v1 = this.k;
(( android.hardware.Camera ) v0 ).autoFocus ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 7 */
/* :catch_0 */
(( j.a.a.a.g ) p0 ).b ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->b()V
} // :goto_0
return;
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .line 15 */
(( android.view.SurfaceView ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 16 */
v1 = (( j.a.a.a.g ) p0 ).getDisplayOrientation ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->getDisplayOrientation()I
/* rem-int/lit16 v1, v1, 0xb4 */
/* if-nez v1, :cond_0 */
} // :cond_0
/* move v4, p2 */
/* move p2, p1 */
/* move p1, v4 */
/* .line 17 */
} // :goto_0
/* iget-boolean v1, p0, Lj/a/a/a/g;->g:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 18 */
(( android.view.SurfaceView ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getParent()Landroid/view/ViewParent;
/* check-cast v1, Landroid/view/View; */
v1 = (( android.view.View ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getWidth()I
/* .line 19 */
(( android.view.SurfaceView ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getParent()Landroid/view/ViewParent;
/* check-cast v2, Landroid/view/View; */
v2 = (( android.view.View ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/view/View;->getHeight()I
/* int-to-float v1, v1 */
/* int-to-float p1, p1 */
/* div-float/2addr v1, p1 */
/* int-to-float v2, v2 */
/* int-to-float p2, p2 */
/* div-float/2addr v2, p2 */
/* cmpl-float v3, v1, v2 */
/* if-lez v3, :cond_1 */
} // :cond_1
/* move v1, v2 */
} // :goto_1
/* mul-float p1, p1, v1 */
/* .line 20 */
p1 = java.lang.Math .round ( p1 );
/* mul-float p2, p2, v1 */
/* .line 21 */
p2 = java.lang.Math .round ( p2 );
/* .line 22 */
} // :cond_2
/* iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* .line 23 */
/* iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 24 */
(( android.view.SurfaceView ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/SurfaceView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public final void a ( android.hardware.Camera$Size p0 ) {
/* .locals 4 */
/* .line 8 */
/* new-instance v0, Landroid/graphics/Point; */
v1 = (( android.view.SurfaceView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getWidth()I
v2 = (( android.view.SurfaceView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getHeight()I
/* invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V */
(( j.a.a.a.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lj/a/a/a/g;->a(Landroid/graphics/Point;)Landroid/graphics/Point;
/* .line 9 */
/* iget v1, p1, Landroid/hardware/Camera$Size;->width:I */
/* int-to-float v1, v1 */
/* iget p1, p1, Landroid/hardware/Camera$Size;->height:I */
/* int-to-float p1, p1 */
/* div-float/2addr v1, p1 */
/* .line 10 */
/* iget p1, v0, Landroid/graphics/Point;->x:I */
/* int-to-float v2, p1 */
/* iget v0, v0, Landroid/graphics/Point;->y:I */
/* int-to-float v3, v0 */
/* div-float/2addr v2, v3 */
/* cmpl-float v2, v2, v1 */
/* if-lez v2, :cond_0 */
/* int-to-float p1, v0 */
/* mul-float p1, p1, v1 */
/* float-to-int p1, p1 */
/* .line 11 */
(( j.a.a.a.g ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lj/a/a/a/g;->a(II)V
} // :cond_0
/* int-to-float v0, p1 */
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* .line 12 */
(( j.a.a.a.g ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lj/a/a/a/g;->a(II)V
} // :goto_0
return;
} // .end method
public void a ( Object p0, android.hardware.Camera$PreviewCallback p1 ) {
/* .locals 0 */
/* .line 2 */
(( j.a.a.a.g ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lj/a/a/a/g;->b(Lj/a/a/a/i;Landroid/hardware/Camera$PreviewCallback;)V
/* .line 3 */
/* new-instance p1, Landroid/os/Handler; */
/* invoke-direct {p1}, Landroid/os/Handler;-><init>()V */
this.c = p1;
/* .line 4 */
(( android.view.SurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
/* .line 5 */
(( android.view.SurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
int p2 = 3; // const/4 p2, 0x3
return;
} // .end method
public final void b ( ) {
/* .locals 4 */
/* .line 4 */
v0 = this.c;
v1 = this.j;
/* const-wide/16 v2, 0x3e8 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public void b ( Object p0, android.hardware.Camera$PreviewCallback p1 ) {
/* .locals 0 */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.h = p2;
return;
} // .end method
public void c ( ) {
/* .locals 4 */
/* .line 2 */
/* invoke-direct {p0}, Lj/a/a/a/g;->getOptimalPreviewSize()Landroid/hardware/Camera$Size; */
/* .line 3 */
v1 = this.b;
v1 = this.a;
(( android.hardware.Camera ) v1 ).getParameters ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
/* .line 4 */
/* iget v2, v0, Landroid/hardware/Camera$Size;->width:I */
/* iget v3, v0, Landroid/hardware/Camera$Size;->height:I */
(( android.hardware.Camera$Parameters ) v1 ).setPreviewSize ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V
/* .line 5 */
v2 = this.b;
v2 = this.a;
(( android.hardware.Camera ) v2 ).setParameters ( v1 ); // invoke-virtual {v2, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
/* .line 6 */
(( j.a.a.a.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lj/a/a/a/g;->a(Landroid/hardware/Camera$Size;)V
return;
} // .end method
public void d ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
try { // :try_start_0
(( android.view.SurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lj/a/a/a/g;->d:Z */
/* .line 5 */
(( j.a.a.a.g ) p0 ).c ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->c()V
/* .line 6 */
v0 = this.b;
v0 = this.a;
(( android.view.SurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
(( android.hardware.Camera ) v0 ).setPreviewDisplay ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
/* .line 7 */
v0 = this.b;
v0 = this.a;
v1 = (( j.a.a.a.g ) p0 ).getDisplayOrientation ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->getDisplayOrientation()I
(( android.hardware.Camera ) v0 ).setDisplayOrientation ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V
/* .line 8 */
v0 = this.b;
v0 = this.a;
v1 = this.h;
(( android.hardware.Camera ) v0 ).setOneShotPreviewCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
/* .line 9 */
v0 = this.b;
v0 = this.a;
(( android.hardware.Camera ) v0 ).startPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
/* .line 10 */
/* iget-boolean v0, p0, Lj/a/a/a/g;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 11 */
/* iget-boolean v0, p0, Lj/a/a/a/g;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
(( j.a.a.a.g ) p0 ).a ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->a()V
/* .line 13 */
} // :cond_0
(( j.a.a.a.g ) p0 ).b ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->b()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 14 */
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
final String v2 = "CameraPreview"; // const-string v2, "CameraPreview"
android.util.Log .e ( v2,v1,v0 );
} // :cond_1
} // :goto_0
return;
} // .end method
public void e ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
try { // :try_start_0
/* iput-boolean v0, p0, Lj/a/a/a/g;->d:Z */
/* .line 4 */
(( android.view.SurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
/* .line 5 */
v0 = this.b;
v0 = this.a;
(( android.hardware.Camera ) v0 ).cancelAutoFocus ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
/* .line 6 */
v0 = this.b;
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.hardware.Camera ) v0 ).setOneShotPreviewCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
/* .line 7 */
v0 = this.b;
v0 = this.a;
(( android.hardware.Camera ) v0 ).stopPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 8 */
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
final String v2 = "CameraPreview"; // const-string v2, "CameraPreview"
android.util.Log .e ( v2,v1,v0 );
} // :cond_0
} // :goto_0
return;
} // .end method
public Integer getDisplayOrientation ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance v0, Landroid/hardware/Camera$CameraInfo; */
/* invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V */
/* .line 3 */
v2 = this.b;
/* iget v2, v2, Lj/a/a/a/i;->b:I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_1 */
/* .line 4 */
android.hardware.Camera .getCameraInfo ( v1,v0 );
/* .line 5 */
} // :cond_1
android.hardware.Camera .getCameraInfo ( v2,v0 );
/* .line 6 */
} // :goto_0
(( android.view.SurfaceView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context;
final String v3 = "window"; // const-string v3, "window"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/view/WindowManager; */
/* .line 7 */
/* .line 8 */
v2 = (( android.view.Display ) v2 ).getRotation ( ); // invoke-virtual {v2}, Landroid/view/Display;->getRotation()I
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_5
/* if-eq v2, v3, :cond_4 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v2, v4, :cond_3 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq v2, v4, :cond_2 */
} // :cond_2
/* const/16 v1, 0x10e */
} // :cond_3
/* const/16 v1, 0xb4 */
} // :cond_4
/* const/16 v1, 0x5a */
/* .line 9 */
} // :cond_5
} // :goto_1
/* iget v2, v0, Landroid/hardware/Camera$CameraInfo;->facing:I */
/* if-ne v2, v3, :cond_6 */
/* .line 10 */
/* iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I */
/* add-int/2addr v0, v1 */
/* rem-int/lit16 v0, v0, 0x168 */
/* rsub-int v0, v0, 0x168 */
/* .line 11 */
/* rem-int/lit16 v0, v0, 0x168 */
/* .line 12 */
} // :cond_6
/* iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I */
/* sub-int/2addr v0, v1 */
/* add-int/lit16 v0, v0, 0x168 */
/* rem-int/lit16 v0, v0, 0x168 */
} // :goto_2
} // .end method
public void setAspectTolerance ( Float p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/g;->i:F */
return;
} // .end method
public void setAutoFocus ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Lj/a/a/a/g;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 2 */
/* iget-boolean v0, p0, Lj/a/a/a/g;->e:Z */
/* if-ne p1, v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* iput-boolean p1, p0, Lj/a/a/a/g;->e:Z */
final String v0 = "CameraPreview"; // const-string v0, "CameraPreview"
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 4 */
/* iget-boolean p1, p0, Lj/a/a/a/g;->f:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
final String p1 = "Starting autofocus"; // const-string p1, "Starting autofocus"
/* .line 5 */
android.util.Log .v ( v0,p1 );
/* .line 6 */
(( j.a.a.a.g ) p0 ).a ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->a()V
/* .line 7 */
} // :cond_1
(( j.a.a.a.g ) p0 ).b ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->b()V
} // :cond_2
final String p1 = "Cancelling autofocus"; // const-string p1, "Cancelling autofocus"
/* .line 8 */
android.util.Log .v ( v0,p1 );
/* .line 9 */
p1 = this.b;
p1 = this.a;
(( android.hardware.Camera ) p1 ).cancelAutoFocus ( ); // invoke-virtual {p1}, Landroid/hardware/Camera;->cancelAutoFocus()V
} // :cond_3
} // :goto_0
return;
} // .end method
public void setShouldScaleToFill ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/g;->g:Z */
return;
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
/* if-nez p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
(( j.a.a.a.g ) p0 ).e ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->e()V
/* .line 3 */
(( j.a.a.a.g ) p0 ).d ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->d()V
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/g;->f:Z */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/g;->f:Z */
/* .line 2 */
(( j.a.a.a.g ) p0 ).e ( ); // invoke-virtual {p0}, Lj/a/a/a/g;->e()V
return;
} // .end method
