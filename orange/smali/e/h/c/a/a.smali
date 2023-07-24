.class public Le/h/c/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lg/a/a/a;

.field public final c:Lg/a/a/a;

.field public final d:Lg/a/a/a;

.field public final e:Lg/a/a/a;

.field public final f:Lfr/mbs/binary/Octets;

.field public final g:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(ZLg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lfr/mbs/binary/Octets;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1, p6}, Le/h/c/a/a;->a(ZLfr/mbs/binary/Octets;)V

    .line 3
    iput-boolean p1, p0, Le/h/c/a/a;->a:Z

    .line 4
    iput-object p2, p0, Le/h/c/a/a;->b:Lg/a/a/a;

    .line 5
    iput-object p3, p0, Le/h/c/a/a;->c:Lg/a/a/a;

    .line 6
    iput-object p4, p0, Le/h/c/a/a;->d:Lg/a/a/a;

    .line 7
    iput-object p5, p0, Le/h/c/a/a;->e:Lg/a/a/a;

    .line 8
    iput-object p6, p0, Le/h/c/a/a;->f:Lfr/mbs/binary/Octets;

    .line 9
    iput-object p7, p0, Le/h/c/a/a;->g:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Lfr/mbs/binary/Octets;)Le/h/c/a/a;
    .locals 3

    const/4 v0, 0x4

    .line 3
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lg/a/a/a;->a()B

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x5

    if-eqz v1, :cond_1

    const/4 v0, 0x2

    .line 4
    invoke-virtual {p0, v2, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toInt()I

    move-result v0

    const/4 v2, 0x7

    .line 5
    invoke-virtual {p0, v2, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v2

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lg/a/a/a;->b()S

    move-result v0

    .line 7
    invoke-virtual {p0, v2, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v2

    .line 8
    :goto_1
    invoke-static {v1, p0, v0, v2}, Le/h/c/a/a;->a(ZLfr/mbs/binary/Octets;ILfr/mbs/binary/Octets;)Le/h/c/a/a;

    move-result-object p0

    return-object p0
.end method

.method public static a(ZLfr/mbs/binary/Octets;ILfr/mbs/binary/Octets;)Le/h/c/a/a;
    .locals 8

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    const/4 v1, 0x3

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    add-int/lit8 v1, v1, 0x4

    add-int/2addr v1, p2

    .line 9
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p2

    if-eq p2, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 10
    invoke-static {p0, p1, v1, v0}, Le/h/c/a/a;->a(ZLfr/mbs/binary/Octets;IZ)V

    :cond_2
    if-nez v0, :cond_3

    const/4 p2, 0x0

    goto :goto_2

    .line 11
    :cond_3
    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toInt()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_2
    move-object v7, p2

    .line 12
    new-instance p2, Le/h/c/a/a;

    invoke-static {p1}, Le/h/c/a/a;->c(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v2

    invoke-static {p1}, Le/h/c/a/a;->f(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v3

    invoke-static {p1}, Le/h/c/a/a;->g(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v4

    invoke-static {p1}, Le/h/c/a/a;->h(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v5

    move-object v0, p2

    move v1, p0

    move-object v6, p3

    invoke-direct/range {v0 .. v7}, Le/h/c/a/a;-><init>(ZLg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lfr/mbs/binary/Octets;Ljava/lang/Integer;)V

    return-object p2
.end method

.method public static a(ZLfr/mbs/binary/Octets;)V
    .locals 1

    if-eqz p1, :cond_2

    if-eqz p0, :cond_0

    const p0, 0xffff

    goto :goto_0

    :cond_0
    const/16 p0, 0xff

    .line 1
    :goto_0
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    if-gt v0, p0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    new-instance v0, Lcom/orange/nfc/apdu/TooBigApduDataException;

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lcom/orange/nfc/apdu/TooBigApduDataException;-><init>(II)V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method public static a(ZLfr/mbs/binary/Octets;IZ)V
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    .line 13
    :goto_0
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p3

    add-int/2addr p2, p0

    if-ne p3, p2, :cond_1

    return-void

    .line 14
    :cond_1
    new-instance p0, Lcom/orange/nfc/apdu/InvalidApduFormatException;

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/orange/nfc/apdu/InvalidApduFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lfr/mbs/binary/Octets;)Le/h/c/a/a;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    new-instance v0, Le/h/c/a/a;

    invoke-static {p0}, Le/h/c/a/a;->c(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v3

    invoke-static {p0}, Le/h/c/a/a;->f(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v4

    invoke-static {p0}, Le/h/c/a/a;->g(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v5

    invoke-static {p0}, Le/h/c/a/a;->h(Lfr/mbs/binary/Octets;)Lg/a/a/a;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    const/4 v8, 0x4

    if-ne v1, v8, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v8}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toInt()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_1
    move-object v8, p0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Le/h/c/a/a;-><init>(ZLg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lfr/mbs/binary/Octets;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static c(Lfr/mbs/binary/Octets;)Lg/a/a/a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lfr/mbs/binary/Octets;)Le/h/c/a/a;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Le/h/c/a/a;->e(Lfr/mbs/binary/Octets;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Le/h/c/a/a;->b(Lfr/mbs/binary/Octets;)Le/h/c/a/a;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Le/h/c/a/a;->a(Lfr/mbs/binary/Octets;)Le/h/c/a/a;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 4
    :catch_0
    new-instance v0, Lcom/orange/nfc/apdu/InvalidApduFormatException;

    const-string v1, ""

    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/orange/nfc/apdu/InvalidApduFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Lfr/mbs/binary/Octets;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v4

    const/4 v5, 0x5

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 3
    :goto_1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v5

    const/4 v6, 0x7

    if-ne v5, v6, :cond_2

    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object p0

    invoke-virtual {p0}, Lg/a/a/a;->a()B

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    :goto_2
    if-nez v4, :cond_4

    if-nez v0, :cond_4

    if-eqz p0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_3
    return v2
.end method

.method public static f(Lfr/mbs/binary/Octets;)Lg/a/a/a;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lfr/mbs/binary/Octets;)Lg/a/a/a;
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lfr/mbs/binary/Octets;)Lg/a/a/a;
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lg/a/a/a;
    .locals 1

    .line 15
    iget-object v0, p0, Le/h/c/a/a;->b:Lg/a/a/a;

    return-object v0
.end method

.method public b()Lfr/mbs/binary/Octets;
    .locals 1

    .line 3
    iget-object v0, p0, Le/h/c/a/a;->f:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public c()Lfr/mbs/binary/Octets;
    .locals 3

    .line 2
    invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    iget-boolean v0, p0, Le/h/c/a/a;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "00"

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public d()Lfr/mbs/binary/Octets;
    .locals 3

    .line 5
    iget-object v0, p0, Le/h/c/a/a;->g:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 6
    :cond_0
    iget-boolean v1, p0, Le/h/c/a/a;->a:Z

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "00"

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v0

    :goto_0
    const/4 v1, 0x2

    iget-object v2, p0, Le/h/c/a/a;->g:Ljava/lang/Integer;

    invoke-static {v1, v2}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v1, 0x1

    .line 8
    invoke-static {v1, v0}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public e()Lfr/mbs/binary/Octets;
    .locals 2

    .line 4
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->a()Lg/a/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->f()Lg/a/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->h()Lg/a/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->i()Lg/a/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/h/c/a/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;

    move-result-object v0

    check-cast p1, Le/h/c/a/a;

    invoke-virtual {p1}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Lg/a/a/a;
    .locals 1

    .line 2
    iget-object v0, p0, Le/h/c/a/a;->c:Lg/a/a/a;

    return-object v0
.end method

.method public g()Lg/a/a/a;
    .locals 2

    .line 2
    invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->getFirst()Lg/a/a/a;

    move-result-object v0

    return-object v0

    .line 5
    :cond_1
    new-instance v0, Lcom/orange/nfc/apdu/ExtendedLcException;

    invoke-direct {v0}, Lcom/orange/nfc/apdu/ExtendedLcException;-><init>()V

    throw v0
.end method

.method public h()Lg/a/a/a;
    .locals 1

    .line 2
    iget-object v0, p0, Le/h/c/a/a;->d:Lg/a/a/a;

    return-object v0
.end method

.method public i()Lg/a/a/a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/c/a/a;->e:Lg/a/a/a;

    return-object v0
.end method

.method public j()Lfr/mbs/binary/Octets;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/h/c/a/a;->e()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0}, Le/h/c/a/a;->d()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
