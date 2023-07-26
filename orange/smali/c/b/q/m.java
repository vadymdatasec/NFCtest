public class c.b.q.m {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.View a;
	 public final c.b.q.s b;
	 public Integer c;
	 public c.b.q.i2 d;
	 public c.b.q.i2 e;
	 public c.b.q.i2 f;
	 /* # direct methods */
	 public c.b.q.m ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lc/b/q/m;->c:I */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 c.b.q.s .b ( );
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 28 */
		 v0 = this.a;
		 (( android.view.View ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 29 */
			 v1 = 			 (( c.b.q.m ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/q/m;->d()Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 30 */
				 v1 = 				 (( c.b.q.m ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/m;->a(Landroid/graphics/drawable/Drawable;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 return;
					 /* .line 31 */
				 } // :cond_0
				 v1 = this.e;
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 /* .line 32 */
					 v2 = this.a;
					 /* .line 33 */
					 (( android.view.View ) v2 ).getDrawableState ( ); // invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I
					 /* .line 34 */
					 c.b.q.s .a ( v0,v1,v2 );
					 /* .line 35 */
				 } // :cond_1
				 v1 = this.d;
				 if ( v1 != null) { // if-eqz v1, :cond_2
					 /* .line 36 */
					 v2 = this.a;
					 /* .line 37 */
					 (( android.view.View ) v2 ).getDrawableState ( ); // invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I
					 /* .line 38 */
					 c.b.q.s .a ( v0,v1,v2 );
				 } // :cond_2
			 } // :goto_0
			 return;
		 } // .end method
		 public void a ( Integer p0 ) {
			 /* .locals 2 */
			 /* .line 18 */
			 /* iput p1, p0, Lc/b/q/m;->c:I */
			 /* .line 19 */
			 v0 = this.b;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v1 = this.a;
				 /* .line 20 */
				 (( android.view.View ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;
				 (( c.b.q.s ) v0 ).b ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/b/q/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 21 */
		 } // :goto_0
		 (( c.b.q.m ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/m;->a(Landroid/content/res/ColorStateList;)V
		 /* .line 22 */
		 (( c.b.q.m ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/m;->a()V
		 return;
	 } // .end method
	 public void a ( android.content.res.ColorStateList p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 39 */
			 v0 = this.d;
			 /* if-nez v0, :cond_0 */
			 /* .line 40 */
			 /* new-instance v0, Lc/b/q/i2; */
			 /* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
			 this.d = v0;
			 /* .line 41 */
		 } // :cond_0
		 v0 = this.d;
		 this.a = p1;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 42 */
		 /* iput-boolean p1, v0, Lc/b/q/i2;->d:Z */
	 } // :cond_1
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 43 */
	 this.d = p1;
	 /* .line 44 */
} // :goto_0
(( c.b.q.m ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/m;->a()V
return;
} // .end method
public void a ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 23 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 24 */
/* new-instance v0, Lc/b/q/i2; */
/* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
this.e = v0;
/* .line 25 */
} // :cond_0
v0 = this.e;
this.b = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 26 */
/* iput-boolean p1, v0, Lc/b/q/i2;->c:Z */
/* .line 27 */
(( c.b.q.m ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/m;->a()V
return;
} // .end method
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
(( android.view.View ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;
v1 = c.b.j.ViewBackgroundHelper;
int v2 = 0; // const/4 v2, 0x0
c.b.q.k2 .a ( v0,p1,v1,p2,v2 );
/* .line 2 */
try { // :try_start_0
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
int v0 = -1; // const/4 v0, -0x1
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 3 */
	 p2 = 	 (( c.b.q.k2 ) p1 ).g ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/q/k2;->g(II)I
	 /* iput p2, p0, Lc/b/q/m;->c:I */
	 /* .line 4 */
	 p2 = this.b;
	 v1 = this.a;
	 /* .line 5 */
	 (( android.view.View ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;
	 /* iget v2, p0, Lc/b/q/m;->c:I */
	 (( c.b.q.s ) p2 ).b ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Lc/b/q/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 6 */
		 (( c.b.q.m ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/m;->a(Landroid/content/res/ColorStateList;)V
		 /* .line 7 */
	 } // :cond_0
	 p2 = 	 (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 8 */
		 p2 = this.a;
		 /* .line 9 */
		 (( c.b.q.k2 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
		 /* .line 10 */
		 c.h.n.v0 .a ( p2,v1 );
		 /* .line 11 */
	 } // :cond_1
	 p2 = 	 (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 /* .line 12 */
		 p2 = this.a;
		 /* .line 13 */
		 v0 = 		 (( c.b.q.k2 ) p1 ).d ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lc/b/q/k2;->d(II)I
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 14 */
		 c.b.q.a1 .a ( v0,v1 );
		 /* .line 15 */
		 c.h.n.v0 .a ( p2,v0 );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 16 */
	 } // :cond_2
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
	 v0 = this.f;
	 /* if-nez v0, :cond_0 */
	 /* .line 46 */
	 /* new-instance v0, Lc/b/q/i2; */
	 /* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
	 this.f = v0;
	 /* .line 47 */
} // :cond_0
v0 = this.f;
/* .line 48 */
(( c.b.q.i2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/i2;->a()V
/* .line 49 */
v1 = this.a;
c.h.n.v0 .g ( v1 );
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 50 */
	 /* iput-boolean v2, v0, Lc/b/q/i2;->d:Z */
	 /* .line 51 */
	 this.a = v1;
	 /* .line 52 */
} // :cond_1
v1 = this.a;
c.h.n.v0 .h ( v1 );
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
(( android.view.View ) v1 ).getDrawableState ( ); // invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I
c.b.q.s .a ( p1,v0,v1 );
} // .end method
public android.content.res.ColorStateList b ( ) {
/* .locals 1 */
/* .line 9 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 5 */
/* new-instance v0, Lc/b/q/i2; */
/* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
this.e = v0;
/* .line 6 */
} // :cond_0
v0 = this.e;
this.a = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 7 */
/* iput-boolean p1, v0, Lc/b/q/i2;->d:Z */
/* .line 8 */
(( c.b.q.m ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/m;->a()V
return;
} // .end method
public void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 1 */
/* iput p1, p0, Lc/b/q/m;->c:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
(( c.b.q.m ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/m;->a(Landroid/content/res/ColorStateList;)V
/* .line 3 */
(( c.b.q.m ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/m;->a()V
return;
} // .end method
public android.graphics.PorterDuff$Mode c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean d ( ) {
/* .locals 4 */
/* .line 1 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x15 */
/* if-le v0, v3, :cond_1 */
/* .line 2 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // :cond_1
/* if-ne v0, v3, :cond_2 */
} // :cond_2
} // .end method
