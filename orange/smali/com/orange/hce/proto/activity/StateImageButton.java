public class com.orange.hce.proto.activity.StateImageButton extends c.b.q.v {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.Boolean d;
	 public android.graphics.drawable.Drawable e;
	 public android.graphics.drawable.Drawable f;
	 public android.graphics.drawable.Drawable g;
	 public Boolean h;
	 /* # direct methods */
	 public com.orange.hce.proto.activity.StateImageButton ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.StateImageButton ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 java.lang.Boolean .valueOf ( v0 );
		 this.d = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z */
		 /* .line 5 */
		 (( com.orange.hce.proto.activity.StateImageButton ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/orange/hce/proto/activity/StateImageButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V
		 /* .line 6 */
		 (( com.orange.hce.proto.activity.StateImageButton ) p0 ).setActivated ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActivated(Z)V
		 /* .line 7 */
		 /* iget-boolean p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 8 */
			 /* new-instance p1, Le/h/b/a/l/s0; */
			 /* invoke-direct {p1, p0}, Le/h/b/a/l/s0;-><init>(Lcom/orange/hce/proto/activity/StateImageButton;)V */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V */
		 } // :cond_0
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.StateImageButton ( ) {
		 /* .locals 0 */
		 /* .line 9 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 10 */
		 java.lang.Boolean .valueOf ( p1 );
		 this.d = p1;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 11 */
		 /* iput-boolean p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 2 */
		 /* .line 6 */
		 v0 = java.lang.Boolean.TRUE;
		 v1 = this.d;
		 v0 = 		 (( java.lang.Boolean ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 7 */
			 v0 = this.e;
			 (( c.b.q.v ) p0 ).setImageDrawable ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
			 /* .line 8 */
		 } // :cond_0
		 v0 = this.f;
		 (( c.b.q.v ) p0 ).setImageDrawable ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
	 } // :goto_0
	 return;
} // .end method
public final void a ( android.content.Context p0, android.util.AttributeSet p1 ) {
	 /* .locals 2 */
	 /* .line 9 */
	 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 v0 = e.h.b.a.i.StateImageButton;
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.content.res.Resources$Theme ) p1 ).obtainStyledAttributes ( p2, v0, v1, v1 ); // invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* .line 10 */
	 try { // :try_start_0
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.e = p2;
		 int p2 = 2; // const/4 p2, 0x2
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 11 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* iput-boolean p2, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z */
		 int p2 = 3; // const/4 p2, 0x3
		 /* .line 12 */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.f = p2;
		 /* .line 13 */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.g = p2;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 14 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
		 /* :catchall_0 */
		 /* move-exception p2 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 /* .line 15 */
		 /* throw p2 */
	 } // .end method
	 public void a ( android.view.View$OnClickListener p0, android.view.View p1 ) { //synthethic
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = 		 (( android.widget.ImageButton ) p0 ).isActivated ( ); // invoke-virtual {p0}, Landroid/widget/ImageButton;->isActivated()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 /* move-object v0, p2 */
			 /* check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton; */
			 (( com.orange.hce.proto.activity.StateImageButton ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/orange/hce/proto/activity/StateImageButton;->b()V
			 /* .line 5 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( android.view.View p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = 		 (( android.widget.ImageButton ) p0 ).isActivated ( ); // invoke-virtual {p0}, Landroid/widget/ImageButton;->isActivated()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 (( com.orange.hce.proto.activity.StateImageButton ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/StateImageButton;->b()V
		 } // :cond_0
		 return;
	 } // .end method
	 public final void b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.d;
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
		 /* xor-int/lit8 v0, v0, 0x1 */
		 java.lang.Boolean .valueOf ( v0 );
		 this.d = v0;
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "active "; // const-string v1, "active "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.d;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "StateButton"; // const-string v1, "StateButton"
		 android.util.Log .i ( v1,v0 );
		 /* .line 3 */
		 (( com.orange.hce.proto.activity.StateImageButton ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/StateImageButton;->a()V
		 return;
	 } // .end method
	 public java.lang.Boolean getActive ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
	 } // .end method
	 public void setActivated ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setActivated(Z)V */
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
		 p1 = this.g;
		 (( c.b.q.v ) p0 ).setImageDrawable ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
	 } // :cond_0
	 return;
} // .end method
public void setActive ( java.lang.Boolean p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.d = p1;
	 /* .line 2 */
	 (( com.orange.hce.proto.activity.StateImageButton ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/StateImageButton;->a()V
	 return;
} // .end method
public void setOnClickListener ( android.view.View$OnClickListener p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Le/h/b/a/l/r0; */
	 /* invoke-direct {v0, p0, p1}, Le/h/b/a/l/r0;-><init>(Lcom/orange/hce/proto/activity/StateImageButton;Landroid/view/View$OnClickListener;)V */
	 /* invoke-super {p0, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V */
	 return;
} // .end method
public void setOnClickListenerWitoutChangingState ( android.view.View$OnClickListener p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V */
	 return;
} // .end method
