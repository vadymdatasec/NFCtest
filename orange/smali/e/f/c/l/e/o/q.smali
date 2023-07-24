.class public final Le/f/c/l/e/o/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/h3;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/q;

    invoke-direct {v0}, Le/f/c/l/e/o/q;-><init>()V

    sput-object v0, Le/f/c/l/e/o/q;->a:Le/f/c/l/e/o/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/h3;Le/f/c/n/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->d()J

    move-result-wide v0

    const-string v2, "timestamp"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->a()Le/f/c/l/e/o/b3;

    move-result-object v0

    const-string v1, "app"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->b()Le/f/c/l/e/o/e3;

    move-result-object v0

    const-string v1, "device"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->c()Le/f/c/l/e/o/g3;

    move-result-object p1

    const-string v0, "log"

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
    check-cast p1, Le/f/c/l/e/o/h3;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/q;->a(Le/f/c/l/e/o/h3;Le/f/c/n/d;)V

    return-void
.end method
