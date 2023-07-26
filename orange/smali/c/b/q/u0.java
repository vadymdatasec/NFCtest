public class c.b.q.u0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.widget.TextView a;
	 public c.b.q.i2 b;
	 public c.b.q.i2 c;
	 public c.b.q.i2 d;
	 public c.b.q.i2 e;
	 public c.b.q.i2 f;
	 public c.b.q.i2 g;
	 public c.b.q.i2 h;
	 public final c.b.q.w0 i;
	 public Integer j;
	 public Integer k;
	 public android.graphics.Typeface l;
	 public Boolean m;
	 /* # direct methods */
	 public c.b.q.u0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lc/b/q/u0;->j:I */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 3 */
		 /* iput v0, p0, Lc/b/q/u0;->k:I */
		 /* .line 4 */
		 this.a = p1;
		 /* .line 5 */
		 /* new-instance p1, Lc/b/q/w0; */
		 v0 = this.a;
		 /* invoke-direct {p1, v0}, Lc/b/q/w0;-><init>(Landroid/widget/TextView;)V */
		 this.i = p1;
		 return;
	 } // .end method
	 public static c.b.q.i2 a ( android.content.Context p0, Object p1, Integer p2 ) {
		 /* .locals 0 */
		 /* .line 192 */
		 (( c.b.q.s ) p1 ).b ( p0, p2 ); // invoke-virtual {p1, p0, p2}, Lc/b/q/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 193 */
			 /* new-instance p1, Lc/b/q/i2; */
			 /* invoke-direct {p1}, Lc/b/q/i2;-><init>()V */
			 int p2 = 1; // const/4 p2, 0x1
			 /* .line 194 */
			 /* iput-boolean p2, p1, Lc/b/q/i2;->d:Z */
			 /* .line 195 */
			 this.a = p0;
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 5 */
		 /* .line 180 */
		 v0 = this.b;
		 int v1 = 2; // const/4 v1, 0x2
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-nez v0, :cond_0 */
		 v0 = this.c;
		 /* if-nez v0, :cond_0 */
		 v0 = this.d;
		 /* if-nez v0, :cond_0 */
		 v0 = this.e;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 181 */
		 } // :cond_0
		 v0 = this.a;
		 (( android.widget.TextView ) v0 ).getCompoundDrawables ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;
		 /* .line 182 */
		 /* aget-object v3, v0, v2 */
		 v4 = this.b;
		 (( c.b.q.u0 ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;)V
		 int v3 = 1; // const/4 v3, 0x1
		 /* .line 183 */
		 /* aget-object v3, v0, v3 */
		 v4 = this.c;
		 (( c.b.q.u0 ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;)V
		 /* .line 184 */
		 /* aget-object v3, v0, v1 */
		 v4 = this.d;
		 (( c.b.q.u0 ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;)V
		 int v3 = 3; // const/4 v3, 0x3
		 /* .line 185 */
		 /* aget-object v0, v0, v3 */
		 v3 = this.e;
		 (( c.b.q.u0 ) p0 ).a ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;)V
		 /* .line 186 */
	 } // :cond_1
	 /* const/16 v3, 0x11 */
	 /* if-lt v0, v3, :cond_3 */
	 /* .line 187 */
	 v0 = this.f;
	 /* if-nez v0, :cond_2 */
	 v0 = this.g;
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 188 */
	 } // :cond_2
	 v0 = this.a;
	 (( android.widget.TextView ) v0 ).getCompoundDrawablesRelative ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;
	 /* .line 189 */
	 /* aget-object v2, v0, v2 */
	 v3 = this.f;
	 (( c.b.q.u0 ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;)V
	 /* .line 190 */
	 /* aget-object v0, v0, v1 */
	 v1 = this.g;
	 (( c.b.q.u0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;)V
} // :cond_3
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 201 */
v0 = this.i;
(( c.b.q.w0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/w0;->b(I)V
return;
} // .end method
public void a ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .line 198 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
/* if-nez v0, :cond_0 */
/* .line 199 */
v0 = (( c.b.q.u0 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/u0;->j()Z
/* if-nez v0, :cond_0 */
/* .line 200 */
(( c.b.q.u0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/q/u0;->b(IF)V
} // :cond_0
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 202 */
v0 = this.i;
(( c.b.q.w0 ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/b/q/w0;->a(IIII)V
return;
} // .end method
public void a ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
/* .line 160 */
v0 = c.b.j.TextAppearance;
c.b.q.k2 .a ( p1,p2,v0 );
/* .line 161 */
v0 = (( c.b.q.k2 ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->g(I)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 162 */
v0 = (( c.b.q.k2 ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lc/b/q/k2;->a(IZ)Z
(( c.b.q.u0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/u0;->a(Z)V
/* .line 163 */
} // :cond_0
/* const/16 v2, 0x17 */
/* if-ge v0, v2, :cond_1 */
/* .line 164 */
v0 = (( c.b.q.k2 ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->g(I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 165 */
/* .line 166 */
(( c.b.q.k2 ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 167 */
v2 = this.a;
(( android.widget.TextView ) v2 ).setTextColor ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
/* .line 168 */
} // :cond_1
v0 = (( c.b.q.k2 ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->g(I)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 169 */
int v2 = -1; // const/4 v2, -0x1
v0 = (( c.b.q.k2 ) p2 ).c ( v0, v2 ); // invoke-virtual {p2, v0, v2}, Lc/b/q/k2;->c(II)I
/* if-nez v0, :cond_2 */
/* .line 170 */
v0 = this.a;
int v2 = 0; // const/4 v2, 0x0
(( android.widget.TextView ) v0 ).setTextSize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V
/* .line 171 */
} // :cond_2
(( c.b.q.u0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/q/u0;->a(Landroid/content/Context;Lc/b/q/k2;)V
/* .line 172 */
/* const/16 v0, 0x1a */
/* if-lt p1, v0, :cond_3 */
/* .line 173 */
p1 = (( c.b.q.k2 ) p2 ).g ( p1 ); // invoke-virtual {p2, p1}, Lc/b/q/k2;->g(I)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 174 */
(( c.b.q.k2 ) p2 ).d ( p1 ); // invoke-virtual {p2, p1}, Lc/b/q/k2;->d(I)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_3
	 /* .line 175 */
	 v0 = this.a;
	 (( android.widget.TextView ) v0 ).setFontVariationSettings ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z
	 /* .line 176 */
} // :cond_3
(( c.b.q.k2 ) p2 ).a ( ); // invoke-virtual {p2}, Lc/b/q/k2;->a()V
/* .line 177 */
p1 = this.l;
if ( p1 != null) { // if-eqz p1, :cond_4
	 /* .line 178 */
	 p2 = this.a;
	 /* iget v0, p0, Lc/b/q/u0;->j:I */
	 (( android.widget.TextView ) p2 ).setTypeface ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
} // :cond_4
return;
} // .end method
public final void a ( android.content.Context p0, c.b.q.k2 p1 ) {
/* .locals 8 */
/* .line 130 */
/* iget v1, p0, Lc/b/q/u0;->j:I */
v0 = (( c.b.q.k2 ) p2 ).d ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lc/b/q/k2;->d(II)I
/* iput v0, p0, Lc/b/q/u0;->j:I */
/* .line 131 */
/* const/16 v1, 0x1c */
int v2 = 2; // const/4 v2, 0x2
int v3 = -1; // const/4 v3, -0x1
int v4 = 0; // const/4 v4, 0x0
/* if-lt v0, v1, :cond_0 */
/* .line 132 */
v0 = (( c.b.q.k2 ) p2 ).d ( v0, v3 ); // invoke-virtual {p2, v0, v3}, Lc/b/q/k2;->d(II)I
/* iput v0, p0, Lc/b/q/u0;->k:I */
/* if-eq v0, v3, :cond_0 */
/* .line 133 */
/* iget v0, p0, Lc/b/q/u0;->j:I */
/* and-int/2addr v0, v2 */
/* or-int/2addr v0, v4 */
/* iput v0, p0, Lc/b/q/u0;->j:I */
/* .line 134 */
} // :cond_0
v0 = (( c.b.q.k2 ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->g(I)Z
int v5 = 1; // const/4 v5, 0x1
/* if-nez v0, :cond_6 */
/* .line 135 */
v0 = (( c.b.q.k2 ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->g(I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 136 */
} // :cond_1
p1 = (( c.b.q.k2 ) p2 ).g ( p1 ); // invoke-virtual {p2, p1}, Lc/b/q/k2;->g(I)Z
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 137 */
/* iput-boolean v4, p0, Lc/b/q/u0;->m:Z */
/* .line 138 */
p1 = (( c.b.q.k2 ) p2 ).d ( p1, v5 ); // invoke-virtual {p2, p1, v5}, Lc/b/q/k2;->d(II)I
/* if-eq p1, v5, :cond_4 */
/* if-eq p1, v2, :cond_3 */
int p2 = 3; // const/4 p2, 0x3
/* if-eq p1, p2, :cond_2 */
/* .line 139 */
} // :cond_2
p1 = android.graphics.Typeface.MONOSPACE;
this.l = p1;
/* .line 140 */
} // :cond_3
p1 = android.graphics.Typeface.SERIF;
this.l = p1;
/* .line 141 */
} // :cond_4
p1 = android.graphics.Typeface.SANS_SERIF;
this.l = p1;
} // :cond_5
} // :goto_0
return;
} // :cond_6
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 142 */
this.l = v0;
/* .line 143 */
v0 = (( c.b.q.k2 ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->g(I)Z
if ( v0 != null) { // if-eqz v0, :cond_7
} // :cond_7
/* .line 144 */
} // :goto_2
/* iget v6, p0, Lc/b/q/u0;->k:I */
/* .line 145 */
/* iget v7, p0, Lc/b/q/u0;->j:I */
/* .line 146 */
p1 = (( android.content.Context ) p1 ).isRestricted ( ); // invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z
/* if-nez p1, :cond_c */
/* .line 147 */
/* new-instance p1, Lc/b/q/t0; */
/* invoke-direct {p1, p0, v6, v7}, Lc/b/q/t0;-><init>(Lc/b/q/u0;II)V */
/* .line 148 */
try { // :try_start_0
/* iget v6, p0, Lc/b/q/u0;->j:I */
(( c.b.q.k2 ) p2 ).a ( v0, v6, p1 ); // invoke-virtual {p2, v0, v6, p1}, Lc/b/q/k2;->a(IILc/h/f/i/r;)Landroid/graphics/Typeface;
if ( p1 != null) { // if-eqz p1, :cond_a
/* .line 149 */
/* if-lt v6, v1, :cond_9 */
/* iget v6, p0, Lc/b/q/u0;->k:I */
/* if-eq v6, v3, :cond_9 */
/* .line 150 */
android.graphics.Typeface .create ( p1,v4 );
/* iget v6, p0, Lc/b/q/u0;->k:I */
/* iget v7, p0, Lc/b/q/u0;->j:I */
/* and-int/2addr v7, v2 */
if ( v7 != null) { // if-eqz v7, :cond_8
int v7 = 1; // const/4 v7, 0x1
} // :cond_8
int v7 = 0; // const/4 v7, 0x0
/* .line 151 */
} // :goto_3
android.graphics.Typeface .create ( p1,v6,v7 );
this.l = p1;
/* .line 152 */
} // :cond_9
this.l = p1;
/* .line 153 */
} // :cond_a
} // :goto_4
p1 = this.l;
/* if-nez p1, :cond_b */
int p1 = 1; // const/4 p1, 0x1
} // :cond_b
int p1 = 0; // const/4 p1, 0x0
} // :goto_5
/* iput-boolean p1, p0, Lc/b/q/u0;->m:Z */
/* :try_end_0 */
/* .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
/* .line 154 */
} // :cond_c
} // :goto_6
p1 = this.l;
/* if-nez p1, :cond_f */
/* .line 155 */
(( c.b.q.k2 ) p2 ).d ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k2;->d(I)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_f
/* .line 156 */
/* if-lt p2, v1, :cond_e */
/* iget p2, p0, Lc/b/q/u0;->k:I */
/* if-eq p2, v3, :cond_e */
/* .line 157 */
android.graphics.Typeface .create ( p1,v4 );
/* iget p2, p0, Lc/b/q/u0;->k:I */
/* iget v0, p0, Lc/b/q/u0;->j:I */
/* and-int/2addr v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_d
int v4 = 1; // const/4 v4, 0x1
/* .line 158 */
} // :cond_d
android.graphics.Typeface .create ( p1,p2,v4 );
this.l = p1;
/* .line 159 */
} // :cond_e
/* iget p2, p0, Lc/b/q/u0;->j:I */
android.graphics.Typeface .create ( p1,p2 );
this.l = p1;
} // :cond_f
} // :goto_7
return;
} // .end method
public void a ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 204 */
v0 = this.h;
/* if-nez v0, :cond_0 */
/* .line 205 */
/* new-instance v0, Lc/b/q/i2; */
/* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
this.h = v0;
/* .line 206 */
} // :cond_0
v0 = this.h;
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 207 */
} // :goto_0
/* iput-boolean p1, v0, Lc/b/q/i2;->d:Z */
/* .line 208 */
(( c.b.q.u0 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/b/q/u0;->l()V
return;
} // .end method
public void a ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 209 */
v0 = this.h;
/* if-nez v0, :cond_0 */
/* .line 210 */
/* new-instance v0, Lc/b/q/i2; */
/* invoke-direct {v0}, Lc/b/q/i2;-><init>()V */
this.h = v0;
/* .line 211 */
} // :cond_0
v0 = this.h;
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 212 */
} // :goto_0
/* iput-boolean p1, v0, Lc/b/q/i2;->c:Z */
/* .line 213 */
(( c.b.q.u0 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/b/q/u0;->l()V
return;
} // .end method
public void a ( android.graphics.Typeface p0 ) {
/* .locals 1 */
/* .line 126 */
/* iget-boolean v0, p0, Lc/b/q/u0;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 127 */
v0 = this.a;
(( android.widget.TextView ) v0 ).setTypeface ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 128 */
this.l = p1;
} // :cond_0
return;
} // .end method
public final void a ( android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4, android.graphics.drawable.Drawable p5 ) {
/* .locals 6 */
/* .line 214 */
/* const/16 v1, 0x11 */
int v2 = 3; // const/4 v2, 0x3
int v3 = 1; // const/4 v3, 0x1
int v4 = 2; // const/4 v4, 0x2
int v5 = 0; // const/4 v5, 0x0
/* if-lt v0, v1, :cond_5 */
/* if-nez p5, :cond_0 */
if ( p6 != null) { // if-eqz p6, :cond_5
/* .line 215 */
} // :cond_0
p1 = this.a;
(( android.widget.TextView ) p1 ).getCompoundDrawablesRelative ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;
/* .line 216 */
p3 = this.a;
if ( p5 != null) { // if-eqz p5, :cond_1
} // :cond_1
/* aget-object p5, p1, v5 */
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_2
} // :cond_2
/* aget-object p2, p1, v3 */
} // :goto_1
if ( p6 != null) { // if-eqz p6, :cond_3
} // :cond_3
/* aget-object p6, p1, v4 */
} // :goto_2
if ( p4 != null) { // if-eqz p4, :cond_4
} // :cond_4
/* aget-object p4, p1, v2 */
} // :goto_3
(( android.widget.TextView ) p3 ).setCompoundDrawablesRelativeWithIntrinsicBounds ( p5, p2, p6, p4 ); // invoke-virtual {p3, p5, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
} // :cond_5
/* if-nez p1, :cond_6 */
/* if-nez p2, :cond_6 */
/* if-nez p3, :cond_6 */
if ( p4 != null) { // if-eqz p4, :cond_f
/* .line 217 */
} // :cond_6
/* if-lt p5, v1, :cond_a */
/* .line 218 */
p5 = this.a;
(( android.widget.TextView ) p5 ).getCompoundDrawablesRelative ( ); // invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;
/* .line 219 */
/* aget-object p6, p5, v5 */
/* if-nez p6, :cond_7 */
/* aget-object p6, p5, v4 */
if ( p6 != null) { // if-eqz p6, :cond_a
/* .line 220 */
} // :cond_7
p1 = this.a;
/* aget-object p3, p5, v5 */
if ( p2 != null) { // if-eqz p2, :cond_8
} // :cond_8
/* aget-object p2, p5, v3 */
} // :goto_4
/* aget-object p6, p5, v4 */
if ( p4 != null) { // if-eqz p4, :cond_9
} // :cond_9
/* aget-object p4, p5, v2 */
} // :goto_5
(( android.widget.TextView ) p1 ).setCompoundDrawablesRelativeWithIntrinsicBounds ( p3, p2, p6, p4 ); // invoke-virtual {p1, p3, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
return;
/* .line 221 */
} // :cond_a
p5 = this.a;
(( android.widget.TextView ) p5 ).getCompoundDrawables ( ); // invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;
/* .line 222 */
p6 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_b
} // :cond_b
/* aget-object p1, p5, v5 */
} // :goto_6
if ( p2 != null) { // if-eqz p2, :cond_c
} // :cond_c
/* aget-object p2, p5, v3 */
} // :goto_7
if ( p3 != null) { // if-eqz p3, :cond_d
} // :cond_d
/* aget-object p3, p5, v4 */
} // :goto_8
if ( p4 != null) { // if-eqz p4, :cond_e
} // :cond_e
/* aget-object p4, p5, v2 */
} // :goto_9
(( android.widget.TextView ) p6 ).setCompoundDrawablesWithIntrinsicBounds ( p1, p2, p3, p4 ); // invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
} // :cond_f
} // :goto_a
return;
} // .end method
public final void a ( android.graphics.drawable.Drawable p0, c.b.q.i2 p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 191 */
v0 = this.a;
(( android.widget.TextView ) v0 ).getDrawableState ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I
c.b.q.s .a ( p1,p2,v0 );
} // :cond_0
return;
} // .end method
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 17 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "NewApi" */
/* } */
} // .end annotation
/* move-object/from16 v7, p0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* .line 1 */
v2 = this.a;
(( android.widget.TextView ) v2 ).getContext ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
/* .line 2 */
c.b.q.s .b ( );
/* .line 3 */
v4 = c.b.j.AppCompatTextHelper;
int v5 = 0; // const/4 v5, 0x0
c.b.q.k2 .a ( v2,v0,v4,v1,v5 );
/* .line 4 */
int v8 = -1; // const/4 v8, -0x1
v6 = (( c.b.q.k2 ) v4 ).g ( v6, v8 ); // invoke-virtual {v4, v6, v8}, Lc/b/q/k2;->g(II)I
/* .line 5 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9 ); // invoke-virtual {v4, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 6 */
/* .line 7 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9, v5 ); // invoke-virtual {v4, v9, v5}, Lc/b/q/k2;->g(II)I
/* .line 8 */
c.b.q.u0 .a ( v2,v3,v9 );
this.b = v9;
/* .line 9 */
} // :cond_0
v9 = (( c.b.q.k2 ) v4 ).g ( v9 ); // invoke-virtual {v4, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 10 */
/* .line 11 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9, v5 ); // invoke-virtual {v4, v9, v5}, Lc/b/q/k2;->g(II)I
/* .line 12 */
c.b.q.u0 .a ( v2,v3,v9 );
this.c = v9;
/* .line 13 */
} // :cond_1
v9 = (( c.b.q.k2 ) v4 ).g ( v9 ); // invoke-virtual {v4, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 14 */
/* .line 15 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9, v5 ); // invoke-virtual {v4, v9, v5}, Lc/b/q/k2;->g(II)I
/* .line 16 */
c.b.q.u0 .a ( v2,v3,v9 );
this.d = v9;
/* .line 17 */
} // :cond_2
v9 = (( c.b.q.k2 ) v4 ).g ( v9 ); // invoke-virtual {v4, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_3
/* .line 18 */
/* .line 19 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9, v5 ); // invoke-virtual {v4, v9, v5}, Lc/b/q/k2;->g(II)I
/* .line 20 */
c.b.q.u0 .a ( v2,v3,v9 );
this.e = v9;
/* .line 21 */
} // :cond_3
/* const/16 v10, 0x11 */
/* if-lt v9, v10, :cond_5 */
/* .line 22 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9 ); // invoke-virtual {v4, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 23 */
/* .line 24 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9, v5 ); // invoke-virtual {v4, v9, v5}, Lc/b/q/k2;->g(II)I
/* .line 25 */
c.b.q.u0 .a ( v2,v3,v9 );
this.f = v9;
/* .line 26 */
} // :cond_4
v9 = (( c.b.q.k2 ) v4 ).g ( v9 ); // invoke-virtual {v4, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 27 */
/* .line 28 */
v9 = (( c.b.q.k2 ) v4 ).g ( v9, v5 ); // invoke-virtual {v4, v9, v5}, Lc/b/q/k2;->g(II)I
/* .line 29 */
c.b.q.u0 .a ( v2,v3,v9 );
this.g = v9;
/* .line 30 */
} // :cond_5
(( c.b.q.k2 ) v4 ).a ( ); // invoke-virtual {v4}, Lc/b/q/k2;->a()V
/* .line 31 */
v4 = this.a;
/* .line 32 */
(( android.widget.TextView ) v4 ).getTransformationMethod ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;
/* instance-of v4, v4, Landroid/text/method/PasswordTransformationMethod; */
/* const/16 v9, 0x1a */
/* const/16 v11, 0x17 */
/* if-eq v6, v8, :cond_d */
/* .line 33 */
v13 = c.b.j.TextAppearance;
c.b.q.k2 .a ( v2,v6,v13 );
/* if-nez v4, :cond_6 */
/* .line 34 */
v13 = (( c.b.q.k2 ) v6 ).g ( v13 ); // invoke-virtual {v6, v13}, Lc/b/q/k2;->g(I)Z
if ( v13 != null) { // if-eqz v13, :cond_6
/* .line 35 */
v13 = (( c.b.q.k2 ) v6 ).a ( v13, v5 ); // invoke-virtual {v6, v13, v5}, Lc/b/q/k2;->a(IZ)Z
int v14 = 1; // const/4 v14, 0x1
} // :cond_6
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
/* .line 36 */
} // :goto_0
(( c.b.q.u0 ) v7 ).a ( v2, v6 ); // invoke-virtual {v7, v2, v6}, Lc/b/q/u0;->a(Landroid/content/Context;Lc/b/q/k2;)V
/* .line 37 */
/* if-ge v15, v11, :cond_a */
/* .line 38 */
v15 = (( c.b.q.k2 ) v6 ).g ( v15 ); // invoke-virtual {v6, v15}, Lc/b/q/k2;->g(I)Z
if ( v15 != null) { // if-eqz v15, :cond_7
/* .line 39 */
(( c.b.q.k2 ) v6 ).a ( v15 ); // invoke-virtual {v6, v15}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
} // :cond_7
int v15 = 0; // const/4 v15, 0x0
/* .line 40 */
} // :goto_1
v10 = (( c.b.q.k2 ) v6 ).g ( v10 ); // invoke-virtual {v6, v10}, Lc/b/q/k2;->g(I)Z
if ( v10 != null) { // if-eqz v10, :cond_8
/* .line 41 */
(( c.b.q.k2 ) v6 ).a ( v10 ); // invoke-virtual {v6, v10}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
} // :cond_8
int v10 = 0; // const/4 v10, 0x0
/* .line 42 */
} // :goto_2
v12 = (( c.b.q.k2 ) v6 ).g ( v12 ); // invoke-virtual {v6, v12}, Lc/b/q/k2;->g(I)Z
if ( v12 != null) { // if-eqz v12, :cond_9
/* .line 43 */
(( c.b.q.k2 ) v6 ).a ( v12 ); // invoke-virtual {v6, v12}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
} // :cond_9
int v12 = 0; // const/4 v12, 0x0
} // :cond_a
int v10 = 0; // const/4 v10, 0x0
int v12 = 0; // const/4 v12, 0x0
int v15 = 0; // const/4 v15, 0x0
/* .line 44 */
} // :goto_3
v8 = (( c.b.q.k2 ) v6 ).g ( v8 ); // invoke-virtual {v6, v8}, Lc/b/q/k2;->g(I)Z
if ( v8 != null) { // if-eqz v8, :cond_b
/* .line 45 */
(( c.b.q.k2 ) v6 ).d ( v8 ); // invoke-virtual {v6, v8}, Lc/b/q/k2;->d(I)Ljava/lang/String;
} // :cond_b
int v8 = 0; // const/4 v8, 0x0
/* .line 46 */
} // :goto_4
/* if-lt v11, v9, :cond_c */
/* .line 47 */
v11 = (( c.b.q.k2 ) v6 ).g ( v11 ); // invoke-virtual {v6, v11}, Lc/b/q/k2;->g(I)Z
if ( v11 != null) { // if-eqz v11, :cond_c
/* .line 48 */
(( c.b.q.k2 ) v6 ).d ( v11 ); // invoke-virtual {v6, v11}, Lc/b/q/k2;->d(I)Ljava/lang/String;
} // :cond_c
int v11 = 0; // const/4 v11, 0x0
/* .line 49 */
} // :goto_5
(( c.b.q.k2 ) v6 ).a ( ); // invoke-virtual {v6}, Lc/b/q/k2;->a()V
} // :cond_d
int v8 = 0; // const/4 v8, 0x0
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* .line 50 */
} // :goto_6
v6 = c.b.j.TextAppearance;
c.b.q.k2 .a ( v2,v0,v6,v1,v5 );
/* if-nez v4, :cond_e */
/* .line 51 */
v9 = (( c.b.q.k2 ) v6 ).g ( v9 ); // invoke-virtual {v6, v9}, Lc/b/q/k2;->g(I)Z
if ( v9 != null) { // if-eqz v9, :cond_e
/* .line 52 */
v13 = (( c.b.q.k2 ) v6 ).a ( v9, v5 ); // invoke-virtual {v6, v9, v5}, Lc/b/q/k2;->a(IZ)Z
int v14 = 1; // const/4 v14, 0x1
/* .line 53 */
} // :cond_e
/* const/16 v5, 0x17 */
/* if-ge v9, v5, :cond_11 */
/* .line 54 */
v5 = (( c.b.q.k2 ) v6 ).g ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->g(I)Z
if ( v5 != null) { // if-eqz v5, :cond_f
/* .line 55 */
(( c.b.q.k2 ) v6 ).a ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
/* .line 56 */
} // :cond_f
v5 = (( c.b.q.k2 ) v6 ).g ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->g(I)Z
if ( v5 != null) { // if-eqz v5, :cond_10
/* .line 57 */
(( c.b.q.k2 ) v6 ).a ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
/* .line 58 */
} // :cond_10
v5 = (( c.b.q.k2 ) v6 ).g ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->g(I)Z
if ( v5 != null) { // if-eqz v5, :cond_11
/* .line 59 */
(( c.b.q.k2 ) v6 ).a ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
/* .line 60 */
} // :cond_11
v5 = (( c.b.q.k2 ) v6 ).g ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->g(I)Z
if ( v5 != null) { // if-eqz v5, :cond_12
/* .line 61 */
(( c.b.q.k2 ) v6 ).d ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->d(I)Ljava/lang/String;
/* .line 62 */
} // :cond_12
/* const/16 v9, 0x1a */
/* if-lt v5, v9, :cond_13 */
/* .line 63 */
v5 = (( c.b.q.k2 ) v6 ).g ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->g(I)Z
if ( v5 != null) { // if-eqz v5, :cond_13
/* .line 64 */
(( c.b.q.k2 ) v6 ).d ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->d(I)Ljava/lang/String;
/* .line 65 */
} // :cond_13
/* const/16 v9, 0x1c */
/* if-lt v5, v9, :cond_14 */
/* .line 66 */
v5 = (( c.b.q.k2 ) v6 ).g ( v5 ); // invoke-virtual {v6, v5}, Lc/b/q/k2;->g(I)Z
if ( v5 != null) { // if-eqz v5, :cond_14
/* .line 67 */
int v9 = -1; // const/4 v9, -0x1
v5 = (( c.b.q.k2 ) v6 ).c ( v5, v9 ); // invoke-virtual {v6, v5, v9}, Lc/b/q/k2;->c(II)I
/* if-nez v5, :cond_14 */
/* .line 68 */
v5 = this.a;
int v9 = 0; // const/4 v9, 0x0
/* move-object/from16 v16, v3 */
int v3 = 0; // const/4 v3, 0x0
(( android.widget.TextView ) v5 ).setTextSize ( v3, v9 ); // invoke-virtual {v5, v3, v9}, Landroid/widget/TextView;->setTextSize(IF)V
} // :cond_14
/* move-object/from16 v16, v3 */
/* .line 69 */
} // :goto_7
(( c.b.q.u0 ) v7 ).a ( v2, v6 ); // invoke-virtual {v7, v2, v6}, Lc/b/q/u0;->a(Landroid/content/Context;Lc/b/q/k2;)V
/* .line 70 */
(( c.b.q.k2 ) v6 ).a ( ); // invoke-virtual {v6}, Lc/b/q/k2;->a()V
if ( v15 != null) { // if-eqz v15, :cond_15
/* .line 71 */
v3 = this.a;
(( android.widget.TextView ) v3 ).setTextColor ( v15 ); // invoke-virtual {v3, v15}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
} // :cond_15
if ( v10 != null) { // if-eqz v10, :cond_16
/* .line 72 */
v3 = this.a;
(( android.widget.TextView ) v3 ).setHintTextColor ( v10 ); // invoke-virtual {v3, v10}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V
} // :cond_16
if ( v12 != null) { // if-eqz v12, :cond_17
/* .line 73 */
v3 = this.a;
(( android.widget.TextView ) v3 ).setLinkTextColor ( v12 ); // invoke-virtual {v3, v12}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V
} // :cond_17
/* if-nez v4, :cond_18 */
if ( v14 != null) { // if-eqz v14, :cond_18
/* .line 74 */
(( c.b.q.u0 ) v7 ).a ( v13 ); // invoke-virtual {v7, v13}, Lc/b/q/u0;->a(Z)V
/* .line 75 */
} // :cond_18
v3 = this.l;
if ( v3 != null) { // if-eqz v3, :cond_1a
/* .line 76 */
/* iget v4, v7, Lc/b/q/u0;->k:I */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_19 */
/* .line 77 */
v4 = this.a;
/* iget v5, v7, Lc/b/q/u0;->j:I */
(( android.widget.TextView ) v4 ).setTypeface ( v3, v5 ); // invoke-virtual {v4, v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
/* .line 78 */
} // :cond_19
v4 = this.a;
(( android.widget.TextView ) v4 ).setTypeface ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
} // :cond_1a
} // :goto_8
if ( v11 != null) { // if-eqz v11, :cond_1b
/* .line 79 */
v3 = this.a;
(( android.widget.TextView ) v3 ).setFontVariationSettings ( v11 ); // invoke-virtual {v3, v11}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z
} // :cond_1b
if ( v8 != null) { // if-eqz v8, :cond_1d
/* .line 80 */
/* const/16 v4, 0x18 */
/* if-lt v3, v4, :cond_1c */
/* .line 81 */
v3 = this.a;
android.os.LocaleList .forLanguageTags ( v8 );
(( android.widget.TextView ) v3 ).setTextLocales ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V
} // :cond_1c
/* const/16 v4, 0x15 */
/* if-lt v3, v4, :cond_1d */
/* const/16 v3, 0x2c */
/* .line 82 */
v3 = (( java.lang.String ) v8 ).indexOf ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->indexOf(I)I
int v4 = 0; // const/4 v4, 0x0
(( java.lang.String ) v8 ).substring ( v4, v3 ); // invoke-virtual {v8, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 83 */
v4 = this.a;
java.util.Locale .forLanguageTag ( v3 );
(( android.widget.TextView ) v4 ).setTextLocale ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V
/* .line 84 */
} // :cond_1d
} // :goto_9
v3 = this.i;
(( c.b.q.w0 ) v3 ).a ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Lc/b/q/w0;->a(Landroid/util/AttributeSet;I)V
/* .line 85 */
/* sget-boolean v1, Lc/h/o/d;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_1f
/* .line 86 */
v1 = this.i;
v1 = (( c.b.q.w0 ) v1 ).g ( ); // invoke-virtual {v1}, Lc/b/q/w0;->g()I
if ( v1 != null) { // if-eqz v1, :cond_1f
/* .line 87 */
v1 = this.i;
/* .line 88 */
(( c.b.q.w0 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/b/q/w0;->f()[I
/* .line 89 */
/* array-length v3, v1 */
/* if-lez v3, :cond_1f */
/* .line 90 */
v3 = this.a;
v3 = (( android.widget.TextView ) v3 ).getAutoSizeStepGranularity ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I
/* int-to-float v3, v3 */
/* const/high16 v4, -0x40800000 # -1.0f */
/* cmpl-float v3, v3, v4 */
if ( v3 != null) { // if-eqz v3, :cond_1e
/* .line 91 */
v1 = this.a;
v3 = this.i;
/* .line 92 */
v3 = (( c.b.q.w0 ) v3 ).d ( ); // invoke-virtual {v3}, Lc/b/q/w0;->d()I
v4 = this.i;
/* .line 93 */
v4 = (( c.b.q.w0 ) v4 ).c ( ); // invoke-virtual {v4}, Lc/b/q/w0;->c()I
v5 = this.i;
/* .line 94 */
v5 = (( c.b.q.w0 ) v5 ).e ( ); // invoke-virtual {v5}, Lc/b/q/w0;->e()I
int v6 = 0; // const/4 v6, 0x0
/* .line 95 */
(( android.widget.TextView ) v1 ).setAutoSizeTextTypeUniformWithConfiguration ( v3, v4, v5, v6 ); // invoke-virtual {v1, v3, v4, v5, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V
} // :cond_1e
int v6 = 0; // const/4 v6, 0x0
/* .line 96 */
v3 = this.a;
(( android.widget.TextView ) v3 ).setAutoSizeTextTypeUniformWithPresetSizes ( v1, v6 ); // invoke-virtual {v3, v1, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V
/* .line 97 */
} // :cond_1f
} // :goto_a
v1 = c.b.j.AppCompatTextView;
c.b.q.k2 .a ( v2,v0,v1 );
/* .line 98 */
int v1 = -1; // const/4 v1, -0x1
v0 = (( c.b.q.k2 ) v8 ).g ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->g(II)I
/* move-object/from16 v3, v16 */
/* if-eq v0, v1, :cond_20 */
/* .line 99 */
(( c.b.q.s ) v3 ).a ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Lc/b/q/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
/* move-object v4, v0 */
} // :cond_20
int v4 = 0; // const/4 v4, 0x0
/* .line 100 */
} // :goto_b
v0 = (( c.b.q.k2 ) v8 ).g ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->g(II)I
/* if-eq v0, v1, :cond_21 */
/* .line 101 */
(( c.b.q.s ) v3 ).a ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Lc/b/q/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
/* move-object v5, v0 */
} // :cond_21
int v5 = 0; // const/4 v5, 0x0
/* .line 102 */
} // :goto_c
v0 = (( c.b.q.k2 ) v8 ).g ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->g(II)I
/* if-eq v0, v1, :cond_22 */
/* .line 103 */
(( c.b.q.s ) v3 ).a ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Lc/b/q/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
/* move-object v6, v0 */
} // :cond_22
int v6 = 0; // const/4 v6, 0x0
/* .line 104 */
} // :goto_d
v0 = (( c.b.q.k2 ) v8 ).g ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->g(II)I
/* if-eq v0, v1, :cond_23 */
/* .line 105 */
(( c.b.q.s ) v3 ).a ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Lc/b/q/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
/* move-object v9, v0 */
} // :cond_23
int v9 = 0; // const/4 v9, 0x0
/* .line 106 */
} // :goto_e
v0 = (( c.b.q.k2 ) v8 ).g ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->g(II)I
/* if-eq v0, v1, :cond_24 */
/* .line 107 */
(( c.b.q.s ) v3 ).a ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Lc/b/q/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
/* move-object v10, v0 */
} // :cond_24
int v10 = 0; // const/4 v10, 0x0
/* .line 108 */
} // :goto_f
v0 = (( c.b.q.k2 ) v8 ).g ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->g(II)I
/* if-eq v0, v1, :cond_25 */
/* .line 109 */
(( c.b.q.s ) v3 ).a ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Lc/b/q/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
/* move-object v11, v0 */
} // :cond_25
int v11 = 0; // const/4 v11, 0x0
} // :goto_10
/* move-object/from16 v0, p0 */
/* move-object v1, v4 */
/* move-object v2, v5 */
/* move-object v3, v6 */
/* move-object v4, v9 */
/* move-object v5, v10 */
/* move-object v6, v11 */
/* .line 110 */
/* invoke-virtual/range {v0 ..v6}, Lc/b/q/u0;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V */
/* .line 111 */
v0 = (( c.b.q.k2 ) v8 ).g ( v0 ); // invoke-virtual {v8, v0}, Lc/b/q/k2;->g(I)Z
if ( v0 != null) { // if-eqz v0, :cond_26
/* .line 112 */
(( c.b.q.k2 ) v8 ).a ( v0 ); // invoke-virtual {v8, v0}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
/* .line 113 */
v1 = this.a;
c.h.o.p .a ( v1,v0 );
/* .line 114 */
} // :cond_26
v0 = (( c.b.q.k2 ) v8 ).g ( v0 ); // invoke-virtual {v8, v0}, Lc/b/q/k2;->g(I)Z
if ( v0 != null) { // if-eqz v0, :cond_27
/* .line 115 */
int v1 = -1; // const/4 v1, -0x1
/* .line 116 */
v0 = (( c.b.q.k2 ) v8 ).d ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->d(II)I
int v2 = 0; // const/4 v2, 0x0
/* .line 117 */
c.b.q.a1 .a ( v0,v2 );
/* .line 118 */
v2 = this.a;
c.h.o.p .a ( v2,v0 );
} // :cond_27
int v1 = -1; // const/4 v1, -0x1
/* .line 119 */
} // :goto_11
v0 = (( c.b.q.k2 ) v8 ).c ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Lc/b/q/k2;->c(II)I
/* .line 120 */
v2 = (( c.b.q.k2 ) v8 ).c ( v2, v1 ); // invoke-virtual {v8, v2, v1}, Lc/b/q/k2;->c(II)I
/* .line 121 */
v3 = (( c.b.q.k2 ) v8 ).c ( v3, v1 ); // invoke-virtual {v8, v3, v1}, Lc/b/q/k2;->c(II)I
/* .line 122 */
(( c.b.q.k2 ) v8 ).a ( ); // invoke-virtual {v8}, Lc/b/q/k2;->a()V
/* if-eq v0, v1, :cond_28 */
/* .line 123 */
v4 = this.a;
c.h.o.p .a ( v4,v0 );
} // :cond_28
/* if-eq v2, v1, :cond_29 */
/* .line 124 */
v0 = this.a;
c.h.o.p .b ( v0,v2 );
} // :cond_29
/* if-eq v3, v1, :cond_2a */
/* .line 125 */
v0 = this.a;
c.h.o.p .c ( v0,v3 );
} // :cond_2a
return;
} // .end method
public void a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .line 129 */
v0 = this.a;
(( android.widget.TextView ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 179 */
v0 = this.a;
(( android.widget.TextView ) v0 ).setAllCaps ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V
return;
} // .end method
public void a ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 196 */
/* sget-boolean p1, Lc/h/o/d;->a:Z */
/* if-nez p1, :cond_0 */
/* .line 197 */
(( c.b.q.u0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/u0;->b()V
} // :cond_0
return;
} // .end method
public void a ( Integer[] p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 203 */
v0 = this.i;
(( c.b.q.w0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/w0;->a([II)V
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( c.b.q.w0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/w0;->a()V
return;
} // .end method
public final void b ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.i;
(( c.b.q.w0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/w0;->a(IF)V
return;
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.b.q.w0 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/w0;->c()I
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.b.q.w0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/w0;->d()I
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.b.q.w0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/q/w0;->e()I
} // .end method
public f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( c.b.q.w0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/q/w0;->f()[I
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.b.q.w0 ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/q/w0;->g()I
} // .end method
public android.content.res.ColorStateList h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.b.q.w0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/q/w0;->h()Z
} // .end method
public void k ( ) {
/* .locals 0 */
/* .line 1 */
(( c.b.q.u0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/u0;->a()V
return;
} // .end method
public final void l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
this.b = v0;
/* .line 2 */
this.c = v0;
/* .line 3 */
this.d = v0;
/* .line 4 */
this.e = v0;
/* .line 5 */
this.f = v0;
/* .line 6 */
this.g = v0;
return;
} // .end method
