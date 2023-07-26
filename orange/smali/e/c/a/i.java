public class e.c.a.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e; //synthetic
	 /* # instance fields */
	 public e.c.a.d a;
	 public java.lang.String b;
	 public java.util.List c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/c/a/a;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.c.a.i ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
this.b = v0;
/* .line 4 */
this.c = v0;
/* .line 5 */
this.d = v0;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
} // :cond_0
p1 = e.c.a.d.b;
} // :goto_0
this.a = p1;
/* .line 7 */
this.b = p2;
return;
} // .end method
public static a ( ) { //synthethic
/* .locals 3 */
/* .line 1 */
v0 = e.c.a.i.e;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
e.c.a.b .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = e.c.a.b.e;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
try { // :try_start_1
v1 = e.c.a.b.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
try { // :try_start_2
v1 = e.c.a.b.b;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
try { // :try_start_3
	 v1 = e.c.a.b.d;
	 v1 = 	 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
	 int v2 = 3; // const/4 v2, 0x3
	 /* aput v2, v0, v1 */
	 /* :try_end_3 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_3 */
	 /* :catch_3 */
} // .end method
/* # virtual methods */
public void a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 5 */
	 v0 = this.d;
	 /* if-nez v0, :cond_0 */
	 /* .line 6 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 this.d = v0;
	 /* .line 7 */
} // :cond_0
v0 = this.d;
return;
} // .end method
public void a ( java.lang.String p0, Object p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
/* .line 4 */
} // :cond_0
v0 = this.c;
/* new-instance v1, Le/c/a/a; */
/* invoke-direct {v1, p1, p2, p3}, Le/c/a/a;-><init>(Ljava/lang/String;Le/c/a/b;Ljava/lang/String;)V */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2 */
v1 = this.a;
v2 = e.c.a.d.c;
/* if-ne v1, v2, :cond_0 */
final String v1 = "> "; // const-string v1, "> "
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
} // :cond_0
v2 = e.c.a.d.d;
/* if-ne v1, v2, :cond_1 */
final String v1 = "+ "; // const-string v1, "+ "
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
} // :cond_1
} // :goto_0
v1 = this.b;
/* if-nez v1, :cond_2 */
final String v1 = "*"; // const-string v1, "*"
} // :cond_2
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 8 */
v2 = } // :goto_1
/* if-nez v2, :cond_3 */
} // :cond_3
/* check-cast v2, Le/c/a/a; */
/* const/16 v3, 0x5b */
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v3 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 10 */
e.c.a.i .a ( );
v4 = this.b;
v4 = (( java.lang.Enum ) v4 ).ordinal ( ); // invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I
/* aget v3, v3, v4 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v3, v4, :cond_6 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq v3, v4, :cond_5 */
int v4 = 4; // const/4 v4, 0x4
/* if-eq v3, v4, :cond_4 */
} // :cond_4
final String v3 = "|="; // const-string v3, "|="
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_5
final String v3 = "~="; // const-string v3, "~="
/* .line 12 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_6
/* const/16 v3, 0x3d */
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_2
/* const/16 v2, 0x5d */
/* .line 14 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 15 */
} // :cond_7
} // :goto_3
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 16 */
v2 = } // :goto_4
/* if-nez v2, :cond_8 */
} // :cond_8
/* check-cast v2, Ljava/lang/String; */
/* const/16 v3, 0x3a */
/* .line 17 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
} // :cond_9
} // :goto_5
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
