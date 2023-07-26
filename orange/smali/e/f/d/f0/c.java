public class e.f.d.f0.c implements java.io.Closeable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final r;
	 /* # instance fields */
	 public final e.f.d.f0.h b;
	 public final java.io.Reader c;
	 public Boolean d;
	 public final e;
	 public Integer f;
	 public Integer g;
	 public Integer h;
	 public Integer i;
	 public e.f.d.f0.d j;
	 public Integer k;
	 public e.f.d.f0.e l;
	 public java.lang.String m;
	 public java.lang.String n;
	 public Integer o;
	 public Integer p;
	 public Boolean q;
	 /* # direct methods */
	 public static e.f.d.f0.c ( ) {
		 /* .locals 1 */
		 final String v0 = ")]}\'\n"; // const-string v0, ")]}\'\n"
		 /* .line 1 */
		 (( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
		 /* .line 2 */
		 /* new-instance v0, Le/f/d/f0/a; */
		 /* invoke-direct {v0}, Le/f/d/f0/a;-><init>()V */
		 return;
	 } // .end method
	 public e.f.d.f0.c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/f/d/f0/h; */
		 /* invoke-direct {v0}, Le/f/d/f0/h;-><init>()V */
		 this.b = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Le/f/d/f0/c;->d:Z */
		 /* const/16 v1, 0x400 */
		 /* new-array v1, v1, [C */
		 /* .line 4 */
		 this.e = v1;
		 /* .line 5 */
		 /* iput v0, p0, Le/f/d/f0/c;->f:I */
		 /* .line 6 */
		 /* iput v0, p0, Le/f/d/f0/c;->g:I */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 7 */
		 /* iput v1, p0, Le/f/d/f0/c;->h:I */
		 /* .line 8 */
		 /* iput v1, p0, Le/f/d/f0/c;->i:I */
		 /* const/16 v1, 0x20 */
		 /* new-array v1, v1, [Le/f/d/f0/d; */
		 /* .line 9 */
		 this.j = v1;
		 /* .line 10 */
		 /* iput v0, p0, Le/f/d/f0/c;->k:I */
		 /* .line 11 */
		 v1 = e.f.d.f0.d.g;
		 (( e.f.d.f0.c ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/d/f0/c;->a(Le/f/d/f0/d;)V
		 /* .line 12 */
		 /* iput-boolean v0, p0, Le/f/d/f0/c;->q:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 13 */
			 this.c = p1;
			 return;
			 /* .line 14 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/NullPointerException; */
		 final String v0 = "in == null"; // const-string v0, "in == null"
		 /* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public static e.f.d.f0.e a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.l;
	 } // .end method
	 public static e.f.d.f0.e a ( Object p0, Object p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 this.l = p1;
	 } // .end method
	 public static java.lang.String a ( Object p0, java.lang.String p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 3 */
		 this.n = p1;
	 } // .end method
	 public static Integer b ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
	 } // .end method
	 public static java.lang.String b ( Object p0, java.lang.String p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 this.m = p1;
	 } // .end method
	 public static Integer c ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
	 } // .end method
	 public static java.lang.String d ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.m;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String A ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
	 /* .line 2 */
	 v0 = this.l;
	 v1 = e.f.d.f0.e.f;
	 /* if-ne v0, v1, :cond_0 */
	 /* .line 3 */
	 v0 = this.m;
	 /* .line 4 */
	 (( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
	 /* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected a name but was "; // const-string v2, "Expected a name but was "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " at line "; // const-string v2, " at line "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " column "; // const-string v2, " column "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void B ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.j;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
return;
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected null but was "; // const-string v2, "Expected null but was "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " at line "; // const-string v2, " at line "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " column "; // const-string v2, " column "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String C ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.g;
/* if-eq v0, v1, :cond_1 */
v1 = e.f.d.f0.e.h;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected a string but was "; // const-string v2, "Expected a string but was "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " at line "; // const-string v2, " at line "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " column "; // const-string v2, " column "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 4 */
} // :cond_1
} // :goto_0
v0 = this.n;
/* .line 5 */
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
} // .end method
public final e.f.d.f0.e D ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
v1 = (( e.f.d.f0.c ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->d(Z)I
/* const/16 v2, 0x22 */
/* if-eq v1, v2, :cond_3 */
/* const/16 v2, 0x27 */
/* if-eq v1, v2, :cond_2 */
/* const/16 v2, 0x5b */
/* if-eq v1, v2, :cond_1 */
/* const/16 v2, 0x7b */
/* if-eq v1, v2, :cond_0 */
/* .line 2 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr v1, v0 */
/* iput v1, p0, Le/f/d/f0/c;->f:I */
/* .line 3 */
(( e.f.d.f0.c ) p0 ).H ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->H()Le/f/d/f0/e;
/* .line 4 */
} // :cond_0
v0 = e.f.d.f0.d.d;
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/d;)V
/* .line 5 */
v0 = e.f.d.f0.e.d;
this.l = v0;
/* .line 6 */
} // :cond_1
v0 = e.f.d.f0.d.b;
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/d;)V
/* .line 7 */
v0 = e.f.d.f0.e.b;
this.l = v0;
/* .line 8 */
} // :cond_2
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
} // :cond_3
/* int-to-char v0, v1 */
/* .line 9 */
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(C)Ljava/lang/String;
this.n = v0;
/* .line 10 */
v0 = e.f.d.f0.e.g;
this.l = v0;
} // .end method
public final e.f.d.f0.e E ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
v1 = (( e.f.d.f0.c ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->d(Z)I
/* const/16 v2, 0x3a */
/* if-eq v1, v2, :cond_2 */
/* const/16 v2, 0x3d */
/* if-ne v1, v2, :cond_1 */
/* .line 2 */
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 3 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* if-lt v1, v2, :cond_0 */
v1 = (( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_0
v1 = this.e;
/* iget v2, p0, Le/f/d/f0/c;->f:I */
/* aget-char v1, v1, v2 */
/* const/16 v3, 0x3e */
/* if-ne v1, v3, :cond_2 */
/* add-int/2addr v2, v0 */
/* .line 4 */
/* iput v2, p0, Le/f/d/f0/c;->f:I */
} // :cond_1
final String v0 = "Expected \':\'"; // const-string v0, "Expected \':\'"
/* .line 5 */
(( e.f.d.f0.c ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
int v0 = 0; // const/4 v0, 0x0
/* throw v0 */
/* .line 6 */
} // :cond_2
} // :goto_0
v1 = this.j;
/* iget v2, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr v2, v0 */
v0 = e.f.d.f0.d.f;
/* aput-object v0, v1, v2 */
/* .line 7 */
(( e.f.d.f0.c ) p0 ).D ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;
} // .end method
public e.f.d.f0.e F ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = e.f.d.f0.b.a;
v1 = this.j;
/* iget v2, p0, Le/f/d/f0/c;->k:I */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* aget-object v1, v1, v2 */
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 0; // const/4 v1, 0x0
/* packed-switch v0, :pswitch_data_0 */
/* .line 3 */
/* new-instance v0, Ljava/lang/AssertionError; */
/* invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V */
/* throw v0 */
/* .line 4 */
/* :pswitch_0 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "JsonReader is closed"; // const-string v1, "JsonReader is closed"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 5 */
/* :pswitch_1 */
v0 = (( e.f.d.f0.c ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Le/f/d/f0/c;->d(Z)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_1 */
/* .line 6 */
v0 = e.f.d.f0.e.k;
/* .line 7 */
} // :cond_1
/* iget v0, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr v0, v3 */
/* iput v0, p0, Le/f/d/f0/c;->f:I */
/* .line 8 */
/* iget-boolean v0, p0, Le/f/d/f0/c;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
(( e.f.d.f0.c ) p0 ).D ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;
} // :cond_2
final String v0 = "Expected EOF"; // const-string v0, "Expected EOF"
/* .line 10 */
(( e.f.d.f0.c ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
int v0 = 0; // const/4 v0, 0x0
/* throw v0 */
/* .line 11 */
/* :pswitch_2 */
(( e.f.d.f0.c ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/f/d/f0/c;->b(Z)Le/f/d/f0/e;
/* .line 12 */
/* :pswitch_3 */
(( e.f.d.f0.c ) p0 ).E ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->E()Le/f/d/f0/e;
/* .line 13 */
/* :pswitch_4 */
(( e.f.d.f0.c ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->b(Z)Le/f/d/f0/e;
/* .line 14 */
/* :pswitch_5 */
(( e.f.d.f0.c ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/d/f0/c;->a(Z)Le/f/d/f0/e;
/* .line 15 */
/* :pswitch_6 */
(( e.f.d.f0.c ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->a(Z)Le/f/d/f0/e;
/* .line 16 */
/* :pswitch_7 */
/* iget-boolean v0, p0, Le/f/d/f0/c;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 17 */
(( e.f.d.f0.c ) p0 ).o ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->o()V
/* .line 18 */
} // :cond_3
v0 = this.j;
/* iget v1, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr v1, v3 */
v2 = e.f.d.f0.d.h;
/* aput-object v2, v0, v1 */
/* .line 19 */
(( e.f.d.f0.c ) p0 ).D ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;
/* .line 20 */
/* iget-boolean v1, p0, Le/f/d/f0/c;->d:Z */
/* if-nez v1, :cond_5 */
v1 = this.l;
v2 = e.f.d.f0.e.b;
/* if-eq v1, v2, :cond_5 */
v2 = e.f.d.f0.e.d;
/* if-ne v1, v2, :cond_4 */
/* .line 21 */
} // :cond_4
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected JSON document to start with \'[\' or \'{\' but was "; // const-string v2, "Expected JSON document to start with \'[\' or \'{\' but was "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " at line "; // const-string v2, " at line "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " column "; // const-string v2, " column "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_5
} // :goto_0
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public final Object G ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Le/f/d/f0/c;->f:I */
/* iget v1, p0, Le/f/d/f0/c;->g:I */
int v2 = 0; // const/4 v2, 0x0
final String v3 = "Unterminated escape sequence"; // const-string v3, "Unterminated escape sequence"
/* if-ne v0, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
v0 = (( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
(( e.f.d.f0.c ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
/* throw v2 */
/* .line 3 */
} // :cond_1
} // :goto_0
v0 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* add-int/lit8 v4, v1, 0x1 */
/* iput v4, p0, Le/f/d/f0/c;->f:I */
/* aget-char v0, v0, v1 */
/* const/16 v1, 0x62 */
/* if-eq v0, v1, :cond_d */
/* const/16 v1, 0x66 */
/* if-eq v0, v1, :cond_c */
/* const/16 v5, 0x6e */
/* const/16 v6, 0xa */
/* if-eq v0, v5, :cond_b */
/* const/16 v5, 0x72 */
/* if-eq v0, v5, :cond_a */
/* const/16 v5, 0x74 */
/* if-eq v0, v5, :cond_9 */
/* const/16 v5, 0x75 */
/* if-eq v0, v5, :cond_2 */
} // :cond_2
int v0 = 4; // const/4 v0, 0x4
/* add-int/2addr v4, v0 */
/* .line 4 */
/* iget v5, p0, Le/f/d/f0/c;->g:I */
/* if-le v4, v5, :cond_4 */
v4 = (( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 5 */
} // :cond_3
(( e.f.d.f0.c ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
/* throw v2 */
} // :cond_4
} // :goto_1
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
/* iget v3, p0, Le/f/d/f0/c;->f:I */
/* add-int/lit8 v4, v3, 0x4 */
} // :goto_2
/* if-ge v3, v4, :cond_8 */
/* .line 7 */
v5 = this.e;
/* aget-char v5, v5, v3 */
/* shl-int/lit8 v2, v2, 0x4 */
/* int-to-char v2, v2 */
/* const/16 v7, 0x30 */
/* if-lt v5, v7, :cond_5 */
/* const/16 v7, 0x39 */
/* if-gt v5, v7, :cond_5 */
/* add-int/lit8 v5, v5, -0x30 */
} // :goto_3
/* add-int/2addr v2, v5 */
/* int-to-char v2, v2 */
} // :cond_5
/* const/16 v7, 0x61 */
/* if-lt v5, v7, :cond_6 */
/* if-gt v5, v1, :cond_6 */
/* add-int/lit8 v5, v5, -0x61 */
} // :goto_4
/* add-int/2addr v5, v6 */
} // :cond_6
/* const/16 v7, 0x41 */
/* if-lt v5, v7, :cond_7 */
/* const/16 v7, 0x46 */
/* if-gt v5, v7, :cond_7 */
/* add-int/lit8 v5, v5, -0x41 */
} // :goto_5
/* add-int/lit8 v3, v3, 0x1 */
/* .line 8 */
} // :cond_7
/* new-instance v1, Ljava/lang/NumberFormatException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "\\u"; // const-string v3, "\\u"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.b;
v4 = this.e;
/* iget v5, p0, Le/f/d/f0/c;->f:I */
(( e.f.d.f0.h ) v3 ).a ( v4, v5, v0 ); // invoke-virtual {v3, v4, v5, v0}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 9 */
} // :cond_8
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Le/f/d/f0/c;->f:I */
} // :cond_9
/* const/16 v0, 0x9 */
} // :cond_a
/* const/16 v0, 0xd */
} // :cond_b
} // :cond_c
/* const/16 v0, 0xc */
} // :cond_d
/* const/16 v0, 0x8 */
} // .end method
public final e.f.d.f0.e H ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( e.f.d.f0.c ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Z)Ljava/lang/String;
this.n = v0;
/* .line 2 */
/* iget v0, p0, Le/f/d/f0/c;->p:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( e.f.d.f0.c ) p0 ).p ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->p()Le/f/d/f0/e;
this.l = v0;
/* .line 4 */
v1 = e.f.d.f0.e.g;
/* if-ne v0, v1, :cond_0 */
/* .line 5 */
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 6 */
} // :cond_0
v0 = this.l;
} // :cond_1
final String v0 = "Expected literal value"; // const-string v0, "Expected literal value"
/* .line 7 */
(( e.f.d.f0.c ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
int v0 = 0; // const/4 v0, 0x0
/* throw v0 */
} // .end method
public final void I ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
} // :cond_0
/* iget v0, p0, Le/f/d/f0/c;->f:I */
/* iget v1, p0, Le/f/d/f0/c;->g:I */
/* if-lt v0, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
v0 = (( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
} // :cond_1
v0 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Le/f/d/f0/c;->f:I */
/* aget-char v0, v0, v1 */
/* const/16 v1, 0xd */
/* if-eq v0, v1, :cond_2 */
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_0 */
} // :cond_2
return;
} // .end method
public void J ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/f/d/f0/c;->q:Z */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :cond_0
try { // :try_start_0
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
/* .line 3 */
v3 = e.f.d.f0.e.b;
/* if-eq v2, v3, :cond_3 */
v3 = e.f.d.f0.e.d;
/* if-ne v2, v3, :cond_1 */
/* .line 4 */
} // :cond_1
v3 = e.f.d.f0.e.c;
/* if-eq v2, v3, :cond_2 */
v3 = e.f.d.f0.e.e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-ne v2, v3, :cond_4 */
} // :cond_2
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_3
} // :goto_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
} // :goto_1
/* if-nez v1, :cond_0 */
/* .line 5 */
/* iput-boolean v0, p0, Le/f/d/f0/c;->q:Z */
return;
/* :catchall_0 */
/* move-exception v1 */
/* iput-boolean v0, p0, Le/f/d/f0/c;->q:Z */
/* throw v1 */
} // .end method
public final e.f.d.f0.e a ( Boolean p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const/16 v0, 0x5d */
/* const/16 v1, 0x3b */
/* const/16 v2, 0x2c */
int v3 = 1; // const/4 v3, 0x1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 13 */
v4 = this.j;
/* iget v5, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr v5, v3 */
v6 = e.f.d.f0.d.c;
/* aput-object v6, v4, v5 */
/* .line 14 */
} // :cond_0
v4 = (( e.f.d.f0.c ) p0 ).d ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->d(Z)I
/* if-eq v4, v2, :cond_3 */
/* if-eq v4, v1, :cond_2 */
/* if-ne v4, v0, :cond_1 */
/* .line 15 */
/* iget p1, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr p1, v3 */
/* iput p1, p0, Le/f/d/f0/c;->k:I */
/* .line 16 */
p1 = e.f.d.f0.e.c;
this.l = p1;
} // :cond_1
final String p1 = "Unterminated array"; // const-string p1, "Unterminated array"
/* .line 17 */
(( e.f.d.f0.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
int p1 = 0; // const/4 p1, 0x0
/* throw p1 */
/* .line 18 */
} // :cond_2
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 19 */
} // :cond_3
} // :goto_0
v4 = (( e.f.d.f0.c ) p0 ).d ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->d(Z)I
/* if-eq v4, v2, :cond_5 */
/* if-eq v4, v1, :cond_5 */
/* if-eq v4, v0, :cond_4 */
/* .line 20 */
/* iget p1, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr p1, v3 */
/* iput p1, p0, Le/f/d/f0/c;->f:I */
/* .line 21 */
(( e.f.d.f0.c ) p0 ).D ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;
} // :cond_4
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 22 */
/* iget p1, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr p1, v3 */
/* iput p1, p0, Le/f/d/f0/c;->k:I */
/* .line 23 */
p1 = e.f.d.f0.e.c;
this.l = p1;
/* .line 24 */
} // :cond_5
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 25 */
/* iget p1, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr p1, v3 */
/* iput p1, p0, Le/f/d/f0/c;->f:I */
final String p1 = "null"; // const-string p1, "null"
/* .line 26 */
this.n = p1;
/* .line 27 */
p1 = e.f.d.f0.e.j;
this.l = p1;
} // .end method
public final e.f.d.f0.e a ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* .line 66 */
/* aget-char v0, p1, p2 */
/* const/16 v1, 0x2d */
/* if-ne v0, v1, :cond_0 */
/* add-int/lit8 v0, p2, 0x1 */
/* .line 67 */
/* aget-char v2, p1, v0 */
/* move v6, v2 */
/* move v2, v0 */
/* move v0, v6 */
} // :cond_0
/* move v2, p2 */
} // :goto_0
/* const/16 v3, 0x39 */
/* const/16 v4, 0x30 */
/* if-ne v0, v4, :cond_1 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 68 */
/* aget-char v0, p1, v2 */
} // :cond_1
/* const/16 v5, 0x31 */
/* if-lt v0, v5, :cond_a */
/* if-gt v0, v3, :cond_a */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 69 */
/* aget-char v0, p1, v2 */
} // :goto_1
/* if-lt v0, v4, :cond_2 */
/* if-gt v0, v3, :cond_2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 70 */
/* aget-char v0, p1, v2 */
} // :cond_2
} // :goto_2
/* const/16 v5, 0x2e */
/* if-ne v0, v5, :cond_3 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 71 */
/* aget-char v0, p1, v2 */
} // :goto_3
/* if-lt v0, v4, :cond_3 */
/* if-gt v0, v3, :cond_3 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 72 */
/* aget-char v0, p1, v2 */
} // :cond_3
/* const/16 v5, 0x65 */
/* if-eq v0, v5, :cond_4 */
/* const/16 v5, 0x45 */
/* if-ne v0, v5, :cond_7 */
} // :cond_4
/* add-int/lit8 v2, v2, 0x1 */
/* .line 73 */
/* aget-char v0, p1, v2 */
/* const/16 v5, 0x2b */
/* if-eq v0, v5, :cond_5 */
/* if-ne v0, v1, :cond_6 */
} // :cond_5
/* add-int/lit8 v2, v2, 0x1 */
/* .line 74 */
/* aget-char v0, p1, v2 */
} // :cond_6
/* if-lt v0, v4, :cond_9 */
/* if-gt v0, v3, :cond_9 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 75 */
/* aget-char v0, p1, v2 */
} // :goto_4
/* if-lt v0, v4, :cond_7 */
/* if-gt v0, v3, :cond_7 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 76 */
/* aget-char v0, p1, v2 */
} // :cond_7
/* add-int/2addr p2, p3 */
/* if-ne v2, p2, :cond_8 */
/* .line 77 */
p1 = e.f.d.f0.e.h;
/* .line 78 */
} // :cond_8
p1 = e.f.d.f0.e.g;
/* .line 79 */
} // :cond_9
p1 = e.f.d.f0.e.g;
/* .line 80 */
} // :cond_a
p1 = e.f.d.f0.e.g;
} // .end method
public final java.lang.String a ( Object p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 46 */
v0 = this.e;
int v1 = 0; // const/4 v1, 0x0
/* move-object v2, v1 */
/* .line 47 */
} // :goto_0
/* iget v3, p0, Le/f/d/f0/c;->f:I */
/* .line 48 */
/* iget v4, p0, Le/f/d/f0/c;->g:I */
} // :goto_1
/* move v5, v4 */
/* move v4, v3 */
} // :goto_2
int v6 = 1; // const/4 v6, 0x1
/* if-ge v3, v5, :cond_5 */
/* add-int/lit8 v7, v3, 0x1 */
/* .line 49 */
/* aget-char v3, v0, v3 */
/* if-ne v3, p1, :cond_2 */
/* .line 50 */
/* iput v7, p0, Le/f/d/f0/c;->f:I */
/* .line 51 */
/* iget-boolean p1, p0, Le/f/d/f0/c;->q:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "skipped!"; // const-string p1, "skipped!"
} // :cond_0
/* if-nez v2, :cond_1 */
/* .line 52 */
p1 = this.b;
/* sub-int/2addr v7, v4 */
/* sub-int/2addr v7, v6 */
(( e.f.d.f0.h ) p1 ).a ( v0, v4, v7 ); // invoke-virtual {p1, v0, v4, v7}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;
} // :cond_1
/* sub-int/2addr v7, v4 */
/* sub-int/2addr v7, v6 */
/* .line 53 */
(( java.lang.StringBuilder ) v2 ).append ( v0, v4, v7 ); // invoke-virtual {v2, v0, v4, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 54 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
/* const/16 v8, 0x5c */
/* if-ne v3, v8, :cond_4 */
/* .line 55 */
/* iput v7, p0, Le/f/d/f0/c;->f:I */
/* if-nez v2, :cond_3 */
/* .line 56 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
} // :cond_3
/* sub-int/2addr v7, v4 */
/* sub-int/2addr v7, v6 */
/* .line 57 */
(( java.lang.StringBuilder ) v2 ).append ( v0, v4, v7 ); // invoke-virtual {v2, v0, v4, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 58 */
v3 = (( e.f.d.f0.c ) p0 ).G ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->G()C
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 59 */
/* iget v3, p0, Le/f/d/f0/c;->f:I */
/* .line 60 */
/* iget v4, p0, Le/f/d/f0/c;->g:I */
} // :cond_4
/* move v3, v7 */
} // :cond_5
/* if-nez v2, :cond_6 */
/* .line 61 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
} // :cond_6
/* sub-int v5, v3, v4 */
/* .line 62 */
(( java.lang.StringBuilder ) v2 ).append ( v0, v4, v5 ); // invoke-virtual {v2, v0, v4, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 63 */
/* iput v3, p0, Le/f/d/f0/c;->f:I */
/* .line 64 */
v3 = (( e.f.d.f0.c ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Le/f/d/f0/c;->a(I)Z
if ( v3 != null) { // if-eqz v3, :cond_7
} // :cond_7
final String p1 = "Unterminated string"; // const-string p1, "Unterminated string"
/* .line 65 */
(( e.f.d.f0.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
/* throw v1 */
} // .end method
public final void a ( Object p0 ) {
/* .locals 4 */
/* .line 8 */
/* iget v0, p0, Le/f/d/f0/c;->k:I */
v1 = this.j;
/* array-length v2, v1 */
/* if-ne v0, v2, :cond_0 */
/* mul-int/lit8 v2, v0, 0x2 */
/* .line 9 */
/* new-array v2, v2, [Le/f/d/f0/d; */
int v3 = 0; // const/4 v3, 0x0
/* .line 10 */
java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
/* .line 11 */
this.j = v2;
/* .line 12 */
} // :cond_0
v0 = this.j;
/* iget v1, p0, Le/f/d/f0/c;->k:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Le/f/d/f0/c;->k:I */
/* aput-object p1, v0, v1 */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 5 */
v0 = this.l;
/* if-ne v0, p1, :cond_0 */
/* .line 6 */
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
return;
/* .line 7 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected "; // const-string v2, "Expected "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " but was "; // const-string p1, " but was "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " at line "; // const-string p1, " at line "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " column "; // const-string p1, " column "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final Boolean a ( Integer p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 28 */
v0 = this.e;
/* .line 29 */
/* iget v1, p0, Le/f/d/f0/c;->h:I */
/* .line 30 */
/* iget v2, p0, Le/f/d/f0/c;->i:I */
/* .line 31 */
/* iget v3, p0, Le/f/d/f0/c;->f:I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
int v6 = 1; // const/4 v6, 0x1
/* if-ge v5, v3, :cond_1 */
/* .line 32 */
/* aget-char v7, v0, v5 */
/* const/16 v8, 0xa */
/* if-ne v7, v8, :cond_0 */
/* add-int/lit8 v1, v1, 0x1 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :goto_1
/* add-int/lit8 v5, v5, 0x1 */
/* .line 33 */
} // :cond_1
/* iput v1, p0, Le/f/d/f0/c;->h:I */
/* .line 34 */
/* iput v2, p0, Le/f/d/f0/c;->i:I */
/* .line 35 */
/* iget v1, p0, Le/f/d/f0/c;->g:I */
/* iget v2, p0, Le/f/d/f0/c;->f:I */
/* if-eq v1, v2, :cond_2 */
/* sub-int/2addr v1, v2 */
/* .line 36 */
/* iput v1, p0, Le/f/d/f0/c;->g:I */
/* .line 37 */
java.lang.System .arraycopy ( v0,v2,v0,v4,v1 );
/* .line 38 */
} // :cond_2
/* iput v4, p0, Le/f/d/f0/c;->g:I */
/* .line 39 */
} // :goto_2
/* iput v4, p0, Le/f/d/f0/c;->f:I */
/* .line 40 */
} // :cond_3
v1 = this.c;
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* array-length v3, v0 */
/* sub-int/2addr v3, v2 */
v1 = (( java.io.Reader ) v1 ).read ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Ljava/io/Reader;->read([CII)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_5 */
/* .line 41 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* add-int/2addr v2, v1 */
/* iput v2, p0, Le/f/d/f0/c;->g:I */
/* .line 42 */
/* iget v1, p0, Le/f/d/f0/c;->h:I */
/* if-ne v1, v6, :cond_4 */
/* iget v1, p0, Le/f/d/f0/c;->i:I */
/* if-ne v1, v6, :cond_4 */
/* if-lez v2, :cond_4 */
/* aget-char v2, v0, v4 */
/* const v3, 0xfeff */
/* if-ne v2, v3, :cond_4 */
/* .line 43 */
/* iget v2, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v2, v6 */
/* iput v2, p0, Le/f/d/f0/c;->f:I */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 44 */
/* iput v1, p0, Le/f/d/f0/c;->i:I */
/* .line 45 */
} // :cond_4
/* iget v1, p0, Le/f/d/f0/c;->g:I */
/* if-lt v1, p1, :cond_3 */
} // :cond_5
} // .end method
public final e.f.d.f0.e b ( Boolean p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x7d */
int v2 = 1; // const/4 v2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
p1 = (( e.f.d.f0.c ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Le/f/d/f0/c;->d(Z)I
/* if-eq p1, v1, :cond_0 */
/* .line 4 */
/* iget p1, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr p1, v2 */
/* iput p1, p0, Le/f/d/f0/c;->f:I */
/* .line 5 */
} // :cond_0
/* iget p1, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr p1, v2 */
/* iput p1, p0, Le/f/d/f0/c;->k:I */
/* .line 6 */
p1 = e.f.d.f0.e.e;
this.l = p1;
/* .line 7 */
} // :cond_1
p1 = (( e.f.d.f0.c ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Le/f/d/f0/c;->d(Z)I
/* const/16 v3, 0x2c */
/* if-eq p1, v3, :cond_3 */
/* const/16 v3, 0x3b */
/* if-eq p1, v3, :cond_3 */
/* if-ne p1, v1, :cond_2 */
/* .line 8 */
/* iget p1, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr p1, v2 */
/* iput p1, p0, Le/f/d/f0/c;->k:I */
/* .line 9 */
p1 = e.f.d.f0.e.e;
this.l = p1;
} // :cond_2
final String p1 = "Unterminated object"; // const-string p1, "Unterminated object"
/* .line 10 */
(( e.f.d.f0.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
/* throw v0 */
/* .line 11 */
} // :cond_3
} // :goto_0
p1 = (( e.f.d.f0.c ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Le/f/d/f0/c;->d(Z)I
/* const/16 v1, 0x22 */
/* if-eq p1, v1, :cond_6 */
/* const/16 v1, 0x27 */
/* if-eq p1, v1, :cond_5 */
/* .line 12 */
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 13 */
/* iget p1, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr p1, v2 */
/* iput p1, p0, Le/f/d/f0/c;->f:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
(( e.f.d.f0.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Z)Ljava/lang/String;
this.m = p1;
/* .line 15 */
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
final String p1 = "Expected name"; // const-string p1, "Expected name"
/* .line 16 */
(( e.f.d.f0.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
/* throw v0 */
/* .line 17 */
} // :cond_5
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
} // :cond_6
/* int-to-char p1, p1 */
/* .line 18 */
(( e.f.d.f0.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->a(C)Ljava/lang/String;
this.m = p1;
/* .line 19 */
} // :goto_1
p1 = this.j;
/* iget v0, p0, Le/f/d/f0/c;->k:I */
/* sub-int/2addr v0, v2 */
v1 = e.f.d.f0.d.e;
/* aput-object v1, p1, v0 */
/* .line 20 */
p1 = e.f.d.f0.e.f;
this.l = p1;
} // .end method
public final Boolean b ( java.lang.String p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 21 */
} // :goto_0
/* iget v0, p0, Le/f/d/f0/c;->f:I */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, v1 */
/* iget v1, p0, Le/f/d/f0/c;->g:I */
int v2 = 0; // const/4 v2, 0x0
/* if-le v0, v1, :cond_1 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v0 = (( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* .line 22 */
} // :cond_1
} // :goto_1
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v1 = 1; // const/4 v1, 0x1
/* if-ge v2, v0, :cond_3 */
/* .line 23 */
v0 = this.e;
/* iget v3, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v3, v2 */
/* aget-char v0, v0, v3 */
v3 = (( java.lang.String ) p1 ).charAt ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
/* if-eq v0, v3, :cond_2 */
/* .line 24 */
/* iget v0, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Le/f/d/f0/c;->f:I */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public final e.f.d.f0.e c ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 3 */
v0 = this.l;
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
this.l = v1;
/* .line 5 */
this.n = v1;
/* .line 6 */
this.m = v1;
} // .end method
public final java.io.IOException c ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 27 */
/* new-instance v0, Lcom/google/gson/stream/MalformedJsonException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " at line "; // const-string p1, " at line "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " column "; // const-string p1, " column "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final java.lang.String c ( Boolean p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = -1; // const/4 v0, -0x1
/* .line 7 */
/* iput v0, p0, Le/f/d/f0/c;->o:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
/* iput v0, p0, Le/f/d/f0/c;->p:I */
int v1 = 0; // const/4 v1, 0x0
/* move-object v3, v1 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 9 */
} // :goto_0
/* iget v4, p0, Le/f/d/f0/c;->f:I */
/* add-int v5, v4, v2 */
/* iget v6, p0, Le/f/d/f0/c;->g:I */
/* if-ge v5, v6, :cond_2 */
/* .line 10 */
v5 = this.e;
/* add-int/2addr v4, v2 */
/* aget-char v4, v5, v4 */
/* const/16 v5, 0x9 */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0xa */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0xc */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0xd */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x20 */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x23 */
/* if-eq v4, v5, :cond_1 */
/* const/16 v5, 0x2c */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x2f */
/* if-eq v4, v5, :cond_1 */
/* const/16 v5, 0x3d */
/* if-eq v4, v5, :cond_1 */
/* const/16 v5, 0x7b */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x7d */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x3a */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x3b */
/* if-eq v4, v5, :cond_1 */
/* packed-switch v4, :pswitch_data_0 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 11 */
} // :cond_1
/* :pswitch_0 */
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 12 */
} // :cond_2
v4 = this.e;
/* array-length v4, v4 */
/* if-ge v2, v4, :cond_5 */
/* add-int/lit8 v4, v2, 0x1 */
/* .line 13 */
v4 = (( e.f.d.f0.c ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Le/f/d/f0/c;->a(I)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 14 */
} // :cond_3
v4 = this.e;
/* iget v5, p0, Le/f/d/f0/c;->g:I */
/* aput-char v0, v4, v5 */
} // :cond_4
} // :goto_1
/* :pswitch_1 */
/* move v0, v2 */
} // :cond_5
/* if-nez v3, :cond_6 */
/* .line 15 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 16 */
} // :cond_6
v4 = this.e;
/* iget v5, p0, Le/f/d/f0/c;->f:I */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5, v2 ); // invoke-virtual {v3, v4, v5, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 17 */
/* iget v4, p0, Le/f/d/f0/c;->p:I */
/* add-int/2addr v4, v2 */
/* iput v4, p0, Le/f/d/f0/c;->p:I */
/* .line 18 */
/* iget v4, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v4, v2 */
/* iput v4, p0, Le/f/d/f0/c;->f:I */
int v2 = 1; // const/4 v2, 0x1
/* .line 19 */
v2 = (( e.f.d.f0.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/d/f0/c;->a(I)Z
/* if-nez v2, :cond_0 */
} // :goto_2
if ( p1 != null) { // if-eqz p1, :cond_7
/* if-nez v3, :cond_7 */
/* .line 20 */
/* iget p1, p0, Le/f/d/f0/c;->f:I */
/* iput p1, p0, Le/f/d/f0/c;->o:I */
/* .line 21 */
} // :cond_7
/* iget-boolean p1, p0, Le/f/d/f0/c;->q:Z */
if ( p1 != null) { // if-eqz p1, :cond_8
final String v1 = "skipped!"; // const-string v1, "skipped!"
} // :cond_8
/* if-nez v3, :cond_9 */
/* .line 22 */
p1 = this.b;
v1 = this.e;
/* iget v2, p0, Le/f/d/f0/c;->f:I */
(( e.f.d.f0.h ) p1 ).a ( v1, v2, v0 ); // invoke-virtual {p1, v1, v2, v0}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;
/* .line 23 */
} // :cond_9
p1 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->f:I */
(( java.lang.StringBuilder ) v3 ).append ( p1, v1, v0 ); // invoke-virtual {v3, p1, v1, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 24 */
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 25 */
} // :goto_3
/* iget p1, p0, Le/f/d/f0/c;->p:I */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Le/f/d/f0/c;->p:I */
/* .line 26 */
/* iget p1, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Le/f/d/f0/c;->f:I */
/* :pswitch_data_0 */
/* .packed-switch 0x5b */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void close ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.n = v0;
/* .line 2 */
this.l = v0;
/* .line 3 */
v0 = this.j;
v1 = e.f.d.f0.d.i;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput v0, p0, Le/f/d/f0/c;->k:I */
/* .line 5 */
v0 = this.c;
(( java.io.Reader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/Reader;->close()V
return;
} // .end method
public final Integer d ( Boolean p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.e;
/* .line 3 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* .line 4 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
/* if-ne v1, v2, :cond_2 */
/* .line 5 */
/* iput v1, p0, Le/f/d/f0/c;->f:I */
/* .line 6 */
v1 = (( e.f.d.f0.c ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/f/d/f0/c;->a(I)Z
/* if-nez v1, :cond_1 */
/* if-nez p1, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/io/EOFException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "End of input at line "; // const-string v1, "End of input at line "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " column "; // const-string v1, " column "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 8 */
} // :cond_1
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* .line 9 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
} // :cond_2
/* add-int/lit8 v4, v1, 0x1 */
/* .line 10 */
/* aget-char v1, v0, v1 */
/* const/16 v5, 0x9 */
/* if-eq v1, v5, :cond_9 */
/* const/16 v5, 0xa */
/* if-eq v1, v5, :cond_9 */
/* const/16 v5, 0xd */
/* if-eq v1, v5, :cond_9 */
/* const/16 v5, 0x20 */
/* if-eq v1, v5, :cond_9 */
/* const/16 v5, 0x23 */
/* if-eq v1, v5, :cond_8 */
/* const/16 v5, 0x2f */
/* if-eq v1, v5, :cond_3 */
/* .line 11 */
/* iput v4, p0, Le/f/d/f0/c;->f:I */
/* .line 12 */
} // :cond_3
/* iput v4, p0, Le/f/d/f0/c;->f:I */
int v6 = 2; // const/4 v6, 0x2
/* if-ne v4, v2, :cond_4 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 13 */
/* iput v4, p0, Le/f/d/f0/c;->f:I */
/* .line 14 */
v2 = (( e.f.d.f0.c ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Le/f/d/f0/c;->a(I)Z
/* .line 15 */
/* iget v4, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v4, v3 */
/* iput v4, p0, Le/f/d/f0/c;->f:I */
/* if-nez v2, :cond_4 */
/* .line 16 */
} // :cond_4
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 17 */
/* iget v2, p0, Le/f/d/f0/c;->f:I */
/* aget-char v3, v0, v2 */
/* const/16 v4, 0x2a */
/* if-eq v3, v4, :cond_6 */
/* if-eq v3, v5, :cond_5 */
} // :cond_5
/* add-int/lit8 v2, v2, 0x1 */
/* .line 18 */
/* iput v2, p0, Le/f/d/f0/c;->f:I */
/* .line 19 */
(( e.f.d.f0.c ) p0 ).I ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->I()V
/* .line 20 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* .line 21 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* goto/16 :goto_0 */
} // :cond_6
/* add-int/lit8 v2, v2, 0x1 */
/* .line 22 */
/* iput v2, p0, Le/f/d/f0/c;->f:I */
final String v1 = "*/"; // const-string v1, "*/"
/* .line 23 */
v1 = (( e.f.d.f0.c ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/f/d/f0/c;->b(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 24 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v1, v6 */
/* .line 25 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* goto/16 :goto_0 */
} // :cond_7
final String p1 = "Unterminated comment"; // const-string p1, "Unterminated comment"
/* .line 26 */
(( e.f.d.f0.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
int p1 = 0; // const/4 p1, 0x0
/* throw p1 */
/* .line 27 */
} // :cond_8
/* iput v4, p0, Le/f/d/f0/c;->f:I */
/* .line 28 */
(( e.f.d.f0.c ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->n()V
/* .line 29 */
(( e.f.d.f0.c ) p0 ).I ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->I()V
/* .line 30 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* .line 31 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* goto/16 :goto_0 */
} // :cond_9
/* move v1, v4 */
/* goto/16 :goto_0 */
} // .end method
public final void e ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Le/f/d/f0/c;->d:Z */
return;
} // .end method
public void l ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.d.f0.e.b;
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V
return;
} // .end method
public void m ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.d.f0.e.d;
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V
return;
} // .end method
public final void n ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Le/f/d/f0/c;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
final String v0 = "Use JsonReader.setLenient(true) to accept malformed JSON"; // const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"
/* .line 2 */
(( e.f.d.f0.c ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;
int v0 = 0; // const/4 v0, 0x0
/* throw v0 */
} // .end method
public final void o ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( e.f.d.f0.c ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->d(Z)I
/* .line 2 */
/* iget v1, p0, Le/f/d/f0/c;->f:I */
/* sub-int/2addr v1, v0 */
/* iput v1, p0, Le/f/d/f0/c;->f:I */
/* .line 3 */
v0 = e.f.d.f0.c.r;
/* array-length v2, v0 */
/* add-int/2addr v1, v2 */
/* iget v2, p0, Le/f/d/f0/c;->g:I */
/* if-le v1, v2, :cond_0 */
/* array-length v0, v0 */
v0 = (( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z
/* if-nez v0, :cond_0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
v1 = e.f.d.f0.c.r;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_2 */
/* .line 5 */
v2 = this.e;
/* iget v3, p0, Le/f/d/f0/c;->f:I */
/* add-int/2addr v3, v0 */
/* aget-char v2, v2, v3 */
/* aget-char v1, v1, v0 */
/* if-eq v2, v1, :cond_1 */
return;
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 6 */
} // :cond_2
/* iget v0, p0, Le/f/d/f0/c;->f:I */
/* array-length v1, v1 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Le/f/d/f0/c;->f:I */
return;
} // .end method
public final e.f.d.f0.e p ( ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Le/f/d/f0/c;->o:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
v0 = e.f.d.f0.e.g;
/* .line 3 */
} // :cond_0
/* iget v1, p0, Le/f/d/f0/c;->p:I */
/* const/16 v2, 0x55 */
/* const/16 v3, 0x75 */
/* const/16 v4, 0x4c */
/* const/16 v5, 0x6c */
int v6 = 4; // const/4 v6, 0x4
/* if-ne v1, v6, :cond_5 */
/* const/16 v1, 0x6e */
v7 = this.e;
/* aget-char v8, v7, v0 */
/* if-eq v1, v8, :cond_1 */
/* const/16 v1, 0x4e */
/* aget-char v0, v7, v0 */
/* if-ne v1, v0, :cond_5 */
} // :cond_1
v0 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v7, v1, 0x1 */
/* aget-char v7, v0, v7 */
/* if-eq v3, v7, :cond_2 */
/* add-int/lit8 v1, v1, 0x1 */
/* aget-char v0, v0, v1 */
/* if-ne v2, v0, :cond_5 */
} // :cond_2
v0 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v7, v1, 0x2 */
/* aget-char v7, v0, v7 */
/* if-eq v5, v7, :cond_3 */
/* add-int/lit8 v1, v1, 0x2 */
/* aget-char v0, v0, v1 */
/* if-ne v4, v0, :cond_5 */
} // :cond_3
v0 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v7, v1, 0x3 */
/* aget-char v7, v0, v7 */
/* if-eq v5, v7, :cond_4 */
/* add-int/lit8 v1, v1, 0x3 */
/* aget-char v0, v0, v1 */
/* if-ne v4, v0, :cond_5 */
} // :cond_4
final String v0 = "null"; // const-string v0, "null"
/* .line 4 */
this.n = v0;
/* .line 5 */
v0 = e.f.d.f0.e.j;
/* .line 6 */
} // :cond_5
/* iget v0, p0, Le/f/d/f0/c;->p:I */
/* const/16 v1, 0x45 */
/* const/16 v7, 0x65 */
/* if-ne v0, v6, :cond_a */
/* const/16 v0, 0x74 */
v8 = this.e;
/* iget v9, p0, Le/f/d/f0/c;->o:I */
/* aget-char v10, v8, v9 */
/* if-eq v0, v10, :cond_6 */
/* const/16 v0, 0x54 */
/* aget-char v8, v8, v9 */
/* if-ne v0, v8, :cond_a */
} // :cond_6
/* const/16 v0, 0x72 */
v8 = this.e;
/* iget v9, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v10, v9, 0x1 */
/* aget-char v10, v8, v10 */
/* if-eq v0, v10, :cond_7 */
/* const/16 v0, 0x52 */
/* add-int/lit8 v9, v9, 0x1 */
/* aget-char v8, v8, v9 */
/* if-ne v0, v8, :cond_a */
} // :cond_7
v0 = this.e;
/* iget v8, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v9, v8, 0x2 */
/* aget-char v9, v0, v9 */
/* if-eq v3, v9, :cond_8 */
/* add-int/lit8 v8, v8, 0x2 */
/* aget-char v0, v0, v8 */
/* if-ne v2, v0, :cond_a */
} // :cond_8
v0 = this.e;
/* iget v2, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v3, v2, 0x3 */
/* aget-char v3, v0, v3 */
/* if-eq v7, v3, :cond_9 */
/* add-int/lit8 v2, v2, 0x3 */
/* aget-char v0, v0, v2 */
/* if-ne v1, v0, :cond_a */
} // :cond_9
final String v0 = "true"; // const-string v0, "true"
/* .line 7 */
this.n = v0;
/* .line 8 */
v0 = e.f.d.f0.e.i;
/* .line 9 */
} // :cond_a
/* iget v0, p0, Le/f/d/f0/c;->p:I */
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_10 */
/* const/16 v0, 0x66 */
v2 = this.e;
/* iget v3, p0, Le/f/d/f0/c;->o:I */
/* aget-char v8, v2, v3 */
/* if-eq v0, v8, :cond_b */
/* const/16 v0, 0x46 */
/* aget-char v2, v2, v3 */
/* if-ne v0, v2, :cond_10 */
} // :cond_b
/* const/16 v0, 0x61 */
v2 = this.e;
/* iget v3, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v8, v3, 0x1 */
/* aget-char v8, v2, v8 */
/* if-eq v0, v8, :cond_c */
/* const/16 v0, 0x41 */
/* add-int/lit8 v3, v3, 0x1 */
/* aget-char v2, v2, v3 */
/* if-ne v0, v2, :cond_10 */
} // :cond_c
v0 = this.e;
/* iget v2, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v3, v2, 0x2 */
/* aget-char v3, v0, v3 */
/* if-eq v5, v3, :cond_d */
/* add-int/lit8 v2, v2, 0x2 */
/* aget-char v0, v0, v2 */
/* if-ne v4, v0, :cond_10 */
} // :cond_d
/* const/16 v0, 0x73 */
v2 = this.e;
/* iget v3, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v4, v3, 0x3 */
/* aget-char v4, v2, v4 */
/* if-eq v0, v4, :cond_e */
/* const/16 v0, 0x53 */
/* add-int/lit8 v3, v3, 0x3 */
/* aget-char v2, v2, v3 */
/* if-ne v0, v2, :cond_10 */
} // :cond_e
v0 = this.e;
/* iget v2, p0, Le/f/d/f0/c;->o:I */
/* add-int/lit8 v3, v2, 0x4 */
/* aget-char v3, v0, v3 */
/* if-eq v7, v3, :cond_f */
/* add-int/2addr v2, v6 */
/* aget-char v0, v0, v2 */
/* if-ne v1, v0, :cond_10 */
} // :cond_f
final String v0 = "false"; // const-string v0, "false"
/* .line 10 */
this.n = v0;
/* .line 11 */
v0 = e.f.d.f0.e.i;
/* .line 12 */
} // :cond_10
v0 = this.b;
v1 = this.e;
/* iget v2, p0, Le/f/d/f0/c;->o:I */
/* iget v3, p0, Le/f/d/f0/c;->p:I */
(( e.f.d.f0.h ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;
this.n = v0;
/* .line 13 */
v0 = this.e;
/* iget v1, p0, Le/f/d/f0/c;->o:I */
/* iget v2, p0, Le/f/d/f0/c;->p:I */
(( e.f.d.f0.c ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Le/f/d/f0/c;->a([CII)Le/f/d/f0/e;
} // .end method
public void q ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.d.f0.e.c;
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V
return;
} // .end method
public void r ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.d.f0.e.e;
(( e.f.d.f0.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V
return;
} // .end method
public final Integer s ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Le/f/d/f0/c;->i:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
/* iget v2, p0, Le/f/d/f0/c;->f:I */
/* if-ge v1, v2, :cond_1 */
/* .line 3 */
v2 = this.e;
/* aget-char v2, v2, v1 */
/* const/16 v3, 0xa */
/* if-ne v2, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final Integer t ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Le/f/d/f0/c;->h:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
/* iget v2, p0, Le/f/d/f0/c;->f:I */
/* if-ge v1, v2, :cond_1 */
/* .line 3 */
v2 = this.e;
/* aget-char v2, v2, v1 */
/* const/16 v3, 0xa */
/* if-ne v2, v3, :cond_0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* const-class v1, Le/f/d/f0/c; */
(( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " at line "; // const-string v1, " at line "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " column "; // const-string v1, " column "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Boolean u ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.e;
/* if-eq v0, v1, :cond_0 */
v1 = e.f.d.f0.e.c;
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean v ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/f/d/f0/c;->d:Z */
} // .end method
public Boolean w ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.i;
/* if-ne v0, v1, :cond_1 */
/* .line 3 */
v0 = this.n;
final String v1 = "true"; // const-string v1, "true"
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected a boolean but was "; // const-string v2, "Expected a boolean but was "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " at line "; // const-string v2, " at line "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " column "; // const-string v2, " column "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Double x ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.g;
final String v2 = " column "; // const-string v2, " column "
final String v3 = " at line "; // const-string v3, " at line "
/* if-eq v0, v1, :cond_1 */
v1 = e.f.d.f0.e.h;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Expected a double but was "; // const-string v4, "Expected a double but was "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 4 */
} // :cond_1
} // :goto_0
v0 = this.n;
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v0 */
/* const-wide/high16 v4, 0x3ff0000000000000L # 1.0 */
/* cmpl-double v6, v0, v4 */
/* if-ltz v6, :cond_3 */
/* .line 5 */
v4 = this.n;
final String v5 = "0"; // const-string v5, "0"
v4 = (( java.lang.String ) v4 ).startsWith ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_2 */
/* .line 6 */
} // :cond_2
/* new-instance v0, Lcom/google/gson/stream/MalformedJsonException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "JSON forbids octal prefixes: "; // const-string v4, "JSON forbids octal prefixes: "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 7 */
} // :cond_3
} // :goto_1
/* iget-boolean v4, p0, Le/f/d/f0/c;->d:Z */
/* if-nez v4, :cond_5 */
v4 = java.lang.Double .isNaN ( v0,v1 );
/* if-nez v4, :cond_4 */
v4 = java.lang.Double .isInfinite ( v0,v1 );
/* if-nez v4, :cond_4 */
/* .line 8 */
} // :cond_4
/* new-instance v0, Lcom/google/gson/stream/MalformedJsonException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "JSON forbids NaN and infinities: "; // const-string v4, "JSON forbids NaN and infinities: "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 9 */
} // :cond_5
} // :goto_2
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
/* return-wide v0 */
} // .end method
public Integer y ( ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.g;
final String v2 = "Expected an int but was "; // const-string v2, "Expected an int but was "
final String v3 = " column "; // const-string v3, " column "
final String v4 = " at line "; // const-string v4, " at line "
/* if-eq v0, v1, :cond_1 */
v1 = e.f.d.f0.e.h;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 4 */
} // :cond_1
} // :goto_0
try { // :try_start_0
v0 = this.n;
v0 = java.lang.Integer .parseInt ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
/* .line 5 */
v0 = this.n;
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v0 */
/* double-to-int v5, v0 */
/* int-to-double v6, v5 */
/* cmpl-double v8, v6, v0 */
/* if-nez v8, :cond_4 */
/* move v0, v5 */
} // :goto_1
/* int-to-long v1, v0 */
/* const-wide/16 v5, 0x1 */
/* cmp-long v7, v1, v5 */
/* if-ltz v7, :cond_3 */
/* .line 6 */
v1 = this.n;
final String v2 = "0"; // const-string v2, "0"
v1 = (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_2 */
/* .line 7 */
} // :cond_2
/* new-instance v0, Lcom/google/gson/stream/MalformedJsonException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "JSON forbids octal prefixes: "; // const-string v2, "JSON forbids octal prefixes: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 8 */
} // :cond_3
} // :goto_2
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
/* .line 9 */
} // :cond_4
/* new-instance v0, Ljava/lang/NumberFormatException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Long z ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.c ) p0 ).F ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
/* .line 2 */
v0 = this.l;
v1 = e.f.d.f0.e.g;
final String v2 = "Expected a long but was "; // const-string v2, "Expected a long but was "
final String v3 = " column "; // const-string v3, " column "
final String v4 = " at line "; // const-string v4, " at line "
/* if-eq v0, v1, :cond_1 */
v1 = e.f.d.f0.e.h;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 4 */
} // :cond_1
} // :goto_0
try { // :try_start_0
v0 = this.n;
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
/* .line 5 */
v0 = this.n;
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v0 */
/* double-to-long v5, v0 */
/* long-to-double v7, v5 */
/* cmpl-double v9, v7, v0 */
/* if-nez v9, :cond_4 */
/* move-wide v0, v5 */
} // :goto_1
/* const-wide/16 v5, 0x1 */
/* cmp-long v2, v0, v5 */
/* if-ltz v2, :cond_3 */
/* .line 6 */
v2 = this.n;
final String v5 = "0"; // const-string v5, "0"
v2 = (( java.lang.String ) v2 ).startsWith ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_2 */
/* .line 7 */
} // :cond_2
/* new-instance v0, Lcom/google/gson/stream/MalformedJsonException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "JSON forbids octal prefixes: "; // const-string v2, "JSON forbids octal prefixes: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 8 */
} // :cond_3
} // :goto_2
(( e.f.d.f0.c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;
/* return-wide v0 */
/* .line 9 */
} // :cond_4
/* new-instance v0, Ljava/lang/NumberFormatException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->t()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( e.f.d.f0.c ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/c;->s()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
