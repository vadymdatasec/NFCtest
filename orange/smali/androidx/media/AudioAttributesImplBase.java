public class androidx.media.AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 /* # direct methods */
	 public androidx.media.AudioAttributesImplBase ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
		 /* .line 3 */
		 /* iput v0, p0, Landroidx/media/AudioAttributesImplBase;->b:I */
		 /* .line 4 */
		 /* iput v0, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 5 */
		 /* iput v0, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->b:I */
	 } // .end method
	 public Integer b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
		 /* .line 2 */
		 v1 = 		 (( androidx.media.AudioAttributesImplBase ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/media/AudioAttributesImplBase;->c()I
		 int v2 = 6; // const/4 v2, 0x6
		 /* if-ne v1, v2, :cond_0 */
		 /* or-int/lit8 v0, v0, 0x4 */
	 } // :cond_0
	 int v2 = 7; // const/4 v2, 0x7
	 /* if-ne v1, v2, :cond_1 */
	 /* or-int/lit8 v0, v0, 0x1 */
} // :cond_1
} // :goto_0
/* and-int/lit16 v0, v0, 0x111 */
} // .end method
public Integer c ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
/* iget v2, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
v0 = androidx.media.AudioAttributesCompat .a ( v0,v1,v2 );
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/media/AudioAttributesImplBase; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* check-cast p1, Landroidx/media/AudioAttributesImplBase; */
/* .line 3 */
/* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->b:I */
v2 = (( androidx.media.AudioAttributesImplBase ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/media/AudioAttributesImplBase;->a()I
/* if-ne v0, v2, :cond_1 */
/* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
/* .line 4 */
v2 = (( androidx.media.AudioAttributesImplBase ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/media/AudioAttributesImplBase;->b()I
/* if-ne v0, v2, :cond_1 */
/* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
/* .line 5 */
v2 = (( androidx.media.AudioAttributesImplBase ) p1 ).d ( ); // invoke-virtual {p1}, Landroidx/media/AudioAttributesImplBase;->d()I
/* if-ne v0, v2, :cond_1 */
/* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
/* iget p1, p1, Landroidx/media/AudioAttributesImplBase;->d:I */
/* if-ne v0, p1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->b:I */
java.lang.Integer .valueOf ( v1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
java.lang.Integer .valueOf ( v1 );
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
java.lang.Integer .valueOf ( v1 );
int v2 = 2; // const/4 v2, 0x2
/* aput-object v1, v0, v2 */
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
java.lang.Integer .valueOf ( v1 );
int v2 = 3; // const/4 v2, 0x3
/* aput-object v1, v0, v2 */
v0 = java.util.Arrays .hashCode ( v0 );
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "AudioAttributesCompat:"; // const-string v1, "AudioAttributesCompat:"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 2 */
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
final String v1 = " stream="; // const-string v1, " stream="
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " derived"; // const-string v1, " derived"
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
final String v1 = " usage="; // const-string v1, " usage="
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
/* .line 6 */
androidx.media.AudioAttributesCompat .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " content="; // const-string v1, " content="
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->b:I */
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " flags=0x"; // const-string v1, " flags=0x"
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
/* .line 10 */
java.lang.Integer .toHexString ( v1 );
(( java.lang.String ) v1 ).toUpperCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
