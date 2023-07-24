.class public abstract enum Le/h/d/a/a/o/a/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/d/a/a/o/a/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/h/d/a/a/o/a/j;

.field public static final enum d:Le/h/d/a/a/o/a/j;

.field public static final enum e:Le/h/d/a/a/o/a/j;

.field public static final enum f:Le/h/d/a/a/o/a/j;

.field public static final enum g:Le/h/d/a/a/o/a/j;

.field public static final synthetic h:[Le/h/d/a/a/o/a/j;


# instance fields
.field public final b:Lfr/mbs/binary/Octets;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Le/h/d/a/a/o/a/d;

    const-string v1, "80B08000"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "READ_BADGE"

    invoke-direct {v0, v3, v2, v1}, Le/h/d/a/a/o/a/d;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    sput-object v0, Le/h/d/a/a/o/a/j;->c:Le/h/d/a/a/o/a/j;

    .line 2
    new-instance v0, Le/h/d/a/a/o/a/e;

    const-string v1, "00A40400"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v3, 0x1

    const-string v4, "SELECT"

    invoke-direct {v0, v4, v3, v1}, Le/h/d/a/a/o/a/e;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    sput-object v0, Le/h/d/a/a/o/a/j;->d:Le/h/d/a/a/o/a/j;

    .line 3
    new-instance v0, Le/h/d/a/a/o/a/f;

    const-string v1, "80B09000"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v4, 0x2

    const-string v5, "READ_TOKEN"

    invoke-direct {v0, v5, v4, v1}, Le/h/d/a/a/o/a/f;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    sput-object v0, Le/h/d/a/a/o/a/j;->e:Le/h/d/a/a/o/a/j;

    .line 4
    new-instance v0, Le/h/d/a/a/o/a/g;

    const-string v1, "80D69000"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v5, 0x3

    const-string v6, "WRITE_TOKEN"

    invoke-direct {v0, v6, v5, v1}, Le/h/d/a/a/o/a/g;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    sput-object v0, Le/h/d/a/a/o/a/j;->f:Le/h/d/a/a/o/a/j;

    .line 5
    new-instance v0, Le/h/d/a/a/o/a/h;

    const-string v1, "80D69100"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v6, 0x4

    const-string v7, "DELAYED_WRITE_TOKEN"

    invoke-direct {v0, v7, v6, v1}, Le/h/d/a/a/o/a/h;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    sput-object v0, Le/h/d/a/a/o/a/j;->g:Le/h/d/a/a/o/a/j;

    .line 6
    new-instance v0, Le/h/d/a/a/o/a/i;

    const-string v1, "80D80000"

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v7, 0x5

    const-string v8, "TRANSACTION_DONE"

    invoke-direct {v0, v8, v7, v1}, Le/h/d/a/a/o/a/i;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    const/4 v1, 0x6

    new-array v1, v1, [Le/h/d/a/a/o/a/j;

    .line 7
    sget-object v8, Le/h/d/a/a/o/a/j;->c:Le/h/d/a/a/o/a/j;

    aput-object v8, v1, v2

    sget-object v2, Le/h/d/a/a/o/a/j;->d:Le/h/d/a/a/o/a/j;

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/o/a/j;->e:Le/h/d/a/a/o/a/j;

    aput-object v2, v1, v4

    sget-object v2, Le/h/d/a/a/o/a/j;->f:Le/h/d/a/a/o/a/j;

    aput-object v2, v1, v5

    sget-object v2, Le/h/d/a/a/o/a/j;->g:Le/h/d/a/a/o/a/j;

    aput-object v2, v1, v6

    aput-object v0, v1, v7

    sput-object v1, Le/h/d/a/a/o/a/j;->h:[Le/h/d/a/a/o/a/j;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr/mbs/binary/Octets;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Le/h/d/a/a/o/a/j;->b:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILfr/mbs/binary/Octets;Le/h/d/a/a/o/a/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/h/d/a/a/o/a/j;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V

    return-void
.end method

.method public static a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lfr/mbs/binary/Octets;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/o/a/b;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 1
    invoke-static {}, Le/h/d/a/a/o/a/j;->values()[Le/h/d/a/a/o/a/j;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3, p1}, Le/h/d/a/a/o/a/j;->a(Lfr/mbs/binary/Octets;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 3
    invoke-virtual {v3, p0, p2, p3, p4}, Le/h/d/a/a/o/a/j;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/o/a/b;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_1
    new-instance p0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported APDU class, instruction or parameters on APDU "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Le/h/d/a/a/o/a/b;->c:Lfr/mbs/binary/Octets;

    invoke-direct {p0, p1, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/d/a/a/o/a/j;
    .locals 1

    .line 1
    const-class v0, Le/h/d/a/a/o/a/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/o/a/j;

    return-object p0
.end method

.method public static values()[Le/h/d/a/a/o/a/j;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/j;->h:[Le/h/d/a/a/o/a/j;

    invoke-virtual {v0}, [Le/h/d/a/a/o/a/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/d/a/a/o/a/j;

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/o/a/b;
.end method

.method public a(Lfr/mbs/binary/Octets;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 5
    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    iget-object v0, p0, Le/h/d/a/a/o/a/j;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
