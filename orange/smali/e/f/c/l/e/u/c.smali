.class public Le/f/c/l/e/u/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Le/f/c/l/e/o/q3/i;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Le/f/a/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/e<",
            "Le/f/c/l/e/o/o3;",
            "[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Le/f/a/a/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/f<",
            "Le/f/c/l/e/o/o3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/f/c/l/e/o/q3/i;

    invoke-direct {v0}, Le/f/c/l/e/o/q3/i;-><init>()V

    sput-object v0, Le/f/c/l/e/u/c;->b:Le/f/c/l/e/o/q3/i;

    const-string v0, "hts/cahyiseot-agolai.o/1frlglgc/aclg"

    const-string v1, "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"

    .line 2
    invoke-static {v0, v1}, Le/f/c/l/e/u/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/u/c;->c:Ljava/lang/String;

    const-string v0, "AzSBpY4F0rHiHFdinTvM"

    const-string v1, "IayrSTFL9eJ69YeSUO2"

    .line 3
    invoke-static {v0, v1}, Le/f/c/l/e/u/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/u/c;->d:Ljava/lang/String;

    .line 4
    invoke-static {}, Le/f/c/l/e/u/b;->a()Le/f/a/a/e;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/u/c;->e:Le/f/a/a/e;

    return-void
.end method

.method public constructor <init>(Le/f/a/a/f;Le/f/a/a/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/f<",
            "Le/f/c/l/e/o/o3;",
            ">;",
            "Le/f/a/a/e<",
            "Le/f/c/l/e/o/o3;",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/u/c;->a:Le/f/a/a/f;

    return-void
.end method

.method public static a(Landroid/content/Context;)Le/f/c/l/e/u/c;
    .locals 4

    .line 2
    invoke-static {p0}, Le/f/a/a/j/c0;->a(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Le/f/a/a/j/c0;->b()Le/f/a/a/j/c0;

    move-result-object p0

    new-instance v0, Le/f/a/a/i/a;

    sget-object v1, Le/f/c/l/e/u/c;->c:Ljava/lang/String;

    sget-object v2, Le/f/c/l/e/u/c;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Le/f/a/a/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, v0}, Le/f/a/a/j/c0;->a(Le/f/a/a/j/m;)Le/f/a/a/g;

    move-result-object p0

    const-class v0, Le/f/c/l/e/o/o3;

    const-string v1, "json"

    .line 5
    invoke-static {v1}, Le/f/a/a/b;->a(Ljava/lang/String;)Le/f/a/a/b;

    move-result-object v1

    sget-object v2, Le/f/c/l/e/u/c;->e:Le/f/a/a/e;

    const-string v3, "FIREBASE_CRASHLYTICS_REPORT"

    .line 6
    invoke-interface {p0, v3, v0, v1, v2}, Le/f/a/a/g;->a(Ljava/lang/String;Ljava/lang/Class;Le/f/a/a/b;Le/f/a/a/e;)Le/f/a/a/f;

    move-result-object p0

    .line 7
    new-instance v0, Le/f/c/l/e/u/c;

    sget-object v1, Le/f/c/l/e/u/c;->e:Le/f/a/a/e;

    invoke-direct {v0, p0, v1}, Le/f/c/l/e/u/c;-><init>(Le/f/a/a/f;Le/f/a/a/e;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 23
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic a(Le/f/a/b/h/h;Le/f/c/l/e/m/e1;Ljava/lang/Exception;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p0, p2}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z

    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/o/o3;)[B
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/u/c;->b:Le/f/c/l/e/o/q3/i;

    invoke-virtual {v0, p0}, Le/f/c/l/e/o/q3/i;->a(Le/f/c/l/e/o/o3;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Le/f/c/l/e/m/e1;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/m/e1;",
            ")",
            "Le/f/a/b/h/g<",
            "Le/f/c/l/e/m/e1;",
            ">;"
        }
    .end annotation

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/m/e1;->a()Le/f/c/l/e/o/o3;

    move-result-object v0

    .line 9
    new-instance v1, Le/f/a/b/h/h;

    invoke-direct {v1}, Le/f/a/b/h/h;-><init>()V

    .line 10
    iget-object v2, p0, Le/f/c/l/e/u/c;->a:Le/f/a/a/f;

    .line 11
    invoke-static {v0}, Le/f/a/a/c;->b(Ljava/lang/Object;)Le/f/a/a/c;

    move-result-object v0

    invoke-static {v1, p1}, Le/f/c/l/e/u/a;->a(Le/f/a/b/h/h;Le/f/c/l/e/m/e1;)Le/f/a/a/h;

    move-result-object p1

    .line 12
    invoke-interface {v2, v0, p1}, Le/f/a/a/f;->a(Le/f/a/a/c;Le/f/a/a/h;)V

    .line 13
    invoke-virtual {v1}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
