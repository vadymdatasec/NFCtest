public class m.b.i.g implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public m.b.i.o b;
	 public java.nio.charset.Charset c;
	 public Boolean d;
	 public Boolean e;
	 public Integer f;
	 public m.b.i.f g;
	 /* # direct methods */
	 public m.b.i.g ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 v0 = m.b.i.o.g;
		 this.b = v0;
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 /* .line 3 */
		 java.nio.charset.Charset .forName ( v0 );
		 this.c = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lm/b/i/g;->d:Z */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 5 */
		 /* iput-boolean v1, p0, Lm/b/i/g;->e:Z */
		 /* .line 6 */
		 /* iput v0, p0, Lm/b/i/g;->f:I */
		 /* .line 7 */
		 v0 = m.b.i.f.b;
		 this.g = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.nio.charset.Charset a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
	 } // .end method
	 public m.b.i.g a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 java.nio.charset.Charset .forName ( p1 );
		 (( m.b.i.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/g;->a(Ljava/nio/charset/Charset;)Lm/b/i/g;
	 } // .end method
	 public m.b.i.g a ( java.nio.charset.Charset p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 this.c = p1;
	 } // .end method
	 public m.b.i.g a ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 this.g = p1;
	 } // .end method
	 public java.nio.charset.CharsetEncoder b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 (( java.nio.charset.Charset ) v0 ).newEncoder ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;
	 } // .end method
	 public java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/CloneNotSupportedException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( m.b.i.g ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/g;->clone()Lm/b/i/g;
} // .end method
public m.b.i.g clone ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 try { // :try_start_0
		 /* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
		 /* check-cast v0, Lm/b/i/g; */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 3 */
		 v1 = this.c;
		 (( java.nio.charset.Charset ) v1 ).name ( ); // invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
		 (( m.b.i.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lm/b/i/g;->a(Ljava/lang/String;)Lm/b/i/g;
		 /* .line 4 */
		 v1 = this.b;
		 (( java.lang.Enum ) v1 ).name ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;
		 m.b.i.o .valueOf ( v1 );
		 this.b = v1;
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 5 */
		 /* new-instance v1, Ljava/lang/RuntimeException; */
		 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public m.b.i.o d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public Integer e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lm/b/i/g;->f:I */
	 } // .end method
	 public Boolean f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lm/b/i/g;->e:Z */
	 } // .end method
	 public Boolean g ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lm/b/i/g;->d:Z */
	 } // .end method
	 public m.b.i.f h ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.g;
	 } // .end method
