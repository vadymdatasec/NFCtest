.class public Le/h/d/a/a/o/a/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lfr/mbs/binary/Octets;

.field public b:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lfr/mbs/binary/Octets;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/o/a/l;->a:Lfr/mbs/binary/Octets;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/l;->b:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public a()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/o/a/l;->a:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public b()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/o/a/l;->b:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public c()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/h/d/a/a/o/a/l;->a()Lfr/mbs/binary/Octets;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    const-string v1, "9000"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
