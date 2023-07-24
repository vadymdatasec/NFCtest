.class public final Le/f/c/l/e/s/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Flushable;


# instance fields
.field public final b:[B

.field public final c:I

.field public d:I

.field public final e:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/s/e;->e:Ljava/io/OutputStream;

    .line 3
    iput-object p2, p0, Le/f/c/l/e/s/e;->b:[B

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Le/f/c/l/e/s/e;->d:I

    .line 5
    array-length p1, p2

    iput p1, p0, Le/f/c/l/e/s/e;->c:I

    return-void
.end method

.method public static a(Ljava/io/OutputStream;)Le/f/c/l/e/s/e;
    .locals 1

    const/16 v0, 0x1000

    .line 1
    invoke-static {p0, v0}, Le/f/c/l/e/s/e;->a(Ljava/io/OutputStream;I)Le/f/c/l/e/s/e;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/io/OutputStream;I)Le/f/c/l/e/s/e;
    .locals 1

    .line 2
    new-instance v0, Le/f/c/l/e/s/e;

    new-array p1, p1, [B

    invoke-direct {v0, p0, p1}, Le/f/c/l/e/s/e;-><init>(Ljava/io/OutputStream;[B)V

    return-object v0
.end method

.method public static b(F)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static b(IF)I
    .locals 0

    .line 5
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1}, Le/f/c/l/e/s/e;->b(F)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(IJ)I
    .locals 0

    .line 6
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1, p2}, Le/f/c/l/e/s/e;->f(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(ILe/f/c/l/e/s/a;)I
    .locals 0

    .line 8
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1}, Le/f/c/l/e/s/e;->c(Le/f/c/l/e/s/a;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(IZ)I
    .locals 0

    .line 7
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1}, Le/f/c/l/e/s/e;->b(Z)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(Z)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static c(Le/f/c/l/e/s/a;)I
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/s/a;->b()I

    move-result v0

    invoke-static {v0}, Le/f/c/l/e/s/e;->j(I)I

    move-result v0

    invoke-virtual {p0}, Le/f/c/l/e/s/a;->b()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static d(J)I
    .locals 5

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr p0, v0

    cmp-long v0, p0, v2

    if-nez v0, :cond_8

    const/16 p0, 0x9

    return p0

    :cond_8
    const/16 p0, 0xa

    return p0
.end method

.method public static e(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1}, Le/f/c/l/e/s/e;->h(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static f(II)I
    .locals 0

    .line 2
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1}, Le/f/c/l/e/s/e;->k(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static f(J)I
    .locals 0

    .line 3
    invoke-static {p0, p1}, Le/f/c/l/e/s/e;->d(J)I

    move-result p0

    return p0
.end method

.method public static g(II)I
    .locals 0

    .line 2
    invoke-static {p0}, Le/f/c/l/e/s/e;->l(I)I

    move-result p0

    invoke-static {p1}, Le/f/c/l/e/s/e;->m(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static h(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Le/f/c/l/e/s/e;->i(I)I

    move-result p0

    return p0
.end method

.method public static i(I)I
    .locals 0

    if-ltz p0, :cond_0

    .line 1
    invoke-static {p0}, Le/f/c/l/e/s/e;->j(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static j(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static k(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Le/f/c/l/e/s/e;->n(I)I

    move-result p0

    invoke-static {p0}, Le/f/c/l/e/s/e;->j(I)I

    move-result p0

    return p0
.end method

.method public static l(I)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Le/f/c/l/e/s/g;->a(II)I

    move-result p0

    invoke-static {p0}, Le/f/c/l/e/s/e;->j(I)I

    move-result p0

    return p0
.end method

.method public static m(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Le/f/c/l/e/s/e;->j(I)I

    move-result p0

    return p0
.end method

.method public static n(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public a(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18
    iget v0, p0, Le/f/c/l/e/s/e;->d:I

    iget v1, p0, Le/f/c/l/e/s/e;->c:I

    if-ne v0, v1, :cond_0

    .line 19
    invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V

    .line 20
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/s/e;->b:[B

    iget v1, p0, Le/f/c/l/e/s/e;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Le/f/c/l/e/s/e;->d:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public a(F)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->d(I)V

    return-void
.end method

.method public a(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->b(I)V

    return-void
.end method

.method public a(IF)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 3
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 4
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(F)V

    return-void
.end method

.method public a(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 12
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(I)V

    return-void
.end method

.method public a(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 6
    invoke-virtual {p0, p2, p3}, Le/f/c/l/e/s/e;->c(J)V

    return-void
.end method

.method public a(ILe/f/c/l/e/s/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 9
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 10
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(Le/f/c/l/e/s/a;)V

    return-void
.end method

.method public a(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 8
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(Z)V

    return-void
.end method

.method public a(Le/f/c/l/e/s/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15
    invoke-virtual {p1}, Le/f/c/l/e/s/a;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->e(I)V

    .line 16
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->b(Le/f/c/l/e/s/a;)V

    return-void
.end method

.method public a(Le/f/c/l/e/s/a;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 32
    iget v0, p0, Le/f/c/l/e/s/e;->c:I

    iget v1, p0, Le/f/c/l/e/s/e;->d:I

    sub-int v2, v0, v1

    if-lt v2, p3, :cond_0

    .line 33
    iget-object v0, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-virtual {p1, v0, p2, v1, p3}, Le/f/c/l/e/s/a;->a([BIII)V

    .line 34
    iget p1, p0, Le/f/c/l/e/s/e;->d:I

    add-int/2addr p1, p3

    iput p1, p0, Le/f/c/l/e/s/e;->d:I

    goto :goto_1

    :cond_0
    sub-int/2addr v0, v1

    .line 35
    iget-object v2, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-virtual {p1, v2, p2, v1, v0}, Le/f/c/l/e/s/a;->a([BIII)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    .line 36
    iget v0, p0, Le/f/c/l/e/s/e;->c:I

    iput v0, p0, Le/f/c/l/e/s/e;->d:I

    .line 37
    invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V

    .line 38
    iget v0, p0, Le/f/c/l/e/s/e;->c:I

    const/4 v1, 0x0

    if-gt p3, v0, :cond_1

    .line 39
    iget-object v0, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-virtual {p1, v0, p2, v1, p3}, Le/f/c/l/e/s/a;->a([BIII)V

    .line 40
    iput p3, p0, Le/f/c/l/e/s/e;->d:I

    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p1}, Le/f/c/l/e/s/a;->a()Ljava/io/InputStream;

    move-result-object p1

    int-to-long v2, p2

    .line 42
    invoke-virtual {p1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v4

    cmp-long p2, v2, v4

    if-nez p2, :cond_4

    :goto_0
    if-lez p3, :cond_3

    .line 43
    iget p2, p0, Le/f/c/l/e/s/e;->c:I

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 44
    iget-object v0, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-ne v0, p2, :cond_2

    .line 45
    iget-object p2, p0, Le/f/c/l/e/s/e;->e:Ljava/io/OutputStream;

    iget-object v2, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-virtual {p2, v2, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    sub-int/2addr p3, v0

    goto :goto_0

    .line 46
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Read failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-void

    .line 47
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Skip failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->c(I)V

    return-void
.end method

.method public a([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/s/e;->a([BII)V

    return-void
.end method

.method public a([BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22
    iget v0, p0, Le/f/c/l/e/s/e;->c:I

    iget v1, p0, Le/f/c/l/e/s/e;->d:I

    sub-int v2, v0, v1

    if-lt v2, p3, :cond_0

    .line 23
    iget-object v0, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    iget p1, p0, Le/f/c/l/e/s/e;->d:I

    add-int/2addr p1, p3

    iput p1, p0, Le/f/c/l/e/s/e;->d:I

    goto :goto_0

    :cond_0
    sub-int/2addr v0, v1

    .line 25
    iget-object v2, p0, Le/f/c/l/e/s/e;->b:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    .line 26
    iget v0, p0, Le/f/c/l/e/s/e;->c:I

    iput v0, p0, Le/f/c/l/e/s/e;->d:I

    .line 27
    invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V

    .line 28
    iget v0, p0, Le/f/c/l/e/s/e;->c:I

    if-gt p3, v0, :cond_1

    .line 29
    iget-object v0, p0, Le/f/c/l/e/s/e;->b:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    iput p3, p0, Le/f/c/l/e/s/e;->d:I

    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/s/e;->e:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    .line 4
    invoke-virtual {p0, v0, v1}, Le/f/c/l/e/s/e;->b(J)V

    :goto_0
    return-void
.end method

.method public b(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 2
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->f(I)V

    return-void
.end method

.method public b(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    long-to-int p2, p1

    .line 10
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->c(I)V

    return-void

    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    .line 11
    invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public b(Le/f/c/l/e/s/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/s/a;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/s/e;->a(Le/f/c/l/e/s/a;II)V

    return-void
.end method

.method public final c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/f/c/l/e/s/e;->e:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Le/f/c/l/e/s/e;->b:[B

    iget v2, p0, Le/f/c/l/e/s/e;->d:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 5
    iput v3, p0, Le/f/c/l/e/s/e;->d:I

    return-void

    .line 6
    :cond_0
    new-instance v0, Le/f/c/l/e/s/d;

    invoke-direct {v0}, Le/f/c/l/e/s/d;-><init>()V

    throw v0
.end method

.method public c(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte p1, p1

    .line 7
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->a(B)V

    return-void
.end method

.method public c(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    invoke-static {p1, p2}, Le/f/c/l/e/s/g;->a(II)I

    move-result p1

    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V

    return-void
.end method

.method public c(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/s/e;->b(J)V

    return-void
.end method

.method public d(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit16 v0, p1, 0xff

    .line 3
    invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 4
    invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 5
    invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    .line 6
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->c(I)V

    return-void
.end method

.method public d(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V

    .line 2
    invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->g(I)V

    return-void
.end method

.method public e(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->c(I)V

    return-void

    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    .line 3
    invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public f(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/c/l/e/s/e;->n(I)I

    move-result p1

    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V

    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/s/e;->e:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V

    :cond_0
    return-void
.end method

.method public g(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V

    return-void
.end method
