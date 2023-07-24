.class public Le/a/a/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Le/a/a/p;


# direct methods
.method public constructor <init>(Le/a/a/p;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/a/a/m;->d:Le/a/a/p;

    iput-object p2, p0, Le/a/a/m;->b:Ljava/lang/String;

    iput-wide p3, p0, Le/a/a/m;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/a/a/m;->d:Le/a/a/p;

    invoke-static {v0}, Le/a/a/p;->b(Le/a/a/p;)Le/a/a/z;

    move-result-object v0

    iget-object v1, p0, Le/a/a/m;->b:Ljava/lang/String;

    iget-wide v2, p0, Le/a/a/m;->c:J

    invoke-virtual {v0, v1, v2, v3}, Le/a/a/z;->a(Ljava/lang/String;J)V

    .line 2
    iget-object v0, p0, Le/a/a/m;->d:Le/a/a/p;

    invoke-static {v0}, Le/a/a/p;->b(Le/a/a/p;)Le/a/a/z;

    move-result-object v0

    iget-object v1, p0, Le/a/a/m;->d:Le/a/a/p;

    invoke-virtual {v1}, Le/a/a/p;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/a/a/z;->a(Ljava/lang/String;)V

    return-void
.end method
