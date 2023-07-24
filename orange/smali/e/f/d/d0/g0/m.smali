.class public final Le/f/d/d0/g0/m;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/a0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Le/f/d/b0;


# instance fields
.field public final a:Le/f/d/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/d/d0/g0/k;

    invoke-direct {v0}, Le/f/d/d0/g0/k;-><init>()V

    sput-object v0, Le/f/d/d0/g0/m;->b:Le/f/d/b0;

    return-void
.end method

.method public constructor <init>(Le/f/d/q;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/d/d0/g0/m;->a:Le/f/d/q;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/d/q;Le/f/d/d0/g0/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/d/d0/g0/m;-><init>(Le/f/d/q;)V

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v0

    .line 2
    sget-object v1, Le/f/d/d0/g0/l;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 4
    :pswitch_0
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    const/4 p1, 0x0

    return-object p1

    .line 5
    :pswitch_1
    invoke-virtual {p1}, Le/f/d/f0/c;->w()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_2
    invoke-virtual {p1}, Le/f/d/f0/c;->x()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_3
    invoke-virtual {p1}, Le/f/d/f0/c;->C()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 8
    :pswitch_4
    new-instance v0, Le/f/d/d0/x;

    invoke-direct {v0}, Le/f/d/d0/x;-><init>()V

    .line 9
    invoke-virtual {p1}, Le/f/d/f0/c;->m()V

    .line 10
    :goto_0
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    invoke-virtual {p1}, Le/f/d/f0/c;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Le/f/d/d0/g0/m;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/c;->r()V

    return-object v0

    .line 13
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-virtual {p1}, Le/f/d/f0/c;->l()V

    .line 15
    :goto_1
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 16
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/m;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/c;->q()V

    return-object v0

    nop

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

.method public a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 18
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Le/f/d/d0/g0/m;->a:Le/f/d/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/d/q;->a(Ljava/lang/Class;)Le/f/d/a0;

    move-result-object v0

    .line 20
    instance-of v1, v0, Le/f/d/d0/g0/m;

    if-eqz v1, :cond_1

    .line 21
    invoke-virtual {p1}, Le/f/d/f0/g;->m()Le/f/d/f0/g;

    .line 22
    invoke-virtual {p1}, Le/f/d/f0/g;->o()Le/f/d/f0/g;

    return-void

    .line 23
    :cond_1
    invoke-virtual {v0, p1, p2}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    return-void
.end method
