.class public final Le/f/c/s/u/b;
.super Le/f/c/s/u/h;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Le/f/c/s/u/m;

.field public e:Le/f/c/s/u/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/c/s/u/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/s/u/i;)Le/f/c/s/u/h;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/c/s/u/b;->e:Le/f/c/s/u/i;

    return-object p0
.end method

.method public a(Le/f/c/s/u/m;)Le/f/c/s/u/h;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/c/s/u/b;->d:Le/f/c/s/u/m;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/c/s/u/h;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/u/b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a()Le/f/c/s/u/j;
    .locals 8

    .line 4
    new-instance v7, Le/f/c/s/u/c;

    iget-object v1, p0, Le/f/c/s/u/b;->a:Ljava/lang/String;

    iget-object v2, p0, Le/f/c/s/u/b;->b:Ljava/lang/String;

    iget-object v3, p0, Le/f/c/s/u/b;->c:Ljava/lang/String;

    iget-object v4, p0, Le/f/c/s/u/b;->d:Le/f/c/s/u/m;

    iget-object v5, p0, Le/f/c/s/u/b;->e:Le/f/c/s/u/i;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Le/f/c/s/u/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/s/u/m;Le/f/c/s/u/i;Le/f/c/s/u/a;)V

    return-object v7
.end method

.method public b(Ljava/lang/String;)Le/f/c/s/u/h;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/u/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Le/f/c/s/u/h;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/u/b;->a:Ljava/lang/String;

    return-object p0
.end method
