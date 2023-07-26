public class e.h.d.a.a.o.a.p implements e.h.d.a.a.o.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet i;
	 public final fr.mbs.binary.Octets j;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.p ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.i = p1;
		 /* .line 3 */
		 this.j = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.h.d.a.a.o.a.l a ( android.content.Context p0, Object p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 /* new-instance p1, Le/h/d/a/a/o/a/l; */
	 (( e.h.d.a.a.o.a.p ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/o/a/p;->c()Lfr/mbs/binary/Octets;
	 /* invoke-direct {p1, p2}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;)V */
} // .end method
public e.h.d.a.a.o.a.m a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = e.h.d.a.a.o.a.m.c;
} // .end method
public final fr.mbs.binary.Octets b ( ) {
	 /* .locals 1 */
	 /* const/16 v0, 0x10 */
	 /* .line 1 */
	 fr.mbs.binary.Octets .random ( v0 );
} // .end method
public final fr.mbs.binary.Octets c ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/h/a/a; */
	 /* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
	 v0 = this.j;
	 v1 = this.j;
	 v1 = 	 (( fr.mbs.binary.Octets ) v1 ).size ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I
	 (( fr.mbs.binary.Octets ) v0 ).pop ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
	 /* .line 2 */
	 v0 = this.j;
	 (( e.h.d.a.a.o.a.p ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/o/a/p;->b()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 /* .line 3 */
	 fr.mbs.binary.Octets .empty ( );
	 v1 = this.i;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 v1 = this.j;
	 (( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 v1 = e.h.d.a.a.o.a.b.a;
	 (( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 /* :try_end_0 */
	 /* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/a; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 4 */
	 /* new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a; */
	 v2 = e.h.d.a.a.o.a.b.d;
	 final String v3 = "No wallet available for select"; // const-string v3, "No wallet available for select"
	 /* invoke-direct {v1, v3, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
	 /* throw v1 */
} // .end method
