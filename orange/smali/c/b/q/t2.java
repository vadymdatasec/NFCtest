public class c.b.q.t2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.view.View b;
	 public final android.widget.TextView c;
	 public final android.view.WindowManager$LayoutParams d;
	 public final android.graphics.Rect e;
	 public final f;
	 public final g;
	 /* # direct methods */
	 public c.b.q.t2 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/view/WindowManager$LayoutParams; */
		 /* invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V */
		 this.d = v0;
		 /* .line 3 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.e = v0;
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v1, v0, [I */
		 /* .line 4 */
		 this.f = v1;
		 /* new-array v0, v0, [I */
		 /* .line 5 */
		 this.g = v0;
		 /* .line 6 */
		 this.a = p1;
		 /* .line 7 */
		 android.view.LayoutInflater .from ( p1 );
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.view.LayoutInflater ) p1 ).inflate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
		 this.b = p1;
		 /* .line 8 */
		 (( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/TextView; */
		 this.c = p1;
		 /* .line 9 */
		 p1 = this.d;
		 /* const-class v0, Lc/b/q/t2; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 (( android.view.WindowManager$LayoutParams ) p1 ).setTitle ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V
		 /* .line 10 */
		 p1 = this.d;
		 v0 = this.a;
		 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 this.packageName = v0;
		 /* .line 11 */
		 p1 = this.d;
		 /* const/16 v0, 0x3ea */
		 /* iput v0, p1, Landroid/view/WindowManager$LayoutParams;->type:I */
		 int v0 = -2; // const/4 v0, -0x2
		 /* .line 12 */
		 /* iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I */
		 /* .line 13 */
		 /* iput v0, p1, Landroid/view/WindowManager$LayoutParams;->height:I */
		 int v0 = -3; // const/4 v0, -0x3
		 /* .line 14 */
		 /* iput v0, p1, Landroid/view/WindowManager$LayoutParams;->format:I */
		 /* .line 15 */
		 /* iput v0, p1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I */
		 /* const/16 v0, 0x18 */
		 /* .line 16 */
		 /* iput v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I */
		 return;
	 } // .end method
	 public static android.view.View a ( android.view.View p0 ) {
		 /* .locals 3 */
		 /* .line 43 */
		 (( android.view.View ) p0 ).getRootView ( ); // invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;
		 /* .line 44 */
		 (( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* .line 45 */
		 /* instance-of v2, v1, Landroid/view/WindowManager$LayoutParams; */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* check-cast v1, Landroid/view/WindowManager$LayoutParams; */
			 /* iget v1, v1, Landroid/view/WindowManager$LayoutParams;->type:I */
			 int v2 = 2; // const/4 v2, 0x2
			 /* if-ne v1, v2, :cond_0 */
			 /* .line 46 */
		 } // :cond_0
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 /* .line 47 */
	 } // :goto_0
	 /* instance-of v1, p0, Landroid/content/ContextWrapper; */
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 48 */
		 /* instance-of v1, p0, Landroid/app/Activity; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 49 */
			 /* check-cast p0, Landroid/app/Activity; */
			 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
			 (( android.view.Window ) p0 ).getDecorView ( ); // invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
			 /* .line 50 */
		 } // :cond_1
		 /* check-cast p0, Landroid/content/ContextWrapper; */
		 (( android.content.ContextWrapper ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
	 } // :cond_2
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 2 */
	 /* .line 7 */
	 v0 = 	 (( c.b.q.t2 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/t2;->b()Z
	 /* if-nez v0, :cond_0 */
	 return;
	 /* .line 8 */
} // :cond_0
v0 = this.a;
final String v1 = "window"; // const-string v1, "window"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/WindowManager; */
/* .line 9 */
v1 = this.b;
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2, Boolean p3, android.view.WindowManager$LayoutParams p4 ) {
/* .locals 8 */
/* .line 10 */
(( android.view.View ) p1 ).getApplicationWindowToken ( ); // invoke-virtual {p1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;
this.token = v0;
/* .line 11 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelOffset ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I
/* .line 12 */
v1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* if-lt v1, v0, :cond_0 */
/* .line 13 */
} // :cond_0
p2 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* div-int/lit8 p2, p2, 0x2 */
/* .line 14 */
} // :goto_0
v1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
int v2 = 0; // const/4 v2, 0x0
/* if-lt v1, v0, :cond_1 */
/* .line 15 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelOffset ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I
/* add-int v1, p3, v0 */
/* sub-int/2addr p3, v0 */
/* .line 16 */
} // :cond_1
v1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
int p3 = 0; // const/4 p3, 0x0
} // :goto_1
/* const/16 v0, 0x31 */
/* .line 17 */
/* iput v0, p5, Landroid/view/WindowManager$LayoutParams;->gravity:I */
/* .line 18 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
if ( p4 != null) { // if-eqz p4, :cond_2
} // :cond_2
} // :goto_2
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelOffset ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I
/* .line 19 */
c.b.q.t2 .a ( p1 );
/* if-nez v3, :cond_3 */
final String p1 = "TooltipPopup"; // const-string p1, "TooltipPopup"
final String p2 = "Cannot find app view"; // const-string p2, "Cannot find app view"
/* .line 20 */
android.util.Log .e ( p1,p2 );
return;
/* .line 21 */
} // :cond_3
v4 = this.e;
(( android.view.View ) v3 ).getWindowVisibleDisplayFrame ( v4 ); // invoke-virtual {v3, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
/* .line 22 */
v4 = this.e;
/* iget v5, v4, Landroid/graphics/Rect;->left:I */
/* if-gez v5, :cond_5 */
/* iget v4, v4, Landroid/graphics/Rect;->top:I */
/* if-gez v4, :cond_5 */
/* .line 23 */
v4 = this.a;
(( android.content.Context ) v4 ).getResources ( ); // invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
final String v5 = "status_bar_height"; // const-string v5, "status_bar_height"
final String v6 = "dimen"; // const-string v6, "dimen"
final String v7 = "android"; // const-string v7, "android"
/* .line 24 */
v5 = (( android.content.res.Resources ) v4 ).getIdentifier ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 25 */
v5 = (( android.content.res.Resources ) v4 ).getDimensionPixelSize ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
} // :cond_4
int v5 = 0; // const/4 v5, 0x0
/* .line 26 */
} // :goto_3
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 27 */
v6 = this.e;
/* iget v7, v4, Landroid/util/DisplayMetrics;->widthPixels:I */
/* iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I */
(( android.graphics.Rect ) v6 ).set ( v2, v5, v7, v4 ); // invoke-virtual {v6, v2, v5, v7, v4}, Landroid/graphics/Rect;->set(IIII)V
/* .line 28 */
} // :cond_5
v4 = this.g;
(( android.view.View ) v3 ).getLocationOnScreen ( v4 ); // invoke-virtual {v3, v4}, Landroid/view/View;->getLocationOnScreen([I)V
/* .line 29 */
v4 = this.f;
(( android.view.View ) p1 ).getLocationOnScreen ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/View;->getLocationOnScreen([I)V
/* .line 30 */
p1 = this.f;
/* aget v4, p1, v2 */
v5 = this.g;
/* aget v6, v5, v2 */
/* sub-int/2addr v4, v6 */
/* aput v4, p1, v2 */
int v4 = 1; // const/4 v4, 0x1
/* .line 31 */
/* aget v6, p1, v4 */
/* aget v5, v5, v4 */
/* sub-int/2addr v6, v5 */
/* aput v6, p1, v4 */
/* .line 32 */
/* aget p1, p1, v2 */
/* add-int/2addr p1, p2 */
p2 = (( android.view.View ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getWidth()I
/* div-int/lit8 p2, p2, 0x2 */
/* sub-int/2addr p1, p2 */
/* iput p1, p5, Landroid/view/WindowManager$LayoutParams;->x:I */
/* .line 33 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v2 );
/* .line 34 */
p2 = this.b;
(( android.view.View ) p2 ).measure ( p1, p1 ); // invoke-virtual {p2, p1, p1}, Landroid/view/View;->measure(II)V
/* .line 35 */
p1 = this.b;
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* .line 36 */
p2 = this.f;
/* aget v2, p2, v4 */
/* add-int/2addr v2, p3 */
/* sub-int/2addr v2, v0 */
/* sub-int/2addr v2, p1 */
/* .line 37 */
/* aget p2, p2, v4 */
/* add-int/2addr p2, v1 */
/* add-int/2addr p2, v0 */
if ( p4 != null) { // if-eqz p4, :cond_7
/* if-ltz v2, :cond_6 */
/* .line 38 */
/* iput v2, p5, Landroid/view/WindowManager$LayoutParams;->y:I */
/* .line 39 */
} // :cond_6
/* iput p2, p5, Landroid/view/WindowManager$LayoutParams;->y:I */
} // :cond_7
/* add-int/2addr p1, p2 */
/* .line 40 */
p3 = this.e;
p3 = (( android.graphics.Rect ) p3 ).height ( ); // invoke-virtual {p3}, Landroid/graphics/Rect;->height()I
/* if-gt p1, p3, :cond_8 */
/* .line 41 */
/* iput p2, p5, Landroid/view/WindowManager$LayoutParams;->y:I */
/* .line 42 */
} // :cond_8
/* iput v2, p5, Landroid/view/WindowManager$LayoutParams;->y:I */
} // :goto_4
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Boolean p3, java.lang.CharSequence p4 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( c.b.q.t2 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/t2;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.t2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/t2;->a()V
/* .line 3 */
} // :cond_0
v0 = this.c;
(( android.widget.TextView ) v0 ).setText ( p5 ); // invoke-virtual {v0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 4 */
v6 = this.d;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-virtual/range {v1 ..v6}, Lc/b/q/t2;->a(Landroid/view/View;IIZLandroid/view/WindowManager$LayoutParams;)V */
/* .line 5 */
p1 = this.a;
final String p2 = "window"; // const-string p2, "window"
(( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/WindowManager; */
/* .line 6 */
p2 = this.b;
p3 = this.d;
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
