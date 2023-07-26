public class c.f.a.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public final c.f.a.b b;
	 public final c.f.a.c c;
	 public Integer d;
	 public c.f.a.k e;
	 public f;
	 public g;
	 public h;
	 public Integer i;
	 public Integer j;
	 public Boolean k;
	 /* # direct methods */
	 public c.f.a.a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lc/f/a/a;->a:I */
		 /* const/16 v1, 0x8 */
		 /* .line 3 */
		 /* iput v1, p0, Lc/f/a/a;->d:I */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 4 */
		 this.e = v2;
		 /* new-array v2, v1, [I */
		 /* .line 5 */
		 this.f = v2;
		 /* new-array v2, v1, [I */
		 /* .line 6 */
		 this.g = v2;
		 /* new-array v1, v1, [F */
		 /* .line 7 */
		 this.h = v1;
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 8 */
		 /* iput v1, p0, Lc/f/a/a;->i:I */
		 /* .line 9 */
		 /* iput v1, p0, Lc/f/a/a;->j:I */
		 /* .line 10 */
		 /* iput-boolean v0, p0, Lc/f/a/a;->k:Z */
		 /* .line 11 */
		 this.b = p1;
		 /* .line 12 */
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Float a ( Object p0, Boolean p1 ) {
		 /* .locals 8 */
		 /* .line 110 */
		 v0 = this.e;
		 /* if-ne v0, p1, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 111 */
		 this.e = v0;
		 /* .line 112 */
	 } // :cond_0
	 /* iget v0, p0, Lc/f/a/a;->i:I */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = -1; // const/4 v2, -0x1
	 /* if-ne v0, v2, :cond_1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
int v4 = -1; // const/4 v4, -0x1
} // :goto_0
/* if-eq v0, v2, :cond_6 */
/* .line 113 */
/* iget v5, p0, Lc/f/a/a;->a:I */
/* if-ge v3, v5, :cond_6 */
/* .line 114 */
v5 = this.f;
/* aget v5, v5, v0 */
/* .line 115 */
/* iget v6, p1, Lc/f/a/k;->b:I */
/* if-ne v5, v6, :cond_5 */
/* .line 116 */
/* iget v1, p0, Lc/f/a/a;->i:I */
/* if-ne v0, v1, :cond_2 */
/* .line 117 */
v1 = this.g;
/* aget v1, v1, v0 */
/* iput v1, p0, Lc/f/a/a;->i:I */
/* .line 118 */
} // :cond_2
v1 = this.g;
/* aget v3, v1, v0 */
/* aput v3, v1, v4 */
} // :goto_1
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 119 */
p2 = this.b;
(( c.f.a.k ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/f/a/k;->b(Lc/f/a/b;)V
/* .line 120 */
} // :cond_3
/* iget p2, p1, Lc/f/a/k;->j:I */
/* add-int/lit8 p2, p2, -0x1 */
/* iput p2, p1, Lc/f/a/k;->j:I */
/* .line 121 */
/* iget p1, p0, Lc/f/a/a;->a:I */
/* add-int/lit8 p1, p1, -0x1 */
/* iput p1, p0, Lc/f/a/a;->a:I */
/* .line 122 */
p1 = this.f;
/* aput v2, p1, v0 */
/* .line 123 */
/* iget-boolean p1, p0, Lc/f/a/a;->k:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 124 */
/* iput v0, p0, Lc/f/a/a;->j:I */
/* .line 125 */
} // :cond_4
p1 = this.h;
/* aget p1, p1, v0 */
/* .line 126 */
} // :cond_5
v4 = this.g;
/* aget v4, v4, v0 */
/* add-int/lit8 v3, v3, 0x1 */
/* move v7, v4 */
/* move v4, v0 */
/* move v0, v7 */
} // :cond_6
} // .end method
public final c.f.a.k a ( Integer p0 ) {
/* .locals 3 */
/* .line 204 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_1 */
/* .line 205 */
/* iget v2, p0, Lc/f/a/a;->a:I */
/* if-ge v1, v2, :cond_1 */
/* if-ne v1, p1, :cond_0 */
/* .line 206 */
p1 = this.c;
p1 = this.c;
v1 = this.f;
/* aget v0, v1, v0 */
/* aget-object p1, p1, v0 */
/* .line 207 */
} // :cond_0
v2 = this.g;
/* aget v0, v2, v0 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public c.f.a.k a ( Object p0 ) {
/* .locals 14 */
/* .line 145 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move-object v2, v1 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
} // :goto_0
int v9 = -1; // const/4 v9, -0x1
/* if-eq v0, v9, :cond_8 */
/* .line 146 */
/* iget v9, p0, Lc/f/a/a;->a:I */
/* if-ge v4, v9, :cond_8 */
/* .line 147 */
v9 = this.h;
/* aget v10, v9, v0 */
/* const v11, 0x3a83126f # 0.001f */
/* .line 148 */
v12 = this.c;
v12 = this.c;
v13 = this.f;
/* aget v13, v13, v0 */
/* aget-object v12, v12, v13 */
/* cmpg-float v13, v10, v3 */
/* if-gez v13, :cond_0 */
/* const v11, -0x457ced91 # -0.001f */
/* cmpl-float v11, v10, v11 */
/* if-lez v11, :cond_1 */
/* .line 149 */
/* aput v3, v9, v0 */
/* .line 150 */
v9 = this.b;
(( c.f.a.k ) v12 ).b ( v9 ); // invoke-virtual {v12, v9}, Lc/f/a/k;->b(Lc/f/a/b;)V
} // :cond_0
/* cmpg-float v11, v10, v11 */
/* if-gez v11, :cond_1 */
/* .line 151 */
/* aput v3, v9, v0 */
/* .line 152 */
v9 = this.b;
(( c.f.a.k ) v12 ).b ( v9 ); // invoke-virtual {v12, v9}, Lc/f/a/k;->b(Lc/f/a/b;)V
} // :goto_1
int v10 = 0; // const/4 v10, 0x0
} // :cond_1
int v9 = 1; // const/4 v9, 0x1
/* cmpl-float v11, v10, v3 */
if ( v11 != null) { // if-eqz v11, :cond_7
/* .line 153 */
v11 = this.g;
v13 = c.f.a.j.b;
/* if-ne v11, v13, :cond_4 */
/* if-nez v2, :cond_2 */
/* .line 154 */
v2 = (( c.f.a.a ) p0 ).a ( v12, p1 ); // invoke-virtual {p0, v12, p1}, Lc/f/a/a;->a(Lc/f/a/k;Lc/f/a/f;)Z
} // :goto_2
/* move v5, v2 */
/* move v7, v10 */
/* move-object v2, v12 */
} // :cond_2
/* cmpl-float v11, v7, v10 */
/* if-lez v11, :cond_3 */
/* .line 155 */
v2 = (( c.f.a.a ) p0 ).a ( v12, p1 ); // invoke-virtual {p0, v12, p1}, Lc/f/a/a;->a(Lc/f/a/k;Lc/f/a/f;)Z
} // :cond_3
/* if-nez v5, :cond_7 */
/* .line 156 */
v11 = (( c.f.a.a ) p0 ).a ( v12, p1 ); // invoke-virtual {p0, v12, p1}, Lc/f/a/a;->a(Lc/f/a/k;Lc/f/a/f;)Z
if ( v11 != null) { // if-eqz v11, :cond_7
/* move v7, v10 */
/* move-object v2, v12 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_4
/* if-nez v2, :cond_7 */
/* cmpg-float v11, v10, v3 */
/* if-gez v11, :cond_7 */
/* if-nez v1, :cond_5 */
/* .line 157 */
v1 = (( c.f.a.a ) p0 ).a ( v12, p1 ); // invoke-virtual {p0, v12, p1}, Lc/f/a/a;->a(Lc/f/a/k;Lc/f/a/f;)Z
} // :goto_3
/* move v6, v1 */
/* move v8, v10 */
/* move-object v1, v12 */
} // :cond_5
/* cmpl-float v11, v8, v10 */
/* if-lez v11, :cond_6 */
/* .line 158 */
v1 = (( c.f.a.a ) p0 ).a ( v12, p1 ); // invoke-virtual {p0, v12, p1}, Lc/f/a/a;->a(Lc/f/a/k;Lc/f/a/f;)Z
} // :cond_6
/* if-nez v6, :cond_7 */
/* .line 159 */
v11 = (( c.f.a.a ) p0 ).a ( v12, p1 ); // invoke-virtual {p0, v12, p1}, Lc/f/a/a;->a(Lc/f/a/k;Lc/f/a/f;)Z
if ( v11 != null) { // if-eqz v11, :cond_7
/* move v8, v10 */
/* move-object v1, v12 */
int v6 = 1; // const/4 v6, 0x1
/* .line 160 */
} // :cond_7
} // :goto_4
v9 = this.g;
/* aget v0, v9, v0 */
/* add-int/lit8 v4, v4, 0x1 */
/* goto/16 :goto_0 */
} // :cond_8
if ( v2 != null) { // if-eqz v2, :cond_9
} // :cond_9
} // .end method
public c.f.a.k a ( Boolean[] p0, Object p1 ) {
/* .locals 8 */
/* .line 196 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
int v5 = -1; // const/4 v5, -0x1
/* if-eq v0, v5, :cond_3 */
/* .line 197 */
/* iget v5, p0, Lc/f/a/a;->a:I */
/* if-ge v2, v5, :cond_3 */
/* .line 198 */
v5 = this.h;
/* aget v5, v5, v0 */
/* cmpg-float v5, v5, v1 */
/* if-gez v5, :cond_2 */
/* .line 199 */
v5 = this.c;
v5 = this.c;
v6 = this.f;
/* aget v6, v6, v0 */
/* aget-object v5, v5, v6 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 200 */
/* iget v6, v5, Lc/f/a/k;->b:I */
/* aget-boolean v6, p1, v6 */
/* if-nez v6, :cond_2 */
} // :cond_0
/* if-eq v5, p2, :cond_2 */
/* .line 201 */
v6 = this.g;
v7 = c.f.a.j.d;
/* if-eq v6, v7, :cond_1 */
v7 = c.f.a.j.e;
/* if-ne v6, v7, :cond_2 */
/* .line 202 */
} // :cond_1
v6 = this.h;
/* aget v6, v6, v0 */
/* cmpg-float v7, v6, v4 */
/* if-gez v7, :cond_2 */
/* move-object v3, v5 */
/* move v4, v6 */
/* .line 203 */
} // :cond_2
v5 = this.g;
/* aget v0, v5, v0 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public final void a ( ) {
/* .locals 5 */
/* .line 127 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v3, :cond_1 */
/* .line 128 */
/* iget v4, p0, Lc/f/a/a;->a:I */
/* if-ge v2, v4, :cond_1 */
/* .line 129 */
v3 = this.c;
v3 = this.c;
v4 = this.f;
/* aget v4, v4, v0 */
/* aget-object v3, v3, v4 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 130 */
v4 = this.b;
(( c.f.a.k ) v3 ).b ( v4 ); // invoke-virtual {v3, v4}, Lc/f/a/k;->b(Lc/f/a/b;)V
/* .line 131 */
} // :cond_0
v3 = this.g;
/* aget v0, v3, v0 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 132 */
} // :cond_1
/* iput v3, p0, Lc/f/a/a;->i:I */
/* .line 133 */
/* iput v3, p0, Lc/f/a/a;->j:I */
/* .line 134 */
/* iput-boolean v1, p0, Lc/f/a/a;->k:Z */
/* .line 135 */
/* iput v1, p0, Lc/f/a/a;->a:I */
return;
} // .end method
public void a ( Float p0 ) {
/* .locals 4 */
/* .line 140 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_0 */
/* .line 141 */
/* iget v2, p0, Lc/f/a/a;->a:I */
/* if-ge v1, v2, :cond_0 */
/* .line 142 */
v2 = this.h;
/* aget v3, v2, v0 */
/* div-float/2addr v3, p1 */
/* aput v3, v2, v0 */
/* .line 143 */
v2 = this.g;
/* aget v0, v2, v0 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( Object p0, Object p1, Boolean p2 ) {
/* .locals 8 */
/* .line 161 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v3, :cond_3 */
/* .line 162 */
/* iget v4, p0, Lc/f/a/a;->a:I */
/* if-ge v2, v4, :cond_3 */
/* .line 163 */
v4 = this.f;
/* aget v4, v4, v0 */
v5 = this.a;
/* iget v6, v5, Lc/f/a/k;->b:I */
/* if-ne v4, v6, :cond_2 */
/* .line 164 */
v2 = this.h;
/* aget v0, v2, v0 */
/* .line 165 */
(( c.f.a.a ) p0 ).a ( v5, p3 ); // invoke-virtual {p0, v5, p3}, Lc/f/a/a;->a(Lc/f/a/k;Z)F
/* .line 166 */
v2 = this.d;
/* .line 167 */
/* iget v4, v2, Lc/f/a/a;->i:I */
int v5 = 0; // const/4 v5, 0x0
} // :goto_2
/* if-eq v4, v3, :cond_0 */
/* .line 168 */
/* iget v6, v2, Lc/f/a/a;->a:I */
/* if-ge v5, v6, :cond_0 */
/* .line 169 */
v6 = this.c;
v6 = this.c;
v7 = this.f;
/* aget v7, v7, v4 */
/* aget-object v6, v6, v7 */
/* .line 170 */
v7 = this.h;
/* aget v7, v7, v4 */
/* mul-float v7, v7, v0 */
/* .line 171 */
(( c.f.a.a ) p0 ).a ( v6, v7, p3 ); // invoke-virtual {p0, v6, v7, p3}, Lc/f/a/a;->a(Lc/f/a/k;FZ)V
/* .line 172 */
v6 = this.g;
/* aget v4, v6, v4 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 173 */
} // :cond_0
/* iget v2, p1, Lc/f/a/b;->b:F */
/* iget v3, p2, Lc/f/a/b;->b:F */
/* mul-float v3, v3, v0 */
/* add-float/2addr v2, v3 */
/* iput v2, p1, Lc/f/a/b;->b:F */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 174 */
v0 = this.a;
(( c.f.a.k ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/k;->b(Lc/f/a/b;)V
/* .line 175 */
} // :cond_1
/* iget v0, p0, Lc/f/a/a;->i:I */
/* .line 176 */
} // :cond_2
v3 = this.g;
/* aget v0, v3, v0 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
return;
} // .end method
public void a ( Object p0, Object[] p1 ) {
/* .locals 10 */
/* .line 177 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v3, :cond_2 */
/* .line 178 */
/* iget v4, p0, Lc/f/a/a;->a:I */
/* if-ge v2, v4, :cond_2 */
/* .line 179 */
v4 = this.c;
v4 = this.c;
v5 = this.f;
/* aget v5, v5, v0 */
/* aget-object v4, v4, v5 */
/* .line 180 */
/* iget v5, v4, Lc/f/a/k;->c:I */
/* if-eq v5, v3, :cond_1 */
/* .line 181 */
v2 = this.h;
/* aget v0, v2, v0 */
int v2 = 1; // const/4 v2, 0x1
/* .line 182 */
(( c.f.a.a ) p0 ).a ( v4, v2 ); // invoke-virtual {p0, v4, v2}, Lc/f/a/a;->a(Lc/f/a/k;Z)F
/* .line 183 */
/* iget v4, v4, Lc/f/a/k;->c:I */
/* aget-object v4, p2, v4 */
/* .line 184 */
/* iget-boolean v5, v4, Lc/f/a/b;->e:Z */
/* if-nez v5, :cond_0 */
/* .line 185 */
v5 = this.d;
/* .line 186 */
/* iget v6, v5, Lc/f/a/a;->i:I */
int v7 = 0; // const/4 v7, 0x0
} // :goto_2
/* if-eq v6, v3, :cond_0 */
/* .line 187 */
/* iget v8, v5, Lc/f/a/a;->a:I */
/* if-ge v7, v8, :cond_0 */
/* .line 188 */
v8 = this.c;
v8 = this.c;
v9 = this.f;
/* aget v9, v9, v6 */
/* aget-object v8, v8, v9 */
/* .line 189 */
v9 = this.h;
/* aget v9, v9, v6 */
/* mul-float v9, v9, v0 */
/* .line 190 */
(( c.f.a.a ) p0 ).a ( v8, v9, v2 ); // invoke-virtual {p0, v8, v9, v2}, Lc/f/a/a;->a(Lc/f/a/k;FZ)V
/* .line 191 */
v8 = this.g;
/* aget v6, v8, v6 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 192 */
} // :cond_0
/* iget v2, p1, Lc/f/a/b;->b:F */
/* iget v3, v4, Lc/f/a/b;->b:F */
/* mul-float v3, v3, v0 */
/* add-float/2addr v2, v3 */
/* iput v2, p1, Lc/f/a/b;->b:F */
/* .line 193 */
v0 = this.a;
(( c.f.a.k ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/k;->b(Lc/f/a/b;)V
/* .line 194 */
/* iget v0, p0, Lc/f/a/a;->i:I */
/* .line 195 */
} // :cond_1
v3 = this.g;
/* aget v0, v3, v0 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
return;
} // .end method
public final void a ( Object p0, Float p1 ) {
/* .locals 9 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, p2, v1 */
/* if-nez v1, :cond_0 */
/* .line 1 */
(( c.f.a.a ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/f/a/a;->a(Lc/f/a/k;Z)F
return;
/* .line 2 */
} // :cond_0
/* iget v1, p0, Lc/f/a/a;->i:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = -1; // const/4 v3, -0x1
/* if-ne v1, v3, :cond_2 */
/* .line 3 */
/* iput v2, p0, Lc/f/a/a;->i:I */
/* .line 4 */
v1 = this.h;
/* aput p2, v1, v2 */
/* .line 5 */
p2 = this.f;
/* iget v1, p1, Lc/f/a/k;->b:I */
/* aput v1, p2, v2 */
/* .line 6 */
p2 = this.g;
/* aput v3, p2, v2 */
/* .line 7 */
/* iget p2, p1, Lc/f/a/k;->j:I */
/* add-int/2addr p2, v0 */
/* iput p2, p1, Lc/f/a/k;->j:I */
/* .line 8 */
p2 = this.b;
(( c.f.a.k ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/f/a/k;->a(Lc/f/a/b;)V
/* .line 9 */
/* iget p1, p0, Lc/f/a/a;->a:I */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/a;->a:I */
/* .line 10 */
/* iget-boolean p1, p0, Lc/f/a/a;->k:Z */
/* if-nez p1, :cond_1 */
/* .line 11 */
/* iget p1, p0, Lc/f/a/a;->j:I */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/a;->j:I */
/* .line 12 */
p2 = this.f;
/* array-length v1, p2 */
/* if-lt p1, v1, :cond_1 */
/* .line 13 */
/* iput-boolean v0, p0, Lc/f/a/a;->k:Z */
/* .line 14 */
/* array-length p1, p2 */
/* sub-int/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/a;->j:I */
} // :cond_1
return;
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
} // :goto_0
/* if-eq v1, v3, :cond_5 */
/* .line 15 */
/* iget v6, p0, Lc/f/a/a;->a:I */
/* if-ge v4, v6, :cond_5 */
/* .line 16 */
v6 = this.f;
/* aget v7, v6, v1 */
/* iget v8, p1, Lc/f/a/k;->b:I */
/* if-ne v7, v8, :cond_3 */
/* .line 17 */
p1 = this.h;
/* aput p2, p1, v1 */
return;
/* .line 18 */
} // :cond_3
/* aget v6, v6, v1 */
/* if-ge v6, v8, :cond_4 */
/* move v5, v1 */
/* .line 19 */
} // :cond_4
v6 = this.g;
/* aget v1, v6, v1 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 20 */
} // :cond_5
/* iget v1, p0, Lc/f/a/a;->j:I */
/* add-int/lit8 v4, v1, 0x1 */
/* .line 21 */
/* iget-boolean v6, p0, Lc/f/a/a;->k:Z */
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 22 */
v4 = this.f;
/* aget v6, v4, v1 */
/* if-ne v6, v3, :cond_6 */
/* .line 23 */
} // :cond_6
/* array-length v1, v4 */
} // :cond_7
/* move v1, v4 */
/* .line 24 */
} // :goto_1
v4 = this.f;
/* array-length v6, v4 */
/* if-lt v1, v6, :cond_9 */
/* .line 25 */
/* iget v6, p0, Lc/f/a/a;->a:I */
/* array-length v4, v4 */
/* if-ge v6, v4, :cond_9 */
int v4 = 0; // const/4 v4, 0x0
/* .line 26 */
} // :goto_2
v6 = this.f;
/* array-length v7, v6 */
/* if-ge v4, v7, :cond_9 */
/* .line 27 */
/* aget v6, v6, v4 */
/* if-ne v6, v3, :cond_8 */
/* move v1, v4 */
} // :cond_8
/* add-int/lit8 v4, v4, 0x1 */
/* .line 28 */
} // :cond_9
} // :goto_3
v4 = this.f;
/* array-length v6, v4 */
/* if-lt v1, v6, :cond_a */
/* .line 29 */
/* array-length v1, v4 */
/* .line 30 */
/* iget v4, p0, Lc/f/a/a;->d:I */
/* mul-int/lit8 v4, v4, 0x2 */
/* iput v4, p0, Lc/f/a/a;->d:I */
/* .line 31 */
/* iput-boolean v2, p0, Lc/f/a/a;->k:Z */
/* add-int/lit8 v2, v1, -0x1 */
/* .line 32 */
/* iput v2, p0, Lc/f/a/a;->j:I */
/* .line 33 */
v2 = this.h;
java.util.Arrays .copyOf ( v2,v4 );
this.h = v2;
/* .line 34 */
v2 = this.f;
/* iget v4, p0, Lc/f/a/a;->d:I */
java.util.Arrays .copyOf ( v2,v4 );
this.f = v2;
/* .line 35 */
v2 = this.g;
/* iget v4, p0, Lc/f/a/a;->d:I */
java.util.Arrays .copyOf ( v2,v4 );
this.g = v2;
/* .line 36 */
} // :cond_a
v2 = this.f;
/* iget v4, p1, Lc/f/a/k;->b:I */
/* aput v4, v2, v1 */
/* .line 37 */
v2 = this.h;
/* aput p2, v2, v1 */
/* if-eq v5, v3, :cond_b */
/* .line 38 */
p2 = this.g;
/* aget v2, p2, v5 */
/* aput v2, p2, v1 */
/* .line 39 */
/* aput v1, p2, v5 */
/* .line 40 */
} // :cond_b
p2 = this.g;
/* iget v2, p0, Lc/f/a/a;->i:I */
/* aput v2, p2, v1 */
/* .line 41 */
/* iput v1, p0, Lc/f/a/a;->i:I */
/* .line 42 */
} // :goto_4
/* iget p2, p1, Lc/f/a/k;->j:I */
/* add-int/2addr p2, v0 */
/* iput p2, p1, Lc/f/a/k;->j:I */
/* .line 43 */
p2 = this.b;
(( c.f.a.k ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/f/a/k;->a(Lc/f/a/b;)V
/* .line 44 */
/* iget p1, p0, Lc/f/a/a;->a:I */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/a;->a:I */
/* .line 45 */
/* iget-boolean p1, p0, Lc/f/a/a;->k:Z */
/* if-nez p1, :cond_c */
/* .line 46 */
/* iget p1, p0, Lc/f/a/a;->j:I */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/a;->j:I */
/* .line 47 */
} // :cond_c
/* iget p1, p0, Lc/f/a/a;->a:I */
p2 = this.f;
/* array-length p2, p2 */
/* if-lt p1, p2, :cond_d */
/* .line 48 */
/* iput-boolean v0, p0, Lc/f/a/a;->k:Z */
/* .line 49 */
} // :cond_d
/* iget p1, p0, Lc/f/a/a;->j:I */
p2 = this.f;
/* array-length v1, p2 */
/* if-lt p1, v1, :cond_e */
/* .line 50 */
/* iput-boolean v0, p0, Lc/f/a/a;->k:Z */
/* .line 51 */
/* array-length p1, p2 */
/* sub-int/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/a;->j:I */
} // :cond_e
return;
} // .end method
public final void a ( Object p0, Float p1, Boolean p2 ) {
/* .locals 10 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v1, p2, v0 */
/* if-nez v1, :cond_0 */
return;
/* .line 52 */
} // :cond_0
/* iget v1, p0, Lc/f/a/a;->i:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = -1; // const/4 v3, -0x1
int v4 = 1; // const/4 v4, 0x1
/* if-ne v1, v3, :cond_2 */
/* .line 53 */
/* iput v2, p0, Lc/f/a/a;->i:I */
/* .line 54 */
p3 = this.h;
/* aput p2, p3, v2 */
/* .line 55 */
p2 = this.f;
/* iget p3, p1, Lc/f/a/k;->b:I */
/* aput p3, p2, v2 */
/* .line 56 */
p2 = this.g;
/* aput v3, p2, v2 */
/* .line 57 */
/* iget p2, p1, Lc/f/a/k;->j:I */
/* add-int/2addr p2, v4 */
/* iput p2, p1, Lc/f/a/k;->j:I */
/* .line 58 */
p2 = this.b;
(( c.f.a.k ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/f/a/k;->a(Lc/f/a/b;)V
/* .line 59 */
/* iget p1, p0, Lc/f/a/a;->a:I */
/* add-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->a:I */
/* .line 60 */
/* iget-boolean p1, p0, Lc/f/a/a;->k:Z */
/* if-nez p1, :cond_1 */
/* .line 61 */
/* iget p1, p0, Lc/f/a/a;->j:I */
/* add-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->j:I */
/* .line 62 */
p2 = this.f;
/* array-length p3, p2 */
/* if-lt p1, p3, :cond_1 */
/* .line 63 */
/* iput-boolean v4, p0, Lc/f/a/a;->k:Z */
/* .line 64 */
/* array-length p1, p2 */
/* sub-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->j:I */
} // :cond_1
return;
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
int v6 = -1; // const/4 v6, -0x1
} // :goto_0
/* if-eq v1, v3, :cond_9 */
/* .line 65 */
/* iget v7, p0, Lc/f/a/a;->a:I */
/* if-ge v5, v7, :cond_9 */
/* .line 66 */
v7 = this.f;
/* aget v8, v7, v1 */
/* .line 67 */
/* iget v9, p1, Lc/f/a/k;->b:I */
/* if-ne v8, v9, :cond_7 */
/* .line 68 */
v2 = this.h;
/* aget v3, v2, v1 */
/* add-float/2addr v3, p2 */
/* aput v3, v2, v1 */
/* .line 69 */
/* aget p2, v2, v1 */
/* cmpl-float p2, p2, v0 */
/* if-nez p2, :cond_6 */
/* .line 70 */
/* iget p2, p0, Lc/f/a/a;->i:I */
/* if-ne v1, p2, :cond_3 */
/* .line 71 */
p2 = this.g;
/* aget p2, p2, v1 */
/* iput p2, p0, Lc/f/a/a;->i:I */
/* .line 72 */
} // :cond_3
p2 = this.g;
/* aget v0, p2, v1 */
/* aput v0, p2, v6 */
} // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_4
/* .line 73 */
p2 = this.b;
(( c.f.a.k ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/f/a/k;->b(Lc/f/a/b;)V
/* .line 74 */
} // :cond_4
/* iget-boolean p2, p0, Lc/f/a/a;->k:Z */
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 75 */
/* iput v1, p0, Lc/f/a/a;->j:I */
/* .line 76 */
} // :cond_5
/* iget p2, p1, Lc/f/a/k;->j:I */
/* sub-int/2addr p2, v4 */
/* iput p2, p1, Lc/f/a/k;->j:I */
/* .line 77 */
/* iget p1, p0, Lc/f/a/a;->a:I */
/* sub-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->a:I */
} // :cond_6
return;
/* .line 78 */
} // :cond_7
/* aget v7, v7, v1 */
/* if-ge v7, v9, :cond_8 */
/* move v6, v1 */
/* .line 79 */
} // :cond_8
v7 = this.g;
/* aget v1, v7, v1 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 80 */
} // :cond_9
/* iget p3, p0, Lc/f/a/a;->j:I */
/* add-int/lit8 v0, p3, 0x1 */
/* .line 81 */
/* iget-boolean v1, p0, Lc/f/a/a;->k:Z */
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 82 */
v0 = this.f;
/* aget v1, v0, p3 */
/* if-ne v1, v3, :cond_a */
/* .line 83 */
} // :cond_a
/* array-length p3, v0 */
} // :cond_b
/* move p3, v0 */
/* .line 84 */
} // :goto_2
v0 = this.f;
/* array-length v1, v0 */
/* if-lt p3, v1, :cond_d */
/* .line 85 */
/* iget v1, p0, Lc/f/a/a;->a:I */
/* array-length v0, v0 */
/* if-ge v1, v0, :cond_d */
int v0 = 0; // const/4 v0, 0x0
/* .line 86 */
} // :goto_3
v1 = this.f;
/* array-length v5, v1 */
/* if-ge v0, v5, :cond_d */
/* .line 87 */
/* aget v1, v1, v0 */
/* if-ne v1, v3, :cond_c */
/* move p3, v0 */
} // :cond_c
/* add-int/lit8 v0, v0, 0x1 */
/* .line 88 */
} // :cond_d
} // :goto_4
v0 = this.f;
/* array-length v1, v0 */
/* if-lt p3, v1, :cond_e */
/* .line 89 */
/* array-length p3, v0 */
/* .line 90 */
/* iget v0, p0, Lc/f/a/a;->d:I */
/* mul-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/f/a/a;->d:I */
/* .line 91 */
/* iput-boolean v2, p0, Lc/f/a/a;->k:Z */
/* add-int/lit8 v1, p3, -0x1 */
/* .line 92 */
/* iput v1, p0, Lc/f/a/a;->j:I */
/* .line 93 */
v1 = this.h;
java.util.Arrays .copyOf ( v1,v0 );
this.h = v0;
/* .line 94 */
v0 = this.f;
/* iget v1, p0, Lc/f/a/a;->d:I */
java.util.Arrays .copyOf ( v0,v1 );
this.f = v0;
/* .line 95 */
v0 = this.g;
/* iget v1, p0, Lc/f/a/a;->d:I */
java.util.Arrays .copyOf ( v0,v1 );
this.g = v0;
/* .line 96 */
} // :cond_e
v0 = this.f;
/* iget v1, p1, Lc/f/a/k;->b:I */
/* aput v1, v0, p3 */
/* .line 97 */
v0 = this.h;
/* aput p2, v0, p3 */
/* if-eq v6, v3, :cond_f */
/* .line 98 */
p2 = this.g;
/* aget v0, p2, v6 */
/* aput v0, p2, p3 */
/* .line 99 */
/* aput p3, p2, v6 */
/* .line 100 */
} // :cond_f
p2 = this.g;
/* iget v0, p0, Lc/f/a/a;->i:I */
/* aput v0, p2, p3 */
/* .line 101 */
/* iput p3, p0, Lc/f/a/a;->i:I */
/* .line 102 */
} // :goto_5
/* iget p2, p1, Lc/f/a/k;->j:I */
/* add-int/2addr p2, v4 */
/* iput p2, p1, Lc/f/a/k;->j:I */
/* .line 103 */
p2 = this.b;
(( c.f.a.k ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/f/a/k;->a(Lc/f/a/b;)V
/* .line 104 */
/* iget p1, p0, Lc/f/a/a;->a:I */
/* add-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->a:I */
/* .line 105 */
/* iget-boolean p1, p0, Lc/f/a/a;->k:Z */
/* if-nez p1, :cond_10 */
/* .line 106 */
/* iget p1, p0, Lc/f/a/a;->j:I */
/* add-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->j:I */
/* .line 107 */
} // :cond_10
/* iget p1, p0, Lc/f/a/a;->j:I */
p2 = this.f;
/* array-length p3, p2 */
/* if-lt p1, p3, :cond_11 */
/* .line 108 */
/* iput-boolean v4, p0, Lc/f/a/a;->k:Z */
/* .line 109 */
/* array-length p1, p2 */
/* sub-int/2addr p1, v4 */
/* iput p1, p0, Lc/f/a/a;->j:I */
} // :cond_11
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 6 */
/* .line 136 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = -1; // const/4 v1, -0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-eq v0, v1, :cond_2 */
/* .line 137 */
/* iget v4, p0, Lc/f/a/a;->a:I */
/* if-ge v3, v4, :cond_2 */
/* .line 138 */
v4 = this.f;
/* aget v4, v4, v0 */
/* iget v5, p1, Lc/f/a/k;->b:I */
/* if-ne v4, v5, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 139 */
} // :cond_1
v4 = this.g;
/* aget v0, v4, v0 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
} // .end method
public final Boolean a ( Object p0, Object p1 ) {
/* .locals 0 */
/* .line 144 */
/* iget p1, p1, Lc/f/a/k;->j:I */
int p2 = 1; // const/4 p2, 0x1
/* if-gt p1, p2, :cond_0 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
} // .end method
public final Float b ( Integer p0 ) {
/* .locals 3 */
/* .line 5 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_1 */
/* .line 6 */
/* iget v2, p0, Lc/f/a/a;->a:I */
/* if-ge v1, v2, :cond_1 */
/* if-ne v1, p1, :cond_0 */
/* .line 7 */
p1 = this.h;
/* aget p1, p1, v0 */
/* .line 8 */
} // :cond_0
v2 = this.g;
/* aget v0, v2, v0 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Float b ( Object p0 ) {
/* .locals 4 */
/* .line 9 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_1 */
/* .line 10 */
/* iget v2, p0, Lc/f/a/a;->a:I */
/* if-ge v1, v2, :cond_1 */
/* .line 11 */
v2 = this.f;
/* aget v2, v2, v0 */
/* iget v3, p1, Lc/f/a/k;->b:I */
/* if-ne v2, v3, :cond_0 */
/* .line 12 */
p1 = this.h;
/* aget p1, p1, v0 */
/* .line 13 */
} // :cond_0
v2 = this.g;
/* aget v0, v2, v0 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/a;->i:I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_0 */
/* .line 2 */
/* iget v2, p0, Lc/f/a/a;->a:I */
/* if-ge v1, v2, :cond_0 */
/* .line 3 */
v2 = this.h;
/* aget v3, v2, v0 */
/* const/high16 v4, -0x40800000 # -1.0f */
/* mul-float v3, v3, v4 */
/* aput v3, v2, v0 */
/* .line 4 */
v2 = this.g;
/* aget v0, v2, v0 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/a;->i:I */
final String v1 = ""; // const-string v1, ""
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v3, :cond_0 */
/* .line 2 */
/* iget v3, p0, Lc/f/a/a;->a:I */
/* if-ge v2, v3, :cond_0 */
/* .line 3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " -> "; // const-string v1, " -> "
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 4 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.h;
/* aget v1, v1, v0 */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = " : "; // const-string v1, " : "
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 5 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
v1 = this.c;
v4 = this.f;
/* aget v4, v4, v0 */
/* aget-object v1, v1, v4 */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 6 */
v3 = this.g;
/* aget v0, v3, v0 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
} // .end method
