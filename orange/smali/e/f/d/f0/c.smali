.class public Le/f/d/f0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final r:[C


# instance fields
.field public final b:Le/f/d/f0/h;

.field public final c:Ljava/io/Reader;

.field public d:Z

.field public final e:[C

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:[Le/f/d/f0/d;

.field public k:I

.field public l:Le/f/d/f0/e;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:I

.field public p:I

.field public q:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, ")]}\'\n"

    .line 1
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Le/f/d/f0/c;->r:[C

    .line 2
    new-instance v0, Le/f/d/f0/a;

    invoke-direct {v0}, Le/f/d/f0/a;-><init>()V

    sput-object v0, Le/f/d/d0/q;->a:Le/f/d/d0/q;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/d/f0/h;

    invoke-direct {v0}, Le/f/d/f0/h;-><init>()V

    iput-object v0, p0, Le/f/d/f0/c;->b:Le/f/d/f0/h;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le/f/d/f0/c;->d:Z

    const/16 v1, 0x400

    new-array v1, v1, [C

    .line 4
    iput-object v1, p0, Le/f/d/f0/c;->e:[C

    .line 5
    iput v0, p0, Le/f/d/f0/c;->f:I

    .line 6
    iput v0, p0, Le/f/d/f0/c;->g:I

    const/4 v1, 0x1

    .line 7
    iput v1, p0, Le/f/d/f0/c;->h:I

    .line 8
    iput v1, p0, Le/f/d/f0/c;->i:I

    const/16 v1, 0x20

    new-array v1, v1, [Le/f/d/f0/d;

    .line 9
    iput-object v1, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    .line 10
    iput v0, p0, Le/f/d/f0/c;->k:I

    .line 11
    sget-object v1, Le/f/d/f0/d;->g:Le/f/d/f0/d;

    invoke-virtual {p0, v1}, Le/f/d/f0/c;->a(Le/f/d/f0/d;)V

    .line 12
    iput-boolean v0, p0, Le/f/d/f0/c;->q:Z

    if-eqz p1, :cond_0

    .line 13
    iput-object p1, p0, Le/f/d/f0/c;->c:Ljava/io/Reader;

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "in == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Le/f/d/f0/c;)Le/f/d/f0/e;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p0
.end method

.method public static synthetic a(Le/f/d/f0/c;Le/f/d/f0/e;)Le/f/d/f0/e;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1
.end method

.method public static synthetic a(Le/f/d/f0/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(Le/f/d/f0/c;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result p0

    return p0
.end method

.method public static synthetic b(Le/f/d/f0/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/d/f0/c;->m:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic c(Le/f/d/f0/c;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result p0

    return p0
.end method

.method public static synthetic d(Le/f/d/f0/c;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/d/f0/c;->m:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->f:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Le/f/d/f0/c;->m:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a name but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public B()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected null but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public C()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    if-eq v0, v1, :cond_1

    sget-object v1, Le/f/d/f0/e;->h:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a string but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return-object v0
.end method

.method public final D()Le/f/d/f0/e;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->d(Z)I

    move-result v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_3

    const/16 v2, 0x27

    if-eq v1, v2, :cond_2

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_1

    const/16 v2, 0x7b

    if-eq v1, v2, :cond_0

    .line 2
    iget v1, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr v1, v0

    iput v1, p0, Le/f/d/f0/c;->f:I

    .line 3
    invoke-virtual {p0}, Le/f/d/f0/c;->H()Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    sget-object v0, Le/f/d/f0/d;->d:Le/f/d/f0/d;

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/d;)V

    .line 5
    sget-object v0, Le/f/d/f0/e;->d:Le/f/d/f0/e;

    iput-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object v0

    .line 6
    :cond_1
    sget-object v0, Le/f/d/f0/d;->b:Le/f/d/f0/d;

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/d;)V

    .line 7
    sget-object v0, Le/f/d/f0/e;->b:Le/f/d/f0/e;

    iput-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object v0

    .line 8
    :cond_2
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    :cond_3
    int-to-char v0, v1

    .line 9
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 10
    sget-object v0, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    iput-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object v0
.end method

.method public final E()Le/f/d/f0/e;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->d(Z)I

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_1

    .line 2
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 3
    iget v1, p0, Le/f/d/f0/c;->f:I

    iget v2, p0, Le/f/d/f0/c;->g:I

    if-lt v1, v2, :cond_0

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Le/f/d/f0/c;->e:[C

    iget v2, p0, Le/f/d/f0/c;->f:I

    aget-char v1, v1, v2

    const/16 v3, 0x3e

    if-ne v1, v3, :cond_2

    add-int/2addr v2, v0

    .line 4
    iput v2, p0, Le/f/d/f0/c;->f:I

    goto :goto_0

    :cond_1
    const-string v0, "Expected \':\'"

    .line 5
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v0, 0x0

    throw v0

    .line 6
    :cond_2
    :goto_0
    iget-object v1, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    iget v2, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr v2, v0

    sget-object v0, Le/f/d/f0/d;->f:Le/f/d/f0/d;

    aput-object v0, v1, v2

    .line 7
    invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;

    move-result-object v0

    return-object v0
.end method

.method public F()Le/f/d/f0/e;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    sget-object v0, Le/f/d/f0/b;->a:[I

    iget-object v1, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    iget v2, p0, Le/f/d/f0/c;->k:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 4
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :pswitch_1
    invoke-virtual {p0, v1}, Le/f/d/f0/c;->d(Z)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 6
    sget-object v0, Le/f/d/f0/e;->k:Le/f/d/f0/e;

    return-object v0

    .line 7
    :cond_1
    iget v0, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr v0, v3

    iput v0, p0, Le/f/d/f0/c;->f:I

    .line 8
    iget-boolean v0, p0, Le/f/d/f0/c;->d:Z

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "Expected EOF"

    .line 10
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v0, 0x0

    throw v0

    .line 11
    :pswitch_2
    invoke-virtual {p0, v1}, Le/f/d/f0/c;->b(Z)Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    .line 12
    :pswitch_3
    invoke-virtual {p0}, Le/f/d/f0/c;->E()Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    .line 13
    :pswitch_4
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->b(Z)Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    .line 14
    :pswitch_5
    invoke-virtual {p0, v1}, Le/f/d/f0/c;->a(Z)Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    .line 15
    :pswitch_6
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->a(Z)Le/f/d/f0/e;

    move-result-object v0

    return-object v0

    .line 16
    :pswitch_7
    iget-boolean v0, p0, Le/f/d/f0/c;->d:Z

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {p0}, Le/f/d/f0/c;->o()V

    .line 18
    :cond_3
    iget-object v0, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    iget v1, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr v1, v3

    sget-object v2, Le/f/d/f0/d;->h:Le/f/d/f0/d;

    aput-object v2, v0, v1

    .line 19
    invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;

    move-result-object v0

    .line 20
    iget-boolean v1, p0, Le/f/d/f0/c;->d:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v2, Le/f/d/f0/e;->b:Le/f/d/f0/e;

    if-eq v1, v2, :cond_5

    sget-object v2, Le/f/d/f0/e;->d:Le/f/d/f0/e;

    if-ne v1, v2, :cond_4

    goto :goto_0

    .line 21
    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected JSON document to start with \'[\' or \'{\' but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G()C
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f/d/f0/c;->f:I

    iget v1, p0, Le/f/d/f0/c;->g:I

    const/4 v2, 0x0

    const-string v3, "Unterminated escape sequence"

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    throw v2

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->f:I

    add-int/lit8 v4, v1, 0x1

    iput v4, p0, Le/f/d/f0/c;->f:I

    aget-char v0, v0, v1

    const/16 v1, 0x62

    if-eq v0, v1, :cond_d

    const/16 v1, 0x66

    if-eq v0, v1, :cond_c

    const/16 v5, 0x6e

    const/16 v6, 0xa

    if-eq v0, v5, :cond_b

    const/16 v5, 0x72

    if-eq v0, v5, :cond_a

    const/16 v5, 0x74

    if-eq v0, v5, :cond_9

    const/16 v5, 0x75

    if-eq v0, v5, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x4

    add-int/2addr v4, v0

    .line 4
    iget v5, p0, Le/f/d/f0/c;->g:I

    if-le v4, v5, :cond_4

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 5
    :cond_3
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    throw v2

    :cond_4
    :goto_1
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Le/f/d/f0/c;->f:I

    add-int/lit8 v4, v3, 0x4

    :goto_2
    if-ge v3, v4, :cond_8

    .line 7
    iget-object v5, p0, Le/f/d/f0/c;->e:[C

    aget-char v5, v5, v3

    shl-int/lit8 v2, v2, 0x4

    int-to-char v2, v2

    const/16 v7, 0x30

    if-lt v5, v7, :cond_5

    const/16 v7, 0x39

    if-gt v5, v7, :cond_5

    add-int/lit8 v5, v5, -0x30

    :goto_3
    add-int/2addr v2, v5

    int-to-char v2, v2

    goto :goto_5

    :cond_5
    const/16 v7, 0x61

    if-lt v5, v7, :cond_6

    if-gt v5, v1, :cond_6

    add-int/lit8 v5, v5, -0x61

    :goto_4
    add-int/2addr v5, v6

    goto :goto_3

    :cond_6
    const/16 v7, 0x41

    if-lt v5, v7, :cond_7

    const/16 v7, 0x46

    if-gt v5, v7, :cond_7

    add-int/lit8 v5, v5, -0x41

    goto :goto_4

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 8
    :cond_7
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\\u"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/f/d/f0/c;->b:Le/f/d/f0/h;

    iget-object v4, p0, Le/f/d/f0/c;->e:[C

    iget v5, p0, Le/f/d/f0/c;->f:I

    invoke-virtual {v3, v4, v5, v0}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_8
    iget v1, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v1, v0

    iput v1, p0, Le/f/d/f0/c;->f:I

    return v2

    :cond_9
    const/16 v0, 0x9

    return v0

    :cond_a
    const/16 v0, 0xd

    return v0

    :cond_b
    return v6

    :cond_c
    const/16 v0, 0xc

    return v0

    :cond_d
    const/16 v0, 0x8

    return v0
.end method

.method public final H()Le/f/d/f0/e;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 2
    iget v0, p0, Le/f/d/f0/c;->p:I

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Le/f/d/f0/c;->p()Le/f/d/f0/e;

    move-result-object v0

    iput-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    .line 4
    sget-object v1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 5
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 6
    :cond_0
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object v0

    :cond_1
    const-string v0, "Expected literal value"

    .line 7
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v0, 0x0

    throw v0
.end method

.method public final I()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :cond_0
    iget v0, p0, Le/f/d/f0/c;->f:I

    iget v1, p0, Le/f/d/f0/c;->g:I

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :cond_1
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Le/f/d/f0/c;->f:I

    aget-char v0, v0, v1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    :cond_2
    return-void
.end method

.method public J()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/f/d/f0/c;->q:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    move-result-object v2

    .line 3
    sget-object v3, Le/f/d/f0/e;->b:Le/f/d/f0/e;

    if-eq v2, v3, :cond_3

    sget-object v3, Le/f/d/f0/e;->d:Le/f/d/f0/e;

    if-ne v2, v3, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    sget-object v3, Le/f/d/f0/e;->c:Le/f/d/f0/e;

    if-eq v2, v3, :cond_2

    sget-object v3, Le/f/d/f0/e;->e:Le/f/d/f0/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, v3, :cond_4

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, 0x1

    :cond_4
    :goto_1
    if-nez v1, :cond_0

    .line 5
    iput-boolean v0, p0, Le/f/d/f0/c;->q:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Le/f/d/f0/c;->q:Z

    throw v1
.end method

.method public final a(Z)Le/f/d/f0/e;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x5d

    const/16 v1, 0x3b

    const/16 v2, 0x2c

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    .line 13
    iget-object v4, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    iget v5, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr v5, v3

    sget-object v6, Le/f/d/f0/d;->c:Le/f/d/f0/d;

    aput-object v6, v4, v5

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->d(Z)I

    move-result v4

    if-eq v4, v2, :cond_3

    if-eq v4, v1, :cond_2

    if-ne v4, v0, :cond_1

    .line 15
    iget p1, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr p1, v3

    iput p1, p0, Le/f/d/f0/c;->k:I

    .line 16
    sget-object p1, Le/f/d/f0/e;->c:Le/f/d/f0/e;

    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1

    :cond_1
    const-string p1, "Unterminated array"

    .line 17
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1

    .line 18
    :cond_2
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 19
    :cond_3
    :goto_0
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->d(Z)I

    move-result v4

    if-eq v4, v2, :cond_5

    if-eq v4, v1, :cond_5

    if-eq v4, v0, :cond_4

    .line 20
    iget p1, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr p1, v3

    iput p1, p0, Le/f/d/f0/c;->f:I

    .line 21
    invoke-virtual {p0}, Le/f/d/f0/c;->D()Le/f/d/f0/e;

    move-result-object p1

    return-object p1

    :cond_4
    if-eqz p1, :cond_5

    .line 22
    iget p1, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr p1, v3

    iput p1, p0, Le/f/d/f0/c;->k:I

    .line 23
    sget-object p1, Le/f/d/f0/e;->c:Le/f/d/f0/e;

    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1

    .line 24
    :cond_5
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 25
    iget p1, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr p1, v3

    iput p1, p0, Le/f/d/f0/c;->f:I

    const-string p1, "null"

    .line 26
    iput-object p1, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 27
    sget-object p1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1
.end method

.method public final a([CII)Le/f/d/f0/e;
    .locals 7

    .line 66
    aget-char v0, p1, p2

    const/16 v1, 0x2d

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p2, 0x1

    .line 67
    aget-char v2, p1, v0

    move v6, v2

    move v2, v0

    move v0, v6

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    const/16 v3, 0x39

    const/16 v4, 0x30

    if-ne v0, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 68
    aget-char v0, p1, v2

    goto :goto_2

    :cond_1
    const/16 v5, 0x31

    if-lt v0, v5, :cond_a

    if-gt v0, v3, :cond_a

    add-int/lit8 v2, v2, 0x1

    .line 69
    aget-char v0, p1, v2

    :goto_1
    if-lt v0, v4, :cond_2

    if-gt v0, v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    .line 70
    aget-char v0, p1, v2

    goto :goto_1

    :cond_2
    :goto_2
    const/16 v5, 0x2e

    if-ne v0, v5, :cond_3

    add-int/lit8 v2, v2, 0x1

    .line 71
    aget-char v0, p1, v2

    :goto_3
    if-lt v0, v4, :cond_3

    if-gt v0, v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    .line 72
    aget-char v0, p1, v2

    goto :goto_3

    :cond_3
    const/16 v5, 0x65

    if-eq v0, v5, :cond_4

    const/16 v5, 0x45

    if-ne v0, v5, :cond_7

    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 73
    aget-char v0, p1, v2

    const/16 v5, 0x2b

    if-eq v0, v5, :cond_5

    if-ne v0, v1, :cond_6

    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 74
    aget-char v0, p1, v2

    :cond_6
    if-lt v0, v4, :cond_9

    if-gt v0, v3, :cond_9

    add-int/lit8 v2, v2, 0x1

    .line 75
    aget-char v0, p1, v2

    :goto_4
    if-lt v0, v4, :cond_7

    if-gt v0, v3, :cond_7

    add-int/lit8 v2, v2, 0x1

    .line 76
    aget-char v0, p1, v2

    goto :goto_4

    :cond_7
    add-int/2addr p2, p3

    if-ne v2, p2, :cond_8

    .line 77
    sget-object p1, Le/f/d/f0/e;->h:Le/f/d/f0/e;

    return-object p1

    .line 78
    :cond_8
    sget-object p1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    return-object p1

    .line 79
    :cond_9
    sget-object p1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    return-object p1

    .line 80
    :cond_a
    sget-object p1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    return-object p1
.end method

.method public final a(C)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    const/4 v1, 0x0

    move-object v2, v1

    .line 47
    :goto_0
    iget v3, p0, Le/f/d/f0/c;->f:I

    .line 48
    iget v4, p0, Le/f/d/f0/c;->g:I

    :goto_1
    move v5, v4

    move v4, v3

    :goto_2
    const/4 v6, 0x1

    if-ge v3, v5, :cond_5

    add-int/lit8 v7, v3, 0x1

    .line 49
    aget-char v3, v0, v3

    if-ne v3, p1, :cond_2

    .line 50
    iput v7, p0, Le/f/d/f0/c;->f:I

    .line 51
    iget-boolean p1, p0, Le/f/d/f0/c;->q:Z

    if-eqz p1, :cond_0

    const-string p1, "skipped!"

    return-object p1

    :cond_0
    if-nez v2, :cond_1

    .line 52
    iget-object p1, p0, Le/f/d/f0/c;->b:Le/f/d/f0/h;

    sub-int/2addr v7, v4

    sub-int/2addr v7, v6

    invoke-virtual {p1, v0, v4, v7}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    sub-int/2addr v7, v4

    sub-int/2addr v7, v6

    .line 53
    invoke-virtual {v2, v0, v4, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v8, 0x5c

    if-ne v3, v8, :cond_4

    .line 55
    iput v7, p0, Le/f/d/f0/c;->f:I

    if-nez v2, :cond_3

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :cond_3
    sub-int/2addr v7, v4

    sub-int/2addr v7, v6

    .line 57
    invoke-virtual {v2, v0, v4, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {p0}, Le/f/d/f0/c;->G()C

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    iget v3, p0, Le/f/d/f0/c;->f:I

    .line 60
    iget v4, p0, Le/f/d/f0/c;->g:I

    goto :goto_1

    :cond_4
    move v3, v7

    goto :goto_2

    :cond_5
    if-nez v2, :cond_6

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :cond_6
    sub-int v5, v3, v4

    .line 62
    invoke-virtual {v2, v0, v4, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 63
    iput v3, p0, Le/f/d/f0/c;->f:I

    .line 64
    invoke-virtual {p0, v6}, Le/f/d/f0/c;->a(I)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_0

    :cond_7
    const-string p1, "Unterminated string"

    .line 65
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    throw v1
.end method

.method public final a(Le/f/d/f0/d;)V
    .locals 4

    .line 8
    iget v0, p0, Le/f/d/f0/c;->k:I

    iget-object v1, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x2

    .line 9
    new-array v2, v2, [Le/f/d/f0/d;

    const/4 v3, 0x0

    .line 10
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    iput-object v2, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    .line 12
    :cond_0
    iget-object v0, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    iget v1, p0, Le/f/d/f0/c;->k:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Le/f/d/f0/c;->k:I

    aput-object p1, v0, v1

    return-void
.end method

.method public final a(Le/f/d/f0/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 5
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    if-ne v0, p1, :cond_0

    .line 6
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but was "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " at line "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " column "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(I)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    .line 29
    iget v1, p0, Le/f/d/f0/c;->h:I

    .line 30
    iget v2, p0, Le/f/d/f0/c;->i:I

    .line 31
    iget v3, p0, Le/f/d/f0/c;->f:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v3, :cond_1

    .line 32
    aget-char v7, v0, v5

    const/16 v8, 0xa

    if-ne v7, v8, :cond_0

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 33
    :cond_1
    iput v1, p0, Le/f/d/f0/c;->h:I

    .line 34
    iput v2, p0, Le/f/d/f0/c;->i:I

    .line 35
    iget v1, p0, Le/f/d/f0/c;->g:I

    iget v2, p0, Le/f/d/f0/c;->f:I

    if-eq v1, v2, :cond_2

    sub-int/2addr v1, v2

    .line 36
    iput v1, p0, Le/f/d/f0/c;->g:I

    .line 37
    invoke-static {v0, v2, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    .line 38
    :cond_2
    iput v4, p0, Le/f/d/f0/c;->g:I

    .line 39
    :goto_2
    iput v4, p0, Le/f/d/f0/c;->f:I

    .line 40
    :cond_3
    iget-object v1, p0, Le/f/d/f0/c;->c:Ljava/io/Reader;

    iget v2, p0, Le/f/d/f0/c;->g:I

    array-length v3, v0

    sub-int/2addr v3, v2

    invoke-virtual {v1, v0, v2, v3}, Ljava/io/Reader;->read([CII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5

    .line 41
    iget v2, p0, Le/f/d/f0/c;->g:I

    add-int/2addr v2, v1

    iput v2, p0, Le/f/d/f0/c;->g:I

    .line 42
    iget v1, p0, Le/f/d/f0/c;->h:I

    if-ne v1, v6, :cond_4

    iget v1, p0, Le/f/d/f0/c;->i:I

    if-ne v1, v6, :cond_4

    if-lez v2, :cond_4

    aget-char v2, v0, v4

    const v3, 0xfeff

    if-ne v2, v3, :cond_4

    .line 43
    iget v2, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v2, v6

    iput v2, p0, Le/f/d/f0/c;->f:I

    add-int/lit8 v1, v1, -0x1

    .line 44
    iput v1, p0, Le/f/d/f0/c;->i:I

    .line 45
    :cond_4
    iget v1, p0, Le/f/d/f0/c;->g:I

    if-lt v1, p1, :cond_3

    return v6

    :cond_5
    return v4
.end method

.method public final b(Z)Le/f/d/f0/e;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x7d

    const/4 v2, 0x1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0, v2}, Le/f/d/f0/c;->d(Z)I

    move-result p1

    if-eq p1, v1, :cond_0

    .line 4
    iget p1, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr p1, v2

    iput p1, p0, Le/f/d/f0/c;->f:I

    goto :goto_0

    .line 5
    :cond_0
    iget p1, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr p1, v2

    iput p1, p0, Le/f/d/f0/c;->k:I

    .line 6
    sget-object p1, Le/f/d/f0/e;->e:Le/f/d/f0/e;

    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1

    .line 7
    :cond_1
    invoke-virtual {p0, v2}, Le/f/d/f0/c;->d(Z)I

    move-result p1

    const/16 v3, 0x2c

    if-eq p1, v3, :cond_3

    const/16 v3, 0x3b

    if-eq p1, v3, :cond_3

    if-ne p1, v1, :cond_2

    .line 8
    iget p1, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr p1, v2

    iput p1, p0, Le/f/d/f0/c;->k:I

    .line 9
    sget-object p1, Le/f/d/f0/e;->e:Le/f/d/f0/e;

    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1

    :cond_2
    const-string p1, "Unterminated object"

    .line 10
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    throw v0

    .line 11
    :cond_3
    :goto_0
    invoke-virtual {p0, v2}, Le/f/d/f0/c;->d(Z)I

    move-result p1

    const/16 v1, 0x22

    if-eq p1, v1, :cond_6

    const/16 v1, 0x27

    if-eq p1, v1, :cond_5

    .line 12
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 13
    iget p1, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr p1, v2

    iput p1, p0, Le/f/d/f0/c;->f:I

    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Z)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/f/d/f0/c;->m:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "Expected name"

    .line 16
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    throw v0

    .line 17
    :cond_5
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    :cond_6
    int-to-char p1, p1

    .line 18
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->a(C)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/f/d/f0/c;->m:Ljava/lang/String;

    .line 19
    :goto_1
    iget-object p1, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    iget v0, p0, Le/f/d/f0/c;->k:I

    sub-int/2addr v0, v2

    sget-object v1, Le/f/d/f0/d;->e:Le/f/d/f0/d;

    aput-object v1, p1, v0

    .line 20
    sget-object p1, Le/f/d/f0/e;->f:Le/f/d/f0/e;

    iput-object p1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    :goto_0
    iget v0, p0, Le/f/d/f0/c;->f:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Le/f/d/f0/c;->g:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    return v2

    .line 22
    :cond_1
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v2, v0, :cond_3

    .line 23
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v3, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v3, v2

    aget-char v0, v0, v3

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v0, v3, :cond_2

    .line 24
    iget v0, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Le/f/d/f0/c;->f:I

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return v1
.end method

.method public final c()Le/f/d/f0/e;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 3
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    .line 5
    iput-object v1, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 6
    iput-object v1, p0, Le/f/d/f0/c;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/google/gson/stream/MalformedJsonException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " at line "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " column "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Z)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Le/f/d/f0/c;->o:I

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Le/f/d/f0/c;->p:I

    const/4 v1, 0x0

    move-object v3, v1

    :cond_0
    const/4 v2, 0x0

    .line 9
    :goto_0
    iget v4, p0, Le/f/d/f0/c;->f:I

    add-int v5, v4, v2

    iget v6, p0, Le/f/d/f0/c;->g:I

    if-ge v5, v6, :cond_2

    .line 10
    iget-object v5, p0, Le/f/d/f0/c;->e:[C

    add-int/2addr v4, v2

    aget-char v4, v5, v4

    const/16 v5, 0x9

    if-eq v4, v5, :cond_4

    const/16 v5, 0xa

    if-eq v4, v5, :cond_4

    const/16 v5, 0xc

    if-eq v4, v5, :cond_4

    const/16 v5, 0xd

    if-eq v4, v5, :cond_4

    const/16 v5, 0x20

    if-eq v4, v5, :cond_4

    const/16 v5, 0x23

    if-eq v4, v5, :cond_1

    const/16 v5, 0x2c

    if-eq v4, v5, :cond_4

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_1

    const/16 v5, 0x3d

    if-eq v4, v5, :cond_1

    const/16 v5, 0x7b

    if-eq v4, v5, :cond_4

    const/16 v5, 0x7d

    if-eq v4, v5, :cond_4

    const/16 v5, 0x3a

    if-eq v4, v5, :cond_4

    const/16 v5, 0x3b

    if-eq v4, v5, :cond_1

    packed-switch v4, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 11
    :cond_1
    :pswitch_0
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    goto :goto_1

    .line 12
    :cond_2
    iget-object v4, p0, Le/f/d/f0/c;->e:[C

    array-length v4, v4

    if-ge v2, v4, :cond_5

    add-int/lit8 v4, v2, 0x1

    .line 13
    invoke-virtual {p0, v4}, Le/f/d/f0/c;->a(I)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 14
    :cond_3
    iget-object v4, p0, Le/f/d/f0/c;->e:[C

    iget v5, p0, Le/f/d/f0/c;->g:I

    aput-char v0, v4, v5

    :cond_4
    :goto_1
    :pswitch_1
    move v0, v2

    goto :goto_2

    :cond_5
    if-nez v3, :cond_6

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    :cond_6
    iget-object v4, p0, Le/f/d/f0/c;->e:[C

    iget v5, p0, Le/f/d/f0/c;->f:I

    invoke-virtual {v3, v4, v5, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 17
    iget v4, p0, Le/f/d/f0/c;->p:I

    add-int/2addr v4, v2

    iput v4, p0, Le/f/d/f0/c;->p:I

    .line 18
    iget v4, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v4, v2

    iput v4, p0, Le/f/d/f0/c;->f:I

    const/4 v2, 0x1

    .line 19
    invoke-virtual {p0, v2}, Le/f/d/f0/c;->a(I)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_2
    if-eqz p1, :cond_7

    if-nez v3, :cond_7

    .line 20
    iget p1, p0, Le/f/d/f0/c;->f:I

    iput p1, p0, Le/f/d/f0/c;->o:I

    goto :goto_3

    .line 21
    :cond_7
    iget-boolean p1, p0, Le/f/d/f0/c;->q:Z

    if-eqz p1, :cond_8

    const-string v1, "skipped!"

    goto :goto_3

    :cond_8
    if-nez v3, :cond_9

    .line 22
    iget-object p1, p0, Le/f/d/f0/c;->b:Le/f/d/f0/h;

    iget-object v1, p0, Le/f/d/f0/c;->e:[C

    iget v2, p0, Le/f/d/f0/c;->f:I

    invoke-virtual {p1, v1, v2, v0}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    .line 23
    :cond_9
    iget-object p1, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->f:I

    invoke-virtual {v3, p1, v1, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 25
    :goto_3
    iget p1, p0, Le/f/d/f0/c;->p:I

    add-int/2addr p1, v0

    iput p1, p0, Le/f/d/f0/c;->p:I

    .line 26
    iget p1, p0, Le/f/d/f0/c;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Le/f/d/f0/c;->f:I

    return-object v1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 2
    iput-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    .line 3
    iget-object v0, p0, Le/f/d/f0/c;->j:[Le/f/d/f0/d;

    sget-object v1, Le/f/d/f0/d;->i:Le/f/d/f0/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Le/f/d/f0/c;->k:I

    .line 5
    iget-object v0, p0, Le/f/d/f0/c;->c:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void
.end method

.method public final d(Z)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    .line 3
    iget v1, p0, Le/f/d/f0/c;->f:I

    .line 4
    iget v2, p0, Le/f/d/f0/c;->g:I

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v2, :cond_2

    .line 5
    iput v1, p0, Le/f/d/f0/c;->f:I

    .line 6
    invoke-virtual {p0, v3}, Le/f/d/f0/c;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 7
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "End of input at line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " column "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    iget v1, p0, Le/f/d/f0/c;->f:I

    .line 9
    iget v2, p0, Le/f/d/f0/c;->g:I

    :cond_2
    add-int/lit8 v4, v1, 0x1

    .line 10
    aget-char v1, v0, v1

    const/16 v5, 0x9

    if-eq v1, v5, :cond_9

    const/16 v5, 0xa

    if-eq v1, v5, :cond_9

    const/16 v5, 0xd

    if-eq v1, v5, :cond_9

    const/16 v5, 0x20

    if-eq v1, v5, :cond_9

    const/16 v5, 0x23

    if-eq v1, v5, :cond_8

    const/16 v5, 0x2f

    if-eq v1, v5, :cond_3

    .line 11
    iput v4, p0, Le/f/d/f0/c;->f:I

    return v1

    .line 12
    :cond_3
    iput v4, p0, Le/f/d/f0/c;->f:I

    const/4 v6, 0x2

    if-ne v4, v2, :cond_4

    add-int/lit8 v4, v4, -0x1

    .line 13
    iput v4, p0, Le/f/d/f0/c;->f:I

    .line 14
    invoke-virtual {p0, v6}, Le/f/d/f0/c;->a(I)Z

    move-result v2

    .line 15
    iget v4, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v4, v3

    iput v4, p0, Le/f/d/f0/c;->f:I

    if-nez v2, :cond_4

    return v1

    .line 16
    :cond_4
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 17
    iget v2, p0, Le/f/d/f0/c;->f:I

    aget-char v3, v0, v2

    const/16 v4, 0x2a

    if-eq v3, v4, :cond_6

    if-eq v3, v5, :cond_5

    return v1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 18
    iput v2, p0, Le/f/d/f0/c;->f:I

    .line 19
    invoke-virtual {p0}, Le/f/d/f0/c;->I()V

    .line 20
    iget v1, p0, Le/f/d/f0/c;->f:I

    .line 21
    iget v2, p0, Le/f/d/f0/c;->g:I

    goto/16 :goto_0

    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 22
    iput v2, p0, Le/f/d/f0/c;->f:I

    const-string v1, "*/"

    .line 23
    invoke-virtual {p0, v1}, Le/f/d/f0/c;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 24
    iget v1, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v1, v6

    .line 25
    iget v2, p0, Le/f/d/f0/c;->g:I

    goto/16 :goto_0

    :cond_7
    const-string p1, "Unterminated comment"

    .line 26
    invoke-virtual {p0, p1}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1

    .line 27
    :cond_8
    iput v4, p0, Le/f/d/f0/c;->f:I

    .line 28
    invoke-virtual {p0}, Le/f/d/f0/c;->n()V

    .line 29
    invoke-virtual {p0}, Le/f/d/f0/c;->I()V

    .line 30
    iget v1, p0, Le/f/d/f0/c;->f:I

    .line 31
    iget v2, p0, Le/f/d/f0/c;->g:I

    goto/16 :goto_0

    :cond_9
    move v1, v4

    goto/16 :goto_0
.end method

.method public final e(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Le/f/d/f0/c;->d:Z

    return-void
.end method

.method public l()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/d/f0/e;->b:Le/f/d/f0/e;

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V

    return-void
.end method

.method public m()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/d/f0/e;->d:Le/f/d/f0/e;

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V

    return-void
.end method

.method public final n()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/f/d/f0/c;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    .line 2
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->c(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v0, 0x0

    throw v0
.end method

.method public final o()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Le/f/d/f0/c;->d(Z)I

    .line 2
    iget v1, p0, Le/f/d/f0/c;->f:I

    sub-int/2addr v1, v0

    iput v1, p0, Le/f/d/f0/c;->f:I

    .line 3
    sget-object v0, Le/f/d/f0/c;->r:[C

    array-length v2, v0

    add-int/2addr v1, v2

    iget v2, p0, Le/f/d/f0/c;->g:I

    if-le v1, v2, :cond_0

    array-length v0, v0

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    sget-object v1, Le/f/d/f0/c;->r:[C

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 5
    iget-object v2, p0, Le/f/d/f0/c;->e:[C

    iget v3, p0, Le/f/d/f0/c;->f:I

    add-int/2addr v3, v0

    aget-char v2, v2, v3

    aget-char v1, v1, v0

    if-eq v2, v1, :cond_1

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_2
    iget v0, p0, Le/f/d/f0/c;->f:I

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Le/f/d/f0/c;->f:I

    return-void
.end method

.method public final p()Le/f/d/f0/e;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f/d/f0/c;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    return-object v0

    .line 3
    :cond_0
    iget v1, p0, Le/f/d/f0/c;->p:I

    const/16 v2, 0x55

    const/16 v3, 0x75

    const/16 v4, 0x4c

    const/16 v5, 0x6c

    const/4 v6, 0x4

    if-ne v1, v6, :cond_5

    const/16 v1, 0x6e

    iget-object v7, p0, Le/f/d/f0/c;->e:[C

    aget-char v8, v7, v0

    if-eq v1, v8, :cond_1

    const/16 v1, 0x4e

    aget-char v0, v7, v0

    if-ne v1, v0, :cond_5

    :cond_1
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v7, v1, 0x1

    aget-char v7, v0, v7

    if-eq v3, v7, :cond_2

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    if-ne v2, v0, :cond_5

    :cond_2
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v7, v1, 0x2

    aget-char v7, v0, v7

    if-eq v5, v7, :cond_3

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v4, v0, :cond_5

    :cond_3
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v7, v1, 0x3

    aget-char v7, v0, v7

    if-eq v5, v7, :cond_4

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v4, v0, :cond_5

    :cond_4
    const-string v0, "null"

    .line 4
    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 5
    sget-object v0, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    return-object v0

    .line 6
    :cond_5
    iget v0, p0, Le/f/d/f0/c;->p:I

    const/16 v1, 0x45

    const/16 v7, 0x65

    if-ne v0, v6, :cond_a

    const/16 v0, 0x74

    iget-object v8, p0, Le/f/d/f0/c;->e:[C

    iget v9, p0, Le/f/d/f0/c;->o:I

    aget-char v10, v8, v9

    if-eq v0, v10, :cond_6

    const/16 v0, 0x54

    aget-char v8, v8, v9

    if-ne v0, v8, :cond_a

    :cond_6
    const/16 v0, 0x72

    iget-object v8, p0, Le/f/d/f0/c;->e:[C

    iget v9, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v10, v9, 0x1

    aget-char v10, v8, v10

    if-eq v0, v10, :cond_7

    const/16 v0, 0x52

    add-int/lit8 v9, v9, 0x1

    aget-char v8, v8, v9

    if-ne v0, v8, :cond_a

    :cond_7
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v8, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v9, v8, 0x2

    aget-char v9, v0, v9

    if-eq v3, v9, :cond_8

    add-int/lit8 v8, v8, 0x2

    aget-char v0, v0, v8

    if-ne v2, v0, :cond_a

    :cond_8
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v2, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v3, v2, 0x3

    aget-char v3, v0, v3

    if-eq v7, v3, :cond_9

    add-int/lit8 v2, v2, 0x3

    aget-char v0, v0, v2

    if-ne v1, v0, :cond_a

    :cond_9
    const-string v0, "true"

    .line 7
    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 8
    sget-object v0, Le/f/d/f0/e;->i:Le/f/d/f0/e;

    return-object v0

    .line 9
    :cond_a
    iget v0, p0, Le/f/d/f0/c;->p:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_10

    const/16 v0, 0x66

    iget-object v2, p0, Le/f/d/f0/c;->e:[C

    iget v3, p0, Le/f/d/f0/c;->o:I

    aget-char v8, v2, v3

    if-eq v0, v8, :cond_b

    const/16 v0, 0x46

    aget-char v2, v2, v3

    if-ne v0, v2, :cond_10

    :cond_b
    const/16 v0, 0x61

    iget-object v2, p0, Le/f/d/f0/c;->e:[C

    iget v3, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v8, v3, 0x1

    aget-char v8, v2, v8

    if-eq v0, v8, :cond_c

    const/16 v0, 0x41

    add-int/lit8 v3, v3, 0x1

    aget-char v2, v2, v3

    if-ne v0, v2, :cond_10

    :cond_c
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v2, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v3, v2, 0x2

    aget-char v3, v0, v3

    if-eq v5, v3, :cond_d

    add-int/lit8 v2, v2, 0x2

    aget-char v0, v0, v2

    if-ne v4, v0, :cond_10

    :cond_d
    const/16 v0, 0x73

    iget-object v2, p0, Le/f/d/f0/c;->e:[C

    iget v3, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v4, v3, 0x3

    aget-char v4, v2, v4

    if-eq v0, v4, :cond_e

    const/16 v0, 0x53

    add-int/lit8 v3, v3, 0x3

    aget-char v2, v2, v3

    if-ne v0, v2, :cond_10

    :cond_e
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v2, p0, Le/f/d/f0/c;->o:I

    add-int/lit8 v3, v2, 0x4

    aget-char v3, v0, v3

    if-eq v7, v3, :cond_f

    add-int/2addr v2, v6

    aget-char v0, v0, v2

    if-ne v1, v0, :cond_10

    :cond_f
    const-string v0, "false"

    .line 10
    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 11
    sget-object v0, Le/f/d/f0/e;->i:Le/f/d/f0/e;

    return-object v0

    .line 12
    :cond_10
    iget-object v0, p0, Le/f/d/f0/c;->b:Le/f/d/f0/h;

    iget-object v1, p0, Le/f/d/f0/c;->e:[C

    iget v2, p0, Le/f/d/f0/c;->o:I

    iget v3, p0, Le/f/d/f0/c;->p:I

    invoke-virtual {v0, v1, v2, v3}, Le/f/d/f0/h;->a([CII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    .line 13
    iget-object v0, p0, Le/f/d/f0/c;->e:[C

    iget v1, p0, Le/f/d/f0/c;->o:I

    iget v2, p0, Le/f/d/f0/c;->p:I

    invoke-virtual {p0, v0, v1, v2}, Le/f/d/f0/c;->a([CII)Le/f/d/f0/e;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/d/f0/e;->c:Le/f/d/f0/e;

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V

    return-void
.end method

.method public r()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/d/f0/e;->e:Le/f/d/f0/e;

    invoke-virtual {p0, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/e;)V

    return-void
.end method

.method public final s()I
    .locals 4

    .line 1
    iget v0, p0, Le/f/d/f0/c;->i:I

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget v2, p0, Le/f/d/f0/c;->f:I

    if-ge v1, v2, :cond_1

    .line 3
    iget-object v2, p0, Le/f/d/f0/c;->e:[C

    aget-char v2, v2, v1

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final t()I
    .locals 4

    .line 1
    iget v0, p0, Le/f/d/f0/c;->h:I

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget v2, p0, Le/f/d/f0/c;->f:I

    if-ge v1, v2, :cond_1

    .line 3
    iget-object v2, p0, Le/f/d/f0/c;->e:[C

    aget-char v2, v2, v1

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Le/f/d/f0/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " at line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " column "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->e:Le/f/d/f0/e;

    if-eq v0, v1, :cond_0

    sget-object v1, Le/f/d/f0/e;->c:Le/f/d/f0/e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/f/d/f0/c;->d:Z

    return v0
.end method

.method public w()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->i:Le/f/d/f0/e;

    if-ne v0, v1, :cond_1

    .line 3
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    const-string v1, "true"

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return v0

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a boolean but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public x()D
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    const-string v2, " column "

    const-string v3, " at line "

    if-eq v0, v1, :cond_1

    sget-object v1, Le/f/d/f0/e;->h:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected a double but was "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v6, v0, v4

    if-ltz v6, :cond_3

    .line 5
    iget-object v4, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    const-string v5, "0"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    new-instance v0, Lcom/google/gson/stream/MalformedJsonException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON forbids octal prefixes: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_3
    :goto_1
    iget-boolean v4, p0, Le/f/d/f0/c;->d:Z

    if-nez v4, :cond_5

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    .line 8
    :cond_4
    new-instance v0, Lcom/google/gson/stream/MalformedJsonException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_5
    :goto_2
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return-wide v0
.end method

.method public y()I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    const-string v2, "Expected an int but was "

    const-string v3, " column "

    const-string v4, " at line "

    if-eq v0, v1, :cond_1

    sget-object v1, Le/f/d/f0/e;->h:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    .line 5
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v5, v0

    int-to-double v6, v5

    cmpl-double v8, v6, v0

    if-nez v8, :cond_4

    move v0, v5

    :goto_1
    int-to-long v1, v0

    const-wide/16 v5, 0x1

    cmp-long v7, v1, v5

    if-ltz v7, :cond_3

    .line 6
    iget-object v1, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    .line 7
    :cond_2
    new-instance v0, Lcom/google/gson/stream/MalformedJsonException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids octal prefixes: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_3
    :goto_2
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return v0

    .line 9
    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public z()J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    iget-object v0, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    sget-object v1, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    const-string v2, "Expected a long but was "

    const-string v3, " column "

    const-string v4, " at line "

    if-eq v0, v1, :cond_1

    sget-object v1, Le/f/d/f0/e;->h:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->l:Le/f/d/f0/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    .line 5
    iget-object v0, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v5, v0

    long-to-double v7, v5

    cmpl-double v9, v7, v0

    if-nez v9, :cond_4

    move-wide v0, v5

    :goto_1
    const-wide/16 v5, 0x1

    cmp-long v2, v0, v5

    if-ltz v2, :cond_3

    .line 6
    iget-object v2, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    const-string v5, "0"

    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 7
    :cond_2
    new-instance v0, Lcom/google/gson/stream/MalformedJsonException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids octal prefixes: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_3
    :goto_2
    invoke-virtual {p0}, Le/f/d/f0/c;->c()Le/f/d/f0/e;

    return-wide v0

    .line 9
    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/d/f0/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/d/f0/c;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
