.class public Le/f/c/l/e/m/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/m/n0;


# instance fields
.field public final synthetic a:Le/f/c/l/e/m/b2;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/b2;)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/c/l/e/m/y;->a:Le/f/c/l/e/m/b2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/s/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/y;->a:Le/f/c/l/e/m/b2;

    invoke-virtual {v0}, Le/f/c/l/e/m/b2;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Le/f/c/l/e/s/f;->a(Le/f/c/l/e/s/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
