.class public Lc/f/a/l/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/f/a/l/g$a;,
        Lc/f/a/l/g$b;
    }
.end annotation


# instance fields
.field public a:Lc/f/a/l/q;

.field public final b:Lc/f/a/l/i;

.field public final c:Lc/f/a/l/g$b;

.field public d:Lc/f/a/l/g;

.field public e:I

.field public f:I

.field public g:Lc/f/a/l/g$a;

.field public h:I

.field public i:Lc/f/a/k;


# direct methods
.method public constructor <init>(Lc/f/a/l/i;Lc/f/a/l/g$b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/f/a/l/q;

    invoke-direct {v0, p0}, Lc/f/a/l/q;-><init>(Lc/f/a/l/g;)V

    iput-object v0, p0, Lc/f/a/l/g;->a:Lc/f/a/l/q;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lc/f/a/l/g;->e:I

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lc/f/a/l/g;->f:I

    .line 5
    sget-object v1, Lc/f/a/l/g$a;->b:Lc/f/a/l/g$a;

    iput-object v1, p0, Lc/f/a/l/g;->g:Lc/f/a/l/g$a;

    .line 6
    sget-object v1, Lc/f/a/l/f;->b:Lc/f/a/l/f;

    .line 7
    iput v0, p0, Lc/f/a/l/g;->h:I

    .line 8
    iput-object p1, p0, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    .line 9
    iput-object p2, p0, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 4
    iget v0, p0, Lc/f/a/l/g;->h:I

    return v0
.end method

.method public a(Lc/f/a/c;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc/f/a/l/g;->i:Lc/f/a/k;

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lc/f/a/k;

    sget-object v0, Lc/f/a/j;->b:Lc/f/a/j;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lc/f/a/k;-><init>(Lc/f/a/j;Ljava/lang/String;)V

    iput-object p1, p0, Lc/f/a/l/g;->i:Lc/f/a/k;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lc/f/a/k;->a()V

    :goto_0
    return-void
.end method

.method public a(Lc/f/a/l/g;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lc/f/a/l/g;->h()Lc/f/a/l/g$b;

    move-result-object v1

    .line 19
    iget-object v2, p0, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    .line 20
    sget-object v1, Lc/f/a/l/g$b;->g:Lc/f/a/l/g$b;

    if-ne v2, v1, :cond_2

    .line 21
    invoke-virtual {p1}, Lc/f/a/l/g;->c()Lc/f/a/l/i;

    move-result-object p1

    invoke-virtual {p1}, Lc/f/a/l/i;->y()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lc/f/a/l/g;->c()Lc/f/a/l/i;

    move-result-object p1

    invoke-virtual {p1}, Lc/f/a/l/i;->y()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    .line 22
    :cond_3
    sget-object v4, Lc/f/a/l/e;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    .line 23
    new-instance p1, Ljava/lang/AssertionError;

    iget-object v0, p0, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    return v0

    .line 24
    :pswitch_1
    sget-object v2, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    if-eq v1, v2, :cond_5

    sget-object v2, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    if-ne v1, v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v2, 0x1

    .line 25
    :goto_1
    invoke-virtual {p1}, Lc/f/a/l/g;->c()Lc/f/a/l/i;

    move-result-object p1

    instance-of p1, p1, Lc/f/a/l/m;

    if-eqz p1, :cond_8

    if-nez v2, :cond_6

    .line 26
    sget-object p1, Lc/f/a/l/g$b;->j:Lc/f/a/l/g$b;

    if-ne v1, p1, :cond_7

    :cond_6
    const/4 v0, 0x1

    :cond_7
    move v2, v0

    :cond_8
    return v2

    .line 27
    :pswitch_2
    sget-object v2, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    if-eq v1, v2, :cond_a

    sget-object v2, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    if-ne v1, v2, :cond_9

    goto :goto_2

    :cond_9
    const/4 v2, 0x0

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v2, 0x1

    .line 28
    :goto_3
    invoke-virtual {p1}, Lc/f/a/l/g;->c()Lc/f/a/l/i;

    move-result-object p1

    instance-of p1, p1, Lc/f/a/l/m;

    if-eqz p1, :cond_d

    if-nez v2, :cond_b

    .line 29
    sget-object p1, Lc/f/a/l/g$b;->i:Lc/f/a/l/g$b;

    if-ne v1, p1, :cond_c

    :cond_b
    const/4 v0, 0x1

    :cond_c
    move v2, v0

    :cond_d
    return v2

    .line 30
    :pswitch_3
    sget-object p1, Lc/f/a/l/g$b;->g:Lc/f/a/l/g$b;

    if-eq v1, p1, :cond_e

    sget-object p1, Lc/f/a/l/g$b;->i:Lc/f/a/l/g$b;

    if-eq v1, p1, :cond_e

    sget-object p1, Lc/f/a/l/g$b;->j:Lc/f/a/l/g$b;

    if-eq v1, p1, :cond_e

    const/4 v0, 0x1

    :cond_e
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lc/f/a/l/g;IILc/f/a/l/g$a;IZ)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lc/f/a/l/g;->d:Lc/f/a/l/g;

    .line 7
    iput v1, p0, Lc/f/a/l/g;->e:I

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lc/f/a/l/g;->f:I

    .line 9
    sget-object p1, Lc/f/a/l/g$a;->b:Lc/f/a/l/g$a;

    iput-object p1, p0, Lc/f/a/l/g;->g:Lc/f/a/l/g$a;

    const/4 p1, 0x2

    .line 10
    iput p1, p0, Lc/f/a/l/g;->h:I

    return v0

    :cond_0
    if-nez p6, :cond_1

    .line 11
    invoke-virtual {p0, p1}, Lc/f/a/l/g;->a(Lc/f/a/l/g;)Z

    move-result p6

    if-nez p6, :cond_1

    return v1

    .line 12
    :cond_1
    iput-object p1, p0, Lc/f/a/l/g;->d:Lc/f/a/l/g;

    if-lez p2, :cond_2

    .line 13
    iput p2, p0, Lc/f/a/l/g;->e:I

    goto :goto_0

    .line 14
    :cond_2
    iput v1, p0, Lc/f/a/l/g;->e:I

    .line 15
    :goto_0
    iput p3, p0, Lc/f/a/l/g;->f:I

    .line 16
    iput-object p4, p0, Lc/f/a/l/g;->g:Lc/f/a/l/g$a;

    .line 17
    iput p5, p0, Lc/f/a/l/g;->h:I

    return v0
.end method

.method public a(Lc/f/a/l/g;ILc/f/a/l/g$a;I)Z
    .locals 7

    const/4 v3, -0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v4, p3

    move v5, p4

    .line 5
    invoke-virtual/range {v0 .. v6}, Lc/f/a/l/g;->a(Lc/f/a/l/g;IILc/f/a/l/g$a;IZ)Z

    move-result p1

    return p1
.end method

.method public b()I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    invoke-virtual {v0}, Lc/f/a/l/i;->s()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, p0, Lc/f/a/l/g;->f:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lc/f/a/l/g;->d:Lc/f/a/l/g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    .line 3
    invoke-virtual {v0}, Lc/f/a/l/i;->s()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 4
    iget v0, p0, Lc/f/a/l/g;->f:I

    return v0

    .line 5
    :cond_1
    iget v0, p0, Lc/f/a/l/g;->e:I

    return v0
.end method

.method public c()Lc/f/a/l/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    return-object v0
.end method

.method public d()Lc/f/a/l/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->a:Lc/f/a/l/q;

    return-object v0
.end method

.method public e()Lc/f/a/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->i:Lc/f/a/k;

    return-object v0
.end method

.method public f()Lc/f/a/l/g$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->g:Lc/f/a/l/g$a;

    return-object v0
.end method

.method public g()Lc/f/a/l/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->d:Lc/f/a/l/g;

    return-object v0
.end method

.method public h()Lc/f/a/l/g$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/g;->d:Lc/f/a/l/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/f/a/l/g;->d:Lc/f/a/l/g;

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/f/a/l/g;->e:I

    const/4 v1, -0x1

    .line 3
    iput v1, p0, Lc/f/a/l/g;->f:I

    .line 4
    sget-object v1, Lc/f/a/l/g$a;->c:Lc/f/a/l/g$a;

    iput-object v1, p0, Lc/f/a/l/g;->g:Lc/f/a/l/g$a;

    .line 5
    iput v0, p0, Lc/f/a/l/g;->h:I

    .line 6
    sget-object v0, Lc/f/a/l/f;->b:Lc/f/a/l/f;

    .line 7
    iget-object v0, p0, Lc/f/a/l/g;->a:Lc/f/a/l/q;

    invoke-virtual {v0}, Lc/f/a/l/q;->d()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    invoke-virtual {v1}, Lc/f/a/l/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
