public class e.h.d.a.a.o.a.l {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public fr.mbs.binary.Octets a;
	 public fr.mbs.binary.Octets b;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.l ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* invoke-direct {p0, p1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
		 return;
	 } // .end method
	 public e.h.d.a.a.o.a.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public fr.mbs.binary.Octets a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public fr.mbs.binary.Octets b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public Boolean c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( e.h.d.a.a.o.a.l ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/o/a/l;->a()Lfr/mbs/binary/Octets;
		 int v1 = 2; // const/4 v1, 0x2
		 (( fr.mbs.binary.Octets ) v0 ).getLast ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;
		 final String v1 = "9000"; // const-string v1, "9000"
		 fr.mbs.binary.Octets .createOctets ( v1 );
		 v0 = 		 (( fr.mbs.binary.Octets ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
	 } // .end method
