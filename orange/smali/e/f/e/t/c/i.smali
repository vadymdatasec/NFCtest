.class public final Le/f/e/t/c/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/t/c/d;

.field public final b:Le/f/e/t/c/d;

.field public final c:Le/f/e/t/c/d;


# direct methods
.method public constructor <init>([Le/f/e/t/c/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    aget-object v0, p1, v0

    iput-object v0, p0, Le/f/e/t/c/i;->a:Le/f/e/t/c/d;

    const/4 v0, 0x1

    .line 3
    aget-object v0, p1, v0

    iput-object v0, p0, Le/f/e/t/c/i;->b:Le/f/e/t/c/d;

    const/4 v0, 0x2

    .line 4
    aget-object p1, p1, v0

    iput-object p1, p0, Le/f/e/t/c/i;->c:Le/f/e/t/c/d;

    return-void
.end method


# virtual methods
.method public a()Le/f/e/t/c/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/t/c/i;->a:Le/f/e/t/c/d;

    return-object v0
.end method

.method public b()Le/f/e/t/c/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/t/c/i;->b:Le/f/e/t/c/d;

    return-object v0
.end method

.method public c()Le/f/e/t/c/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/t/c/i;->c:Le/f/e/t/c/d;

    return-object v0
.end method
