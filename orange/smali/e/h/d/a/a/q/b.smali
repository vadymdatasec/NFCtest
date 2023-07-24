.class public Le/h/d/a/a/q/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:[J

.field public d:Le/h/d/a/a/q/c$a;

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Le/h/d/a/a/a;->black:I

    iput v0, p0, Le/h/d/a/a/q/b;->g:I

    const-string v0, ""

    .line 3
    iput-object v0, p0, Le/h/d/a/a/q/b;->a:Ljava/lang/String;

    const v0, 0x108009b

    .line 4
    iput v0, p0, Le/h/d/a/a/q/b;->b:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Le/h/d/a/a/q/b;->c:[J

    const/4 v1, -0x1

    .line 6
    iput v1, p0, Le/h/d/a/a/q/b;->f:I

    .line 7
    iput-object v0, p0, Le/h/d/a/a/q/b;->d:Le/h/d/a/a/q/c$a;

    .line 8
    iput v1, p0, Le/h/d/a/a/q/b;->e:I

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/q/b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/q/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Le/h/d/a/a/q/b;)I
    .locals 0

    .line 1
    iget p0, p0, Le/h/d/a/a/q/b;->b:I

    return p0
.end method

.method public static synthetic c(Le/h/d/a/a/q/b;)[J
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/q/b;->c:[J

    return-object p0
.end method

.method public static synthetic d(Le/h/d/a/a/q/b;)I
    .locals 0

    .line 1
    iget p0, p0, Le/h/d/a/a/q/b;->f:I

    return p0
.end method

.method public static synthetic e(Le/h/d/a/a/q/b;)Le/h/d/a/a/q/c$a;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/q/b;->d:Le/h/d/a/a/q/c$a;

    return-object p0
.end method

.method public static synthetic f(Le/h/d/a/a/q/b;)I
    .locals 0

    .line 1
    iget p0, p0, Le/h/d/a/a/q/b;->e:I

    return p0
.end method

.method public static synthetic g(Le/h/d/a/a/q/b;)I
    .locals 0

    .line 1
    iget p0, p0, Le/h/d/a/a/q/b;->g:I

    return p0
.end method


# virtual methods
.method public a(I)Le/h/d/a/a/q/b;
    .locals 0

    .line 5
    iput p1, p0, Le/h/d/a/a/q/b;->g:I

    return-object p0
.end method

.method public a(IIZ)Le/h/d/a/a/q/b;
    .locals 1

    .line 4
    new-instance v0, Le/h/d/a/a/q/c$a;

    invoke-direct {v0, p1, p2, p3}, Le/h/d/a/a/q/c$a;-><init>(IIZ)V

    iput-object v0, p0, Le/h/d/a/a/q/b;->d:Le/h/d/a/a/q/c$a;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/h/d/a/a/q/b;
    .locals 0

    .line 2
    iput-object p1, p0, Le/h/d/a/a/q/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public varargs a([J)Le/h/d/a/a/q/b;
    .locals 0

    .line 3
    iput-object p1, p0, Le/h/d/a/a/q/b;->c:[J

    return-object p0
.end method

.method public a()Le/h/d/a/a/q/c;
    .locals 2

    .line 6
    new-instance v0, Le/h/d/a/a/q/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/h/d/a/a/q/c;-><init>(Le/h/d/a/a/q/b;Le/h/d/a/a/q/a;)V

    return-object v0
.end method

.method public b(I)Le/h/d/a/a/q/b;
    .locals 0

    .line 2
    iput p1, p0, Le/h/d/a/a/q/b;->b:I

    return-object p0
.end method

.method public c(I)Le/h/d/a/a/q/b;
    .locals 0

    .line 2
    iput p1, p0, Le/h/d/a/a/q/b;->e:I

    return-object p0
.end method

.method public d(I)Le/h/d/a/a/q/b;
    .locals 0

    .line 2
    iput p1, p0, Le/h/d/a/a/q/b;->f:I

    return-object p0
.end method
