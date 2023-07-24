.class public final Lk/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:[Lk/l;

.field public static final f:[Lk/l;

.field public static final g:Lk/q;

.field public static final h:Lk/q;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const/16 v0, 0xb

    new-array v1, v0, [Lk/l;

    .line 1
    sget-object v2, Lk/l;->q:Lk/l;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lk/l;->r:Lk/l;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lk/l;->s:Lk/l;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Lk/l;->t:Lk/l;

    const/4 v6, 0x3

    aput-object v2, v1, v6

    sget-object v2, Lk/l;->u:Lk/l;

    const/4 v7, 0x4

    aput-object v2, v1, v7

    sget-object v2, Lk/l;->k:Lk/l;

    const/4 v8, 0x5

    aput-object v2, v1, v8

    sget-object v2, Lk/l;->m:Lk/l;

    const/4 v9, 0x6

    aput-object v2, v1, v9

    sget-object v2, Lk/l;->l:Lk/l;

    const/4 v10, 0x7

    aput-object v2, v1, v10

    sget-object v2, Lk/l;->n:Lk/l;

    const/16 v11, 0x8

    aput-object v2, v1, v11

    sget-object v2, Lk/l;->p:Lk/l;

    const/16 v12, 0x9

    aput-object v2, v1, v12

    sget-object v2, Lk/l;->o:Lk/l;

    const/16 v13, 0xa

    aput-object v2, v1, v13

    sput-object v1, Lk/q;->e:[Lk/l;

    const/16 v1, 0x12

    new-array v1, v1, [Lk/l;

    .line 2
    sget-object v2, Lk/l;->q:Lk/l;

    aput-object v2, v1, v3

    sget-object v2, Lk/l;->r:Lk/l;

    aput-object v2, v1, v4

    sget-object v2, Lk/l;->s:Lk/l;

    aput-object v2, v1, v5

    sget-object v2, Lk/l;->t:Lk/l;

    aput-object v2, v1, v6

    sget-object v2, Lk/l;->u:Lk/l;

    aput-object v2, v1, v7

    sget-object v2, Lk/l;->k:Lk/l;

    aput-object v2, v1, v8

    sget-object v2, Lk/l;->m:Lk/l;

    aput-object v2, v1, v9

    sget-object v2, Lk/l;->l:Lk/l;

    aput-object v2, v1, v10

    sget-object v2, Lk/l;->n:Lk/l;

    aput-object v2, v1, v11

    sget-object v2, Lk/l;->p:Lk/l;

    aput-object v2, v1, v12

    sget-object v2, Lk/l;->o:Lk/l;

    aput-object v2, v1, v13

    sget-object v2, Lk/l;->i:Lk/l;

    aput-object v2, v1, v0

    sget-object v0, Lk/l;->j:Lk/l;

    const/16 v2, 0xc

    aput-object v0, v1, v2

    sget-object v0, Lk/l;->g:Lk/l;

    const/16 v2, 0xd

    aput-object v0, v1, v2

    sget-object v0, Lk/l;->h:Lk/l;

    const/16 v2, 0xe

    aput-object v0, v1, v2

    sget-object v0, Lk/l;->e:Lk/l;

    const/16 v2, 0xf

    aput-object v0, v1, v2

    sget-object v0, Lk/l;->f:Lk/l;

    const/16 v2, 0x10

    aput-object v0, v1, v2

    sget-object v0, Lk/l;->d:Lk/l;

    const/16 v2, 0x11

    aput-object v0, v1, v2

    sput-object v1, Lk/q;->f:[Lk/l;

    .line 3
    new-instance v0, Lk/p;

    invoke-direct {v0, v4}, Lk/p;-><init>(Z)V

    sget-object v1, Lk/q;->e:[Lk/l;

    .line 4
    invoke-virtual {v0, v1}, Lk/p;->a([Lk/l;)Lk/p;

    new-array v1, v5, [Lk/d1;

    sget-object v2, Lk/d1;->c:Lk/d1;

    aput-object v2, v1, v3

    sget-object v2, Lk/d1;->d:Lk/d1;

    aput-object v2, v1, v4

    .line 5
    invoke-virtual {v0, v1}, Lk/p;->a([Lk/d1;)Lk/p;

    .line 6
    invoke-virtual {v0, v4}, Lk/p;->a(Z)Lk/p;

    .line 7
    invoke-virtual {v0}, Lk/p;->a()Lk/q;

    .line 8
    new-instance v0, Lk/p;

    invoke-direct {v0, v4}, Lk/p;-><init>(Z)V

    sget-object v1, Lk/q;->f:[Lk/l;

    .line 9
    invoke-virtual {v0, v1}, Lk/p;->a([Lk/l;)Lk/p;

    new-array v1, v7, [Lk/d1;

    sget-object v2, Lk/d1;->c:Lk/d1;

    aput-object v2, v1, v3

    sget-object v2, Lk/d1;->d:Lk/d1;

    aput-object v2, v1, v4

    sget-object v2, Lk/d1;->e:Lk/d1;

    aput-object v2, v1, v5

    sget-object v2, Lk/d1;->f:Lk/d1;

    aput-object v2, v1, v6

    .line 10
    invoke-virtual {v0, v1}, Lk/p;->a([Lk/d1;)Lk/p;

    .line 11
    invoke-virtual {v0, v4}, Lk/p;->a(Z)Lk/p;

    .line 12
    invoke-virtual {v0}, Lk/p;->a()Lk/q;

    move-result-object v0

    sput-object v0, Lk/q;->g:Lk/q;

    .line 13
    new-instance v0, Lk/p;

    invoke-direct {v0, v4}, Lk/p;-><init>(Z)V

    sget-object v1, Lk/q;->f:[Lk/l;

    .line 14
    invoke-virtual {v0, v1}, Lk/p;->a([Lk/l;)Lk/p;

    new-array v1, v4, [Lk/d1;

    sget-object v2, Lk/d1;->f:Lk/d1;

    aput-object v2, v1, v3

    .line 15
    invoke-virtual {v0, v1}, Lk/p;->a([Lk/d1;)Lk/p;

    .line 16
    invoke-virtual {v0, v4}, Lk/p;->a(Z)Lk/p;

    .line 17
    invoke-virtual {v0}, Lk/p;->a()Lk/q;

    .line 18
    new-instance v0, Lk/p;

    invoke-direct {v0, v3}, Lk/p;-><init>(Z)V

    invoke-virtual {v0}, Lk/p;->a()Lk/q;

    move-result-object v0

    sput-object v0, Lk/q;->h:Lk/q;

    return-void
.end method

.method public constructor <init>(Lk/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-boolean v0, p1, Lk/p;->a:Z

    iput-boolean v0, p0, Lk/q;->a:Z

    .line 3
    iget-object v0, p1, Lk/p;->b:[Ljava/lang/String;

    iput-object v0, p0, Lk/q;->c:[Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lk/p;->c:[Ljava/lang/String;

    iput-object v0, p0, Lk/q;->d:[Ljava/lang/String;

    .line 5
    iget-boolean p1, p1, Lk/p;->d:Z

    iput-boolean p1, p0, Lk/q;->b:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk/l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/q;->c:[Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lk/l;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public a(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 1

    .line 2
    invoke-virtual {p0, p1, p2}, Lk/q;->b(Ljavax/net/ssl/SSLSocket;Z)Lk/q;

    move-result-object p2

    .line 3
    iget-object v0, p2, Lk/q;->d:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object p2, p2, Lk/q;->c:[Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    .line 7
    iget-boolean v0, p0, Lk/q;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lk/q;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v2, Lk/e1/e;->o:Ljava/util/Comparator;

    .line 9
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-static {v2, v0, v3}, Lk/e1/e;->b(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 11
    :cond_1
    iget-object v0, p0, Lk/q;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v2, Lk/l;->b:Ljava/util/Comparator;

    .line 12
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {v2, v0, p1}, Lk/e1/e;->b(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;Z)Lk/q;
    .locals 4

    .line 2
    iget-object v0, p0, Lk/q;->c:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lk/l;->b:Ljava/util/Comparator;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lk/q;->c:[Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lk/e1/e;->a(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    .line 5
    :goto_0
    iget-object v1, p0, Lk/q;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 6
    sget-object v1, Lk/e1/e;->o:Ljava/util/Comparator;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lk/q;->d:[Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lk/e1/e;->a(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    .line 8
    :goto_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object p1

    .line 9
    sget-object v2, Lk/l;->b:Ljava/util/Comparator;

    const-string v3, "TLS_FALLBACK_SCSV"

    invoke-static {v2, p1, v3}, Lk/e1/e;->a(Ljava/util/Comparator;[Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-eqz p2, :cond_2

    const/4 p2, -0x1

    if-eq v2, p2, :cond_2

    .line 10
    aget-object p1, p1, v2

    invoke-static {v0, p1}, Lk/e1/e;->a([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 11
    :cond_2
    new-instance p1, Lk/p;

    invoke-direct {p1, p0}, Lk/p;-><init>(Lk/q;)V

    .line 12
    invoke-virtual {p1, v0}, Lk/p;->a([Ljava/lang/String;)Lk/p;

    .line 13
    invoke-virtual {p1, v1}, Lk/p;->b([Ljava/lang/String;)Lk/p;

    .line 14
    invoke-virtual {p1}, Lk/p;->a()Lk/q;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk/q;->a:Z

    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk/q;->b:Z

    return v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk/d1;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/q;->d:[Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lk/d1;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lk/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    .line 2
    :cond_1
    check-cast p1, Lk/q;

    .line 3
    iget-boolean v2, p0, Lk/q;->a:Z

    iget-boolean v3, p1, Lk/q;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    .line 4
    iget-object v2, p0, Lk/q;->c:[Ljava/lang/String;

    iget-object v3, p1, Lk/q;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    .line 5
    :cond_3
    iget-object v2, p0, Lk/q;->d:[Ljava/lang/String;

    iget-object v3, p1, Lk/q;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 6
    :cond_4
    iget-boolean v2, p0, Lk/q;->b:Z

    iget-boolean p1, p1, Lk/q;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk/q;->a:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x20f

    .line 2
    iget-object v1, p0, Lk/q;->c:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-object v1, p0, Lk/q;->d:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget-boolean v1, p0, Lk/q;->b:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/16 v0, 0x11

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lk/q;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lk/q;->c:[Ljava/lang/String;

    const-string v1, "[all enabled]"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lk/q;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 3
    :goto_0
    iget-object v2, p0, Lk/q;->d:[Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lk/q;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ConnectionSpec(cipherSuites="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tlsVersions="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", supportsTlsExtensions="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lk/q;->b:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
