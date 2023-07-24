.class public final Le/f/c/l/e/o/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/v2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/m;

    invoke-direct {v0}, Le/f/c/l/e/o/m;-><init>()V

    sput-object v0, Le/f/c/l/e/o/m;->a:Le/f/c/l/e/o/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/v2;Le/f/c/n/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/v2;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "name"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/v2;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "code"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/v2;->a()J

    move-result-wide v0

    const-string p1, "address"

    invoke-interface {p2, p1, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

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
    check-cast p1, Le/f/c/l/e/o/v2;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/m;->a(Le/f/c/l/e/o/v2;Le/f/c/n/d;)V

    return-void
.end method
