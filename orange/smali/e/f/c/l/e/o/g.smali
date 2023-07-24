.class public final Le/f/c/l/e/o/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/n2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/g;

    invoke-direct {v0}, Le/f/c/l/e/o/g;-><init>()V

    sput-object v0, Le/f/c/l/e/o/g;->a:Le/f/c/l/e/o/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/n2;Le/f/c/n/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->a()I

    move-result v0

    const-string v1, "arch"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "model"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->b()I

    move-result v0

    const-string v1, "cores"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->g()J

    move-result-wide v0

    const-string v2, "ram"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->c()J

    move-result-wide v0

    const-string v2, "diskSpace"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->i()Z

    move-result v0

    const-string v1, "simulator"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Z)Le/f/c/n/d;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->h()I

    move-result v0

    const-string v1, "state"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "manufacturer"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 10
    invoke-virtual {p1}, Le/f/c/l/e/o/n2;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "modelClass"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Le/f/c/l/e/o/n2;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/g;->a(Le/f/c/l/e/o/n2;Le/f/c/n/d;)V

    return-void
.end method
