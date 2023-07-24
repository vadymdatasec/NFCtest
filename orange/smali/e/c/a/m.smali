.class public Le/c/a/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Le/c/a/m;

.field public static final d:Le/c/a/m;


# instance fields
.field public a:Le/c/a/k;

.field public b:Le/c/a/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/c/a/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    .line 2
    new-instance v0, Le/c/a/m;

    sget-object v2, Le/c/a/k;->b:Le/c/a/k;

    invoke-direct {v0, v2, v1}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    sput-object v0, Le/c/a/m;->c:Le/c/a/m;

    .line 3
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->g:Le/c/a/k;

    sget-object v2, Le/c/a/l;->b:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    sput-object v0, Le/c/a/m;->d:Le/c/a/m;

    .line 4
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->c:Le/c/a/k;

    sget-object v2, Le/c/a/l;->b:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    .line 5
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->k:Le/c/a/k;

    sget-object v2, Le/c/a/l;->b:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    .line 6
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->d:Le/c/a/k;

    sget-object v2, Le/c/a/l;->b:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    .line 7
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->j:Le/c/a/k;

    sget-object v2, Le/c/a/l;->b:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    .line 8
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->g:Le/c/a/k;

    sget-object v2, Le/c/a/l;->c:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    .line 9
    new-instance v0, Le/c/a/m;

    sget-object v1, Le/c/a/k;->c:Le/c/a/k;

    sget-object v2, Le/c/a/l;->c:Le/c/a/l;

    invoke-direct {v0, v1, v2}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    return-void
.end method

.method public constructor <init>(Le/c/a/k;Le/c/a/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/c/a/m;->a:Le/c/a/k;

    .line 3
    iput-object p2, p0, Le/c/a/m;->b:Le/c/a/l;

    return-void
.end method


# virtual methods
.method public a()Le/c/a/k;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/m;->a:Le/c/a/k;

    return-object v0
.end method

.method public b()Le/c/a/l;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/m;->b:Le/c/a/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 1
    :cond_1
    const-class v2, Le/c/a/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 2
    :cond_2
    check-cast p1, Le/c/a/m;

    .line 3
    iget-object v2, p0, Le/c/a/m;->a:Le/c/a/k;

    iget-object v3, p1, Le/c/a/m;->a:Le/c/a/k;

    if-eq v2, v3, :cond_3

    return v1

    .line 4
    :cond_3
    iget-object v2, p0, Le/c/a/m;->b:Le/c/a/l;

    iget-object p1, p1, Le/c/a/m;->b:Le/c/a/l;

    if-eq v2, p1, :cond_4

    return v1

    :cond_4
    return v0
.end method
