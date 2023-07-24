.class public final Le/f/d/d0/g0/n0;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/a0<",
        "Le/f/d/t;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;)Le/f/d/t;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Le/f/d/d0/g0/u0;->a:[I

    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 5
    :pswitch_0
    new-instance v0, Le/f/d/v;

    invoke-direct {v0}, Le/f/d/v;-><init>()V

    .line 6
    invoke-virtual {p1}, Le/f/d/f0/c;->m()V

    .line 7
    :goto_0
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {p1}, Le/f/d/f0/c;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Le/f/d/d0/g0/n0;->a(Le/f/d/f0/c;)Le/f/d/t;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le/f/d/v;->a(Ljava/lang/String;Le/f/d/t;)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/c;->r()V

    return-object v0

    .line 10
    :pswitch_1
    new-instance v0, Le/f/d/s;

    invoke-direct {v0}, Le/f/d/s;-><init>()V

    .line 11
    invoke-virtual {p1}, Le/f/d/f0/c;->l()V

    .line 12
    :goto_1
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 13
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/n0;->a(Le/f/d/f0/c;)Le/f/d/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/d/s;->a(Le/f/d/t;)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/c;->q()V

    return-object v0

    .line 15
    :pswitch_2
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    .line 16
    sget-object p1, Le/f/d/u;->a:Le/f/d/u;

    return-object p1

    .line 17
    :pswitch_3
    new-instance v0, Le/f/d/w;

    invoke-virtual {p1}, Le/f/d/f0/c;->C()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le/f/d/w;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 18
    :pswitch_4
    new-instance v0, Le/f/d/w;

    invoke-virtual {p1}, Le/f/d/f0/c;->w()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Le/f/d/w;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    .line 19
    :pswitch_5
    invoke-virtual {p1}, Le/f/d/f0/c;->C()Ljava/lang/String;

    move-result-object p1

    .line 20
    new-instance v0, Le/f/d/w;

    new-instance v1, Le/f/d/d0/r;

    invoke-direct {v1, p1}, Le/f/d/d0/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Le/f/d/w;-><init>(Ljava/lang/Number;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/n0;->a(Le/f/d/f0/c;)Le/f/d/t;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/d/f0/g;Le/f/d/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_8

    .line 21
    invoke-virtual {p2}, Le/f/d/t;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 22
    :cond_0
    invoke-virtual {p2}, Le/f/d/t;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    invoke-virtual {p2}, Le/f/d/t;->c()Le/f/d/w;

    move-result-object p2

    .line 24
    invoke-virtual {p2}, Le/f/d/w;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    invoke-virtual {p2}, Le/f/d/w;->j()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/f/d/f0/g;->a(Ljava/lang/Number;)Le/f/d/f0/g;

    goto/16 :goto_3

    .line 26
    :cond_1
    invoke-virtual {p2}, Le/f/d/w;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 27
    invoke-virtual {p2}, Le/f/d/w;->h()Z

    move-result p2

    invoke-virtual {p1, p2}, Le/f/d/f0/g;->c(Z)Le/f/d/f0/g;

    goto/16 :goto_3

    .line 28
    :cond_2
    invoke-virtual {p2}, Le/f/d/w;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/f/d/f0/g;->d(Ljava/lang/String;)Le/f/d/f0/g;

    goto/16 :goto_3

    .line 29
    :cond_3
    invoke-virtual {p2}, Le/f/d/t;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 30
    invoke-virtual {p1}, Le/f/d/f0/g;->l()Le/f/d/f0/g;

    .line 31
    invoke-virtual {p2}, Le/f/d/t;->a()Le/f/d/s;

    move-result-object p2

    invoke-virtual {p2}, Le/f/d/s;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/d/t;

    .line 32
    invoke-virtual {p0, p1, v0}, Le/f/d/d0/g0/n0;->a(Le/f/d/f0/g;Le/f/d/t;)V

    goto :goto_0

    .line 33
    :cond_4
    invoke-virtual {p1}, Le/f/d/f0/g;->n()Le/f/d/f0/g;

    goto :goto_3

    .line 34
    :cond_5
    invoke-virtual {p2}, Le/f/d/t;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 35
    invoke-virtual {p1}, Le/f/d/f0/g;->m()Le/f/d/f0/g;

    .line 36
    invoke-virtual {p2}, Le/f/d/t;->b()Le/f/d/v;

    move-result-object p2

    invoke-virtual {p2}, Le/f/d/v;->h()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Le/f/d/f0/g;->b(Ljava/lang/String;)Le/f/d/f0/g;

    .line 38
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/d/t;

    invoke-virtual {p0, p1, v0}, Le/f/d/d0/g0/n0;->a(Le/f/d/f0/g;Le/f/d/t;)V

    goto :goto_1

    .line 39
    :cond_6
    invoke-virtual {p1}, Le/f/d/f0/g;->o()Le/f/d/f0/g;

    goto :goto_3

    .line 40
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t write "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_8
    :goto_2
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    :goto_3
    return-void
.end method

.method public bridge synthetic a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p2, Le/f/d/t;

    invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/n0;->a(Le/f/d/f0/g;Le/f/d/t;)V

    return-void
.end method
