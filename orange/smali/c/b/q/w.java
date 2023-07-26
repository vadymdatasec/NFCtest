public class c.b.q.w {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.widget.ImageView a;
	 public c.b.q.i2 b;
	 public c.b.q.i2 c;
	 public c.b.q.i2 d;
	 /* # direct methods */
	 public c.b.q.w ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 33 */
		 v0 = this.a;
		 (( android.widget.ImageView ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 34 */
			 c.b.q.a1 .b ( v0 );
		 } // :cond_0
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 35 */
			 v1 = 			 (( c.b.q.w ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/q/w;->e()Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 36 */
				 v1 = 				 (( c.b.q.w ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/w;->a(Landroid/graphics/drawable/Drawable;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 return;
					 /* .line 37 */
				 } // :cond_1
				 v1 = this.c;
				 if ( v1 != null) { // if-eqz v1, :cond_2
					 /* .line 38 */
					 v2 = this.a;
					 /* .line 39 */
					 (( android.widget.ImageView ) v2 ).getDrawableState ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawableState()[I
					 /* .line 40 */
					 c.b.q.s .a ( v0,v1,v2 );
					 /* .line 41 */
				 } // :cond_2
				 v1 = this.b;
				 if ( v1 != null) { // if-eqz v1, :cond_3
					 /* .line 42 */
					 v2 = this.a;
					 /* .line 43 */
					 (( android.widget.ImageView ) v2 ).getDrawableState ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawableState()[I
					 /* .line 44 */
					 c.b.q.s .a ( v0,v1,v2 );
				 } // :cond_3
			 } // :goto_0
			 return;
		 } // .end method
		 public void a ( Integer p0 ) {
			 /* .locals 1 */
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 /* .line 18 */
				 v0 = this.a;
				 (( android.widget.ImageView ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;
				 c.b.l.a.b .c ( v0,p1 );
				 if ( p1 != null) { // if-eqz p1, :cond_0
					 /* .line 19 */
					 c.b.q.a1 .b ( p1 );
					 /* .line 20 */
				 } // :cond_0
				 v0 = this.a;
				 (( android.widget.ImageView ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
				 /* .line 21 */
			 } // :cond_1
			 p1 = this.a;
			 int v0 = 0; // const/4 v0, 0x0
			 (( android.widget.ImageView ) p1 ).setImageDrawable ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
			 /* .line 22 */
		 } // :goto_0
		 (( c.b.q.w ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/w;->a()V
		 return;
	 } // .end method
	 public void a ( android.content.res.ColorStateList p0 ) {
		 /* .locals 1 */
		 /* .line 23 */
		 v0 = this.c;
		 /* if-nez v0, :cond_0 */
		 /* .line 24 */
		 /* new-instance v0, Lc/b/q/i2; */
		 /* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
		 this.c = v0;
		 /* .line 25 */
	 } // :cond_0
	 v0 = this.c;
	 this.a = p1;
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 26 */
	 /* iput-boolean p1, v0, Lc/b/q/i2;->d:Z */
	 /* .line 27 */
	 (( c.b.q.w ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/w;->a()V
	 return;
} // .end method
public void a ( android.graphics.PorterDuff$Mode p0 ) {
	 /* .locals 1 */
	 /* .line 28 */
	 v0 = this.c;
	 /* if-nez v0, :cond_0 */
	 /* .line 29 */
	 /* new-instance v0, Lc/b/q/i2; */
	 /* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
	 this.c = v0;
	 /* .line 30 */
} // :cond_0
v0 = this.c;
this.b = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 31 */
/* iput-boolean p1, v0, Lc/b/q/i2;->c:Z */
/* .line 32 */
(( c.b.q.w ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/w;->a()V
return;
} // .end method
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
(( android.widget.ImageView ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;
v1 = c.b.j.AppCompatImageView;
int v2 = 0; // const/4 v2, 0x0
c.b.q.k2 .a ( v0,p1,v1,p2,v2 );
/* .line 2 */
try { // :try_start_0
	 p2 = this.a;
	 (( android.widget.ImageView ) p2 ).getDrawable ( ); // invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
	 int v0 = -1; // const/4 v0, -0x1
	 /* if-nez p2, :cond_0 */
	 /* .line 3 */
	 v1 = 	 (( c.b.q.k2 ) p1 ).g ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lc/b/q/k2;->g(II)I
	 /* if-eq v1, v0, :cond_0 */
	 /* .line 4 */
	 p2 = this.a;
	 (( android.widget.ImageView ) p2 ).getContext ( ); // invoke-virtual {p2}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;
	 c.b.l.a.b .c ( p2,v1 );
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 5 */
		 v1 = this.a;
		 (( android.widget.ImageView ) v1 ).setImageDrawable ( p2 ); // invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
	 } // :cond_0
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 6 */
		 c.b.q.a1 .b ( p2 );
		 /* .line 7 */
	 } // :cond_1
	 p2 = 	 (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 /* .line 8 */
		 p2 = this.a;
		 /* .line 9 */
		 (( c.b.q.k2 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
		 /* .line 10 */
		 c.h.o.h .a ( p2,v1 );
		 /* .line 11 */
	 } // :cond_2
	 p2 = 	 (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
	 if ( p2 != null) { // if-eqz p2, :cond_3
		 /* .line 12 */
		 p2 = this.a;
		 /* .line 13 */
		 v0 = 		 (( c.b.q.k2 ) p1 ).d ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lc/b/q/k2;->d(II)I
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 14 */
		 c.b.q.a1 .a ( v0,v1 );
		 /* .line 15 */
		 c.h.o.h .a ( p2,v0 );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 16 */
	 } // :cond_3
	 (( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
	 return;
	 /* :catchall_0 */
	 /* move-exception p2 */
	 (( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
	 /* .line 17 */
	 /* throw p2 */
} // .end method
public final Boolean a ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 3 */
	 /* .line 45 */
	 v0 = this.d;
	 /* if-nez v0, :cond_0 */
	 /* .line 46 */
	 /* new-instance v0, Lc/b/q/i2; */
	 /* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
	 this.d = v0;
	 /* .line 47 */
} // :cond_0
v0 = this.d;
/* .line 48 */
(( c.b.q.i2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/i2;->a()V
/* .line 49 */
v1 = this.a;
c.h.o.h .a ( v1 );
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 50 */
	 /* iput-boolean v2, v0, Lc/b/q/i2;->d:Z */
	 /* .line 51 */
	 this.a = v1;
	 /* .line 52 */
} // :cond_1
v1 = this.a;
c.h.o.h .b ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 53 */
	 /* iput-boolean v2, v0, Lc/b/q/i2;->c:Z */
	 /* .line 54 */
	 this.b = v1;
	 /* .line 55 */
} // :cond_2
/* iget-boolean v1, v0, Lc/b/q/i2;->d:Z */
/* if-nez v1, :cond_4 */
/* iget-boolean v1, v0, Lc/b/q/i2;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
/* .line 56 */
} // :cond_4
} // :goto_0
v1 = this.a;
(( android.widget.ImageView ) v1 ).getDrawableState ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawableState()[I
c.b.q.s .a ( p1,v0,v1 );
} // .end method
public android.content.res.ColorStateList b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean d ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
(( android.widget.ImageView ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
/* .line 2 */
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_0 */
/* instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final Boolean e ( ) {
/* .locals 4 */
/* .line 1 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x15 */
/* if-le v0, v3, :cond_1 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // :cond_1
/* if-ne v0, v3, :cond_2 */
} // :cond_2
} // .end method
