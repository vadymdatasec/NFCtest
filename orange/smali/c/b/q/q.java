public class c.b.q.q {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.widget.CompoundButton a;
	 public android.content.res.ColorStateList b;
	 public android.graphics.PorterDuff$Mode c;
	 public Boolean d;
	 public Boolean e;
	 public Boolean f;
	 /* # direct methods */
	 public c.b.q.q ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.b = v0;
		 /* .line 3 */
		 this.c = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/b/q/q;->d:Z */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lc/b/q/q;->e:Z */
		 /* .line 6 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 40 */
		 /* const/16 v1, 0x11 */
		 /* if-ge v0, v1, :cond_0 */
		 /* .line 41 */
		 v0 = this.a;
		 c.h.o.e .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 42 */
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
			 /* add-int/2addr p1, v0 */
		 } // :cond_0
	 } // .end method
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 29 */
		 v0 = this.a;
		 c.h.o.e .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* .line 30 */
			 /* iget-boolean v1, p0, Lc/b/q/q;->d:Z */
			 /* if-nez v1, :cond_0 */
			 /* iget-boolean v1, p0, Lc/b/q/q;->e:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_4
				 /* .line 31 */
			 } // :cond_0
			 c.h.g.r.a .h ( v0 );
			 /* .line 32 */
			 (( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
			 /* .line 33 */
			 /* iget-boolean v1, p0, Lc/b/q/q;->d:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 34 */
				 v1 = this.b;
				 c.h.g.r.a .a ( v0,v1 );
				 /* .line 35 */
			 } // :cond_1
			 /* iget-boolean v1, p0, Lc/b/q/q;->e:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* .line 36 */
				 v1 = this.c;
				 c.h.g.r.a .a ( v0,v1 );
				 /* .line 37 */
			 } // :cond_2
			 v1 = 			 (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
			 if ( v1 != null) { // if-eqz v1, :cond_3
				 /* .line 38 */
				 v1 = this.a;
				 (( android.widget.CompoundButton ) v1 ).getDrawableState ( ); // invoke-virtual {v1}, Landroid/widget/CompoundButton;->getDrawableState()[I
				 (( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
				 /* .line 39 */
			 } // :cond_3
			 v1 = this.a;
			 (( android.widget.CompoundButton ) v1 ).setButtonDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
		 } // :cond_4
		 return;
	 } // .end method
	 public void a ( android.content.res.ColorStateList p0 ) {
		 /* .locals 0 */
		 /* .line 23 */
		 this.b = p1;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 24 */
		 /* iput-boolean p1, p0, Lc/b/q/q;->d:Z */
		 /* .line 25 */
		 (( c.b.q.q ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/q;->a()V
		 return;
	 } // .end method
	 public void a ( android.graphics.PorterDuff$Mode p0 ) {
		 /* .locals 0 */
		 /* .line 26 */
		 this.c = p1;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 27 */
		 /* iput-boolean p1, p0, Lc/b/q/q;->e:Z */
		 /* .line 28 */
		 (( c.b.q.q ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/q;->a()V
		 return;
	 } // .end method
	 public void a ( android.util.AttributeSet p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.widget.CompoundButton ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
		 v1 = c.b.j.CompoundButton;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1, p2, v2 ); // invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 2 */
		 try { // :try_start_0
			 p2 = 			 (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 3 */
				 p2 = 				 (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 if ( p2 != null) { // if-eqz p2, :cond_0
					 /* .line 4 */
					 try { // :try_start_1
						 v0 = this.a;
						 v1 = this.a;
						 /* .line 5 */
						 (( android.widget.CompoundButton ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
						 c.b.l.a.b .c ( v1,p2 );
						 /* .line 6 */
						 (( android.widget.CompoundButton ) v0 ).setButtonDrawable ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
						 /* :try_end_1 */
						 /* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
						 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
						 int p2 = 1; // const/4 p2, 0x1
						 /* :catch_0 */
					 } // :cond_0
					 int p2 = 0; // const/4 p2, 0x0
				 } // :goto_0
				 /* if-nez p2, :cond_1 */
				 /* .line 7 */
				 try { // :try_start_2
					 p2 = 					 (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
					 if ( p2 != null) { // if-eqz p2, :cond_1
						 /* .line 8 */
						 p2 = 						 (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
						 if ( p2 != null) { // if-eqz p2, :cond_1
							 /* .line 9 */
							 v0 = this.a;
							 v1 = this.a;
							 /* .line 10 */
							 (( android.widget.CompoundButton ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
							 c.b.l.a.b .c ( v1,p2 );
							 /* .line 11 */
							 (( android.widget.CompoundButton ) v0 ).setButtonDrawable ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
							 /* .line 12 */
						 } // :cond_1
						 p2 = 						 (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
						 if ( p2 != null) { // if-eqz p2, :cond_2
							 /* .line 13 */
							 p2 = this.a;
							 /* .line 14 */
							 (( android.content.res.TypedArray ) p1 ).getColorStateList ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;
							 /* .line 15 */
							 c.h.o.e .a ( p2,v0 );
							 /* .line 16 */
						 } // :cond_2
						 p2 = 						 (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
						 if ( p2 != null) { // if-eqz p2, :cond_3
							 /* .line 17 */
							 p2 = this.a;
							 int v1 = -1; // const/4 v1, -0x1
							 /* .line 18 */
							 v0 = 							 (( android.content.res.TypedArray ) p1 ).getInt ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
							 int v1 = 0; // const/4 v1, 0x0
							 /* .line 19 */
							 c.b.q.a1 .a ( v0,v1 );
							 /* .line 20 */
							 c.h.o.e .a ( p2,v0 );
							 /* :try_end_2 */
							 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
							 /* .line 21 */
						 } // :cond_3
						 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
						 return;
						 /* :catchall_0 */
						 /* move-exception p2 */
						 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
						 /* .line 22 */
						 /* throw p2 */
					 } // .end method
					 public android.content.res.ColorStateList b ( ) {
						 /* .locals 1 */
						 /* .line 1 */
						 v0 = this.b;
					 } // .end method
					 public android.graphics.PorterDuff$Mode c ( ) {
						 /* .locals 1 */
						 /* .line 1 */
						 v0 = this.c;
					 } // .end method
					 public void d ( ) {
						 /* .locals 1 */
						 /* .line 1 */
						 /* iget-boolean v0, p0, Lc/b/q/q;->f:Z */
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 int v0 = 0; // const/4 v0, 0x0
							 /* .line 2 */
							 /* iput-boolean v0, p0, Lc/b/q/q;->f:Z */
							 return;
						 } // :cond_0
						 int v0 = 1; // const/4 v0, 0x1
						 /* .line 3 */
						 /* iput-boolean v0, p0, Lc/b/q/q;->f:Z */
						 /* .line 4 */
						 (( c.b.q.q ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/q;->a()V
						 return;
					 } // .end method
