public class e.h.b.a.p.f implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Comparator<", */
	 /* "Le/h/b/a/m/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public android.content.Context b;
/* # direct methods */
public e.h.b.a.p.f ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.b = p1;
	 return;
} // .end method
/* # virtual methods */
public final Integer a ( android.content.SharedPreferences p0 ) {
	 /* .locals 2 */
	 int v0 = 0; // const/4 v0, 0x0
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 final String v1 = "isFavorite"; // const-string v1, "isFavorite"
		 p1 = 		 /* .line 8 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
	 } // .end method
	 public Integer a ( Object p0, Object p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( e.h.b.a.p.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/p/f;->a(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
		 /* .line 2 */
		 (( e.h.b.a.p.f ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/p/f;->a(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
		 int v2 = 0; // const/4 v2, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 v0 = 			 (( e.h.b.a.p.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/p/f;->a(Landroid/content/SharedPreferences;)I
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 4 */
		 v2 = 		 (( e.h.b.a.p.f ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/b/a/p/f;->a(Landroid/content/SharedPreferences;)I
		 /* .line 5 */
	 } // :cond_1
	 (( e.h.b.a.m.d ) p1 ).q ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;
	 v3 = e.h.b.a.m.a.c;
	 /* if-ne v1, v3, :cond_2 */
	 int p1 = -1; // const/4 p1, -0x1
	 /* .line 6 */
} // :cond_2
(( e.h.b.a.m.d ) p2 ).q ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;
v3 = e.h.b.a.m.a.c;
/* if-ne v1, v3, :cond_3 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_3
/* if-eq v0, v2, :cond_4 */
/* sub-int/2addr v2, v0 */
/* .line 7 */
} // :cond_4
v0 = java.lang.String.CASE_INSENSITIVE_ORDER;
(( e.h.b.a.m.d ) p1 ).f ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->f()Ljava/lang/String;
p1 = (( e.h.b.a.m.d ) p2 ).f ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->f()Ljava/lang/String;
} // .end method
public final android.content.SharedPreferences a ( Object p0 ) {
/* .locals 3 */
/* .line 9 */
(( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.h.b.a.m.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 10 */
v0 = this.b;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.b.a.m.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) v0 ).getSharedPreferences ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Le/h/b/a/m/d; */
/* check-cast p2, Le/h/b/a/m/d; */
p1 = (( e.h.b.a.p.f ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/p/f;->a(Le/h/b/a/m/d;Le/h/b/a/m/d;)I
} // .end method
