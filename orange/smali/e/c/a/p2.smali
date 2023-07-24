.class public Le/c/a/p2;
.super Lorg/xml/sax/ext/DefaultHandler2;
.source "SourceFile"


# static fields
.field public static j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Le/c/a/b0;",
            ">;"
        }
    .end annotation
.end field

.field public static l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Le/c/a/r0;",
            ">;"
        }
    .end annotation
.end field

.field public static n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Le/c/a/k;",
            ">;"
        }
    .end annotation
.end field

.field public static o:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static synthetic p:[I


# instance fields
.field public a:Le/c/a/a2;

.field public b:Le/c/a/d1;

.field public c:Z

.field public d:I

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/StringBuilder;

.field public h:Z

.field public i:Ljava/lang/StringBuilder;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    .line 2
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Le/c/a/p2;->m:Ljava/util/HashMap;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    .line 6
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    .line 7
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xf0f8ff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "aliceblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfaebd7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "antiquewhite"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "aqua"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x7fffd4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "aquamarine"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xf0ffff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "azure"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xf5f5dc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "beige"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xffe4c4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "bisque"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "black"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xffebcd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "blanchedalmond"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/16 v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "blue"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x8a2be2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "blueviolet"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xa52a2a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "brown"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xdeb887

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "burlywood"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x5f9ea0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "cadetblue"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x7fff00

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "chartreuse"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xd2691e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "chocolate"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xff7f50

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "coral"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x6495ed

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "cornflowerblue"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xfff8dc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "cornsilk"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xdc143c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "crimson"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v2, "cyan"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/16 v1, 0x8b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x8b8b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkcyan"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xb8860b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkgoldenrod"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xa9a9a9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkgray"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/16 v2, 0x6400

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "darkgreen"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v2, "darkgrey"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xbdb76b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkkhaki"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x8b008b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkmagenta"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x556b2f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkolivegreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xff8c00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkorange"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x9932cc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkorchid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/high16 v1, 0x8b0000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkred"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xe9967a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darksalmon"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x8fbc8f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkseagreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x483d8b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkslateblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x2f4f4f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkslategray"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v2, "darkslategrey"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xced1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkturquoise"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x9400d3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkviolet"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xff1493

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "deeppink"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xbfff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "deepskyblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x696969

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "dimgray"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v2, "dimgrey"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x1e90ff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "dodgerblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xb22222

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "firebrick"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfffaf0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "floralwhite"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x228b22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "forestgreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xff00ff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "fuchsia"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xdcdcdc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "gainsboro"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xf8f8ff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "ghostwhite"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xffd700

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "gold"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xdaa520

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "goldenrod"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x808080

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "gray"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v3, 0x8000

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "green"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v3, 0xadff2f

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "greenyellow"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v3, "grey"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xf0fff0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "honeydew"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xff69b4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "hotpink"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xcd5c5c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "indianred"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x4b0082

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "indigo"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xfffff0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "ivory"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xf0e68c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "khaki"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xe6e6fa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lavender"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xfff0f5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lavenderblush"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x7cfc00

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lawngreen"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xfffacd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lemonchiffon"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xadd8e6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightblue"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xf08080

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightcoral"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xe0ffff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightcyan"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xfafad2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightgoldenrodyellow"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xd3d3d3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightgray"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v3, 0x90ee90

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "lightgreen"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v3, "lightgrey"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xffb6c1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightpink"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xffa07a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightsalmon"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x20b2aa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightseagreen"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x87cefa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightskyblue"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x778899

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightslategray"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v3, "lightslategrey"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xb0c4de

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightsteelblue"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xffffe0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lightyellow"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xff00

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "lime"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0x32cd32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "limegreen"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v2, 0xfaf0e6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "linen"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v2, "magenta"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/high16 v1, 0x800000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "maroon"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x66cdaa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumaquamarine"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/16 v1, 0xcd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xba55d3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumorchid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x9370db

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumpurple"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x3cb371

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumseagreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x7b68ee

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumslateblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfa9a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumspringgreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x48d1cc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumturquoise"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xc71585

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mediumvioletred"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x191970

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "midnightblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xf5fffa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mintcream"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffe4e1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mistyrose"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffe4b5    # 2.3500096E-38f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "moccasin"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffdead

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "navajowhite"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/16 v1, 0x80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "navy"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfdf5e6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "oldlace"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x808000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "olive"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x6b8e23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "olivedrab"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffa500

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "orange"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xff4500

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "orangered"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xda70d6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "orchid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xeee8aa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "palegoldenrod"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x98fb98

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "palegreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xafeeee

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "paleturquoise"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xdb7093

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "palevioletred"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffefd5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "papayawhip"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffdab9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "peachpuff"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xcd853f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "peru"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffc0cb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "pink"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xdda0dd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "plum"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xb0e0e6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "powderblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x800080

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "purple"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const/high16 v1, 0xff0000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "red"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xbc8f8f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "rosybrown"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x4169e1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "royalblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x8b4513

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "saddlebrown"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfa8072

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "salmon"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xf4a460

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "sandybrown"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x2e8b57

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "seagreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfff5ee

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "seashell"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xa0522d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "sienna"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xc0c0c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "silver"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x87ceeb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "skyblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x6a5acd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "slateblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x708090

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "slategray"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const-string v2, "slategrey"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xfffafa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "snow"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xff7f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "springgreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x4682b4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "steelblue"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xd2b48c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "tan"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x8080

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "teal"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xd8bfd8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "thistle"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xff6347

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "tomato"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x40e0d0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "turquoise"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xee82ee

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "violet"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xf5deb3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "wheat"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "white"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xf5f5f5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "whitesmoke"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0xffff00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "yellow"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    const v1, 0x9acd32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "yellowgreen"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const v3, 0x3f31a9fc    # 0.694f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "xx-small"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const v3, 0x3f553f7d    # 0.833f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "x-small"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "small"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "medium"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const v3, 0x41666666    # 14.4f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "large"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const v3, 0x418a6666    # 17.3f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "x-large"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->h:Le/c/a/x1;

    const v3, 0x41a5999a    # 20.7f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "xx-large"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->j:Le/c/a/x1;

    const v3, 0x42a6a8f6    # 83.33f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "smaller"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    new-instance v1, Le/c/a/b0;

    sget-object v2, Le/c/a/x1;->j:Le/c/a/x1;

    const/high16 v3, 0x42f00000    # 120.0f

    invoke-direct {v1, v3, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    const-string v2, "larger"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v1, 0x190

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "normal"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v3, 0x2bc

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bold"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "bolder"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/4 v4, -0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "lighter"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "100"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v4, 0xc8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "200"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v4, 0x12c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "300"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const-string v4, "400"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v1, 0x1f4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "500"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v1, 0x258

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "600"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const-string v1, "700"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v1, 0x320

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "800"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    const/16 v1, 0x384

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "900"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    sget-object v0, Le/c/a/p2;->m:Ljava/util/HashMap;

    sget-object v1, Le/c/a/r0;->b:Le/c/a/r0;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    sget-object v0, Le/c/a/p2;->m:Ljava/util/HashMap;

    sget-object v1, Le/c/a/r0;->c:Le/c/a/r0;

    const-string v2, "italic"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    sget-object v0, Le/c/a/p2;->m:Ljava/util/HashMap;

    sget-object v1, Le/c/a/r0;->d:Le/c/a/r0;

    const-string v2, "oblique"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->b:Le/c/a/k;

    const-string v2, "none"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->c:Le/c/a/k;

    const-string v2, "xMinYMin"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->d:Le/c/a/k;

    const-string v2, "xMidYMin"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->e:Le/c/a/k;

    const-string v2, "xMaxYMin"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->f:Le/c/a/k;

    const-string v2, "xMinYMid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->g:Le/c/a/k;

    const-string v2, "xMidYMid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->h:Le/c/a/k;

    const-string v2, "xMaxYMid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->i:Le/c/a/k;

    const-string v2, "xMinYMax"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->j:Le/c/a/k;

    const-string v2, "xMidYMax"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    sget-object v0, Le/c/a/p2;->n:Ljava/util/HashMap;

    sget-object v1, Le/c/a/k;->k:Le/c/a/k;

    const-string v2, "xMaxYMax"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Structure"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "BasicStructure"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 191
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "ConditionalProcessing"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 192
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Image"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 193
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Style"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "ViewportAttribute"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 195
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Shape"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 196
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "BasicText"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 197
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "PaintAttribute"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "BasicPaintAttribute"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 199
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "OpacityAttribute"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 200
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "BasicGraphicsAttribute"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 201
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Marker"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 202
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Gradient"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 203
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Pattern"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Clip"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 205
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "BasicClip"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 206
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "Mask"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    sget-object v0, Le/c/a/p2;->o:Ljava/util/HashSet;

    const-string v1, "View"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/ext/DefaultHandler2;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/c/a/p2;->a:Le/c/a/a2;

    .line 3
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Le/c/a/p2;->c:Z

    .line 5
    iput-boolean v1, p0, Le/c/a/p2;->e:Z

    .line 6
    iput-object v0, p0, Le/c/a/p2;->f:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    .line 8
    iput-boolean v1, p0, Le/c/a/p2;->h:Z

    .line 9
    iput-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static A(Ljava/lang/String;)Le/c/a/w0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "ltr"

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    sget-object p0, Le/c/a/w0;->b:Le/c/a/w0;

    return-object p0

    :cond_0
    const-string v0, "rtl"

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    sget-object p0, Le/c/a/w0;->c:Le/c/a/w0;

    return-object p0

    .line 16
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid direction property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static B(Ljava/lang/String;)Le/c/a/x0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "none"

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object p0, Le/c/a/x0;->b:Le/c/a/x0;

    return-object p0

    :cond_0
    const-string v0, "non-scaling-stroke"

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    sget-object p0, Le/c/a/x0;->c:Le/c/a/x0;

    return-object p0

    .line 17
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid vector-effect property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static C(Ljava/lang/String;)Le/c/a/n;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 3
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object p0

    .line 4
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 5
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v1

    .line 6
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 7
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 8
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 9
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v0

    if-eqz p0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-ltz v3, :cond_1

    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpg-float v3, v3, v4

    if-ltz v3, :cond_0

    .line 12
    new-instance v3, Le/c/a/n;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-direct {v3, p0, v1, v2, v0}, Le/c/a/n;-><init>(FFFF)V

    return-object v3

    .line 13
    :cond_0
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid viewBox. height cannot be negative"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 14
    :cond_1
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid viewBox. width cannot be negative"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_2
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid viewBox definition - should have four numbers"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Le/c/a/o2;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 418
    invoke-virtual {p0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/16 v1, 0x25

    .line 419
    invoke-virtual {p0, v1}, Le/c/a/o2;->a(C)Z

    move-result p0

    if-eqz p0, :cond_0

    const/high16 p0, 0x43800000    # 256.0f

    mul-float v0, v0, p0

    const/high16 p0, 0x42c80000    # 100.0f

    div-float/2addr v0, p0

    :cond_0
    const/4 p0, 0x0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const/high16 p0, 0x437f0000    # 255.0f

    cmpl-float p0, v0, p0

    if-lez p0, :cond_2

    const/16 p0, 0xff

    goto :goto_0

    :cond_2
    float-to-int p0, v0

    :goto_0
    return p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "none"

    .line 442
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "url("

    .line 443
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x4

    .line 444
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 445
    :cond_1
    new-instance p0, Lorg/xml/sax/SAXException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bad "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " attribute. Expected \"none\" or \"url()\" format"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Le/c/a/f1;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 288
    new-instance v0, Le/c/a/o2;

    const-string v1, "/\\*.*?\\*/"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/16 p1, 0x3a

    .line 289
    invoke-virtual {v0, p1}, Le/c/a/o2;->b(C)Ljava/lang/String;

    move-result-object v1

    .line 290
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 291
    invoke-virtual {v0, p1}, Le/c/a/o2;->a(C)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 292
    :cond_1
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    const/16 p1, 0x3b

    .line 293
    invoke-virtual {v0, p1}, Le/c/a/o2;->b(C)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :goto_1
    return-void

    .line 294
    :cond_2
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 295
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0, p1}, Le/c/a/o2;->a(C)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 296
    :cond_3
    iget-object p1, p0, Le/c/a/f1;->f:Le/c/a/y0;

    if-nez p1, :cond_4

    .line 297
    new-instance p1, Le/c/a/y0;

    invoke-direct {p1}, Le/c/a/y0;-><init>()V

    iput-object p1, p0, Le/c/a/f1;->f:Le/c/a/y0;

    .line 298
    :cond_4
    iget-object p1, p0, Le/c/a/f1;->f:Le/c/a/y0;

    invoke-static {p1, v1, v2}, Le/c/a/p2;->a(Le/c/a/y0;Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    goto :goto_0
.end method

.method public static a(Le/c/a/j1;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 402
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p1}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 403
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 404
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v1

    const-string v2, "defer"

    .line 405
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 406
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 407
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v1

    .line 408
    :cond_0
    sget-object v2, Le/c/a/p2;->n:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/k;

    .line 409
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 410
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v2

    if-nez v2, :cond_3

    .line 411
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v0

    const-string v2, "meet"

    .line 412
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 413
    sget-object p1, Le/c/a/l;->b:Le/c/a/l;

    goto :goto_0

    :cond_1
    const-string v2, "slice"

    .line 414
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 415
    sget-object p1, Le/c/a/l;->c:Le/c/a/l;

    goto :goto_0

    .line 416
    :cond_2
    new-instance p0, Lorg/xml/sax/SAXException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid preserveAspectRatio definition: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 p1, 0x0

    .line 417
    :goto_0
    new-instance v0, Le/c/a/m;

    invoke-direct {v0, v1, p1}, Le/c/a/m;-><init>(Le/c/a/k;Le/c/a/l;)V

    iput-object v0, p0, Le/c/a/j1;->n:Le/c/a/m;

    return-void
.end method

.method public static a(Le/c/a/y0;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x7c

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "|caption|icon|menu|message-box|small-caption|status-bar|"

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-void

    .line 421
    :cond_0
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p1}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    move-object v1, p1

    move-object v2, v1

    :goto_0
    const/16 v3, 0x2f

    .line 422
    invoke-virtual {v0, v3}, Le/c/a/o2;->b(C)Ljava/lang/String;

    move-result-object v4

    .line 423
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    if-eqz v4, :cond_a

    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "normal"

    .line 424
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    .line 425
    sget-object p1, Le/c/a/p2;->l:Ljava/util/HashMap;

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    .line 426
    sget-object v1, Le/c/a/p2;->m:Ljava/util/HashMap;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/r0;

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    if-nez v2, :cond_5

    const-string v2, "small-caps"

    .line 427
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, v4

    goto :goto_0

    .line 428
    :cond_5
    :goto_1
    invoke-static {v4}, Le/c/a/p2;->k(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    .line 429
    invoke-virtual {v0, v3}, Le/c/a/o2;->a(C)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 430
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 431
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 432
    invoke-static {v3}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    .line 433
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    goto :goto_2

    .line 434
    :cond_6
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string p1, "Invalid font style attribute: missing line-height"

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 435
    :cond_7
    :goto_2
    invoke-virtual {v0}, Le/c/a/o2;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/c/a/p2;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 436
    iput-object v0, p0, Le/c/a/y0;->p:Ljava/util/List;

    .line 437
    iput-object v2, p0, Le/c/a/y0;->q:Le/c/a/b0;

    if-nez p1, :cond_8

    const/16 p1, 0x190

    goto :goto_3

    .line 438
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->r:Ljava/lang/Integer;

    if-nez v1, :cond_9

    .line 439
    sget-object v1, Le/c/a/r0;->b:Le/c/a/r0;

    :cond_9
    iput-object v1, p0, Le/c/a/y0;->s:Le/c/a/r0;

    .line 440
    iget-wide v0, p0, Le/c/a/y0;->b:J

    const-wide/32 v2, 0x1e000

    or-long/2addr v0, v2

    iput-wide v0, p0, Le/c/a/y0;->b:J

    return-void

    .line 441
    :cond_a
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string p1, "Invalid font style attribute: missing font size and family"

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Le/c/a/y0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 300
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "inherit"

    .line 301
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 302
    :cond_1
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v0

    invoke-static {p1}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_14

    const/4 v1, 0x3

    if-eq v0, v1, :cond_13

    const/4 v1, 0x5

    if-eq v0, v1, :cond_12

    const/4 v1, 0x6

    if-eq v0, v1, :cond_11

    const/16 v1, 0x9

    if-eq v0, v1, :cond_10

    const/16 v1, 0x24

    if-eq v0, v1, :cond_f

    const/16 v1, 0x29

    if-eq v0, v1, :cond_e

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_d

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_c

    const/16 v1, 0x3b

    const-string v2, "currentColor"

    if-eq v0, v1, :cond_a

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_9

    const/16 v1, 0x4b

    if-eq v0, v1, :cond_8

    const/16 v1, 0x4c

    if-eq v0, v1, :cond_7

    const/4 v1, -0x1

    const-string v3, "none"

    const/16 v4, 0x7c

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    goto/16 :goto_4

    .line 303
    :pswitch_0
    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|visible|hidden|collapse|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v1, :cond_2

    const-string p1, "visible"

    .line 304
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->C:Ljava/lang/Boolean;

    .line 305
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x2000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 306
    :cond_2
    new-instance p0, Lorg/xml/sax/SAXException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Invalid value for \"visibility\" attribute: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 307
    :pswitch_1
    invoke-static {p2}, Le/c/a/p2;->p(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->L:Ljava/lang/Float;

    .line 308
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide v0, 0x400000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 309
    :pswitch_2
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 310
    invoke-static {}, Le/c/a/s;->a()Le/c/a/s;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->K:Le/c/a/i1;

    goto :goto_0

    .line 311
    :cond_3
    invoke-static {p2}, Le/c/a/p2;->e(Ljava/lang/String;)Le/c/a/r;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->K:Le/c/a/i1;

    .line 312
    :goto_0
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide v0, 0x200000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 313
    :pswitch_3
    invoke-static {p2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->h:Le/c/a/b0;

    .line 314
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 315
    :pswitch_4
    invoke-static {p2}, Le/c/a/p2;->p(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->g:Ljava/lang/Float;

    .line 316
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 317
    :pswitch_5
    invoke-static {p2}, Le/c/a/p2;->i(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->k:Ljava/lang/Float;

    .line 318
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 319
    :pswitch_6
    invoke-static {p2}, Le/c/a/p2;->w(Ljava/lang/String;)Le/c/a/t0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->j:Le/c/a/t0;

    .line 320
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 321
    :pswitch_7
    invoke-static {p2}, Le/c/a/p2;->v(Ljava/lang/String;)Le/c/a/s0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->i:Le/c/a/s0;

    .line 322
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 323
    :pswitch_8
    invoke-static {p2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->m:Le/c/a/b0;

    .line 324
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 325
    :pswitch_9
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    .line 326
    iput-object p1, p0, Le/c/a/y0;->l:[Le/c/a/b0;

    goto :goto_1

    .line 327
    :cond_4
    invoke-static {p2}, Le/c/a/p2;->u(Ljava/lang/String;)[Le/c/a/b0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->l:[Le/c/a/b0;

    .line 328
    :goto_1
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x200

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    :pswitch_a
    const-string p1, "stroke"

    .line 329
    invoke-static {p2, p1}, Le/c/a/p2;->b(Ljava/lang/String;Ljava/lang/String;)Le/c/a/i1;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->f:Le/c/a/i1;

    .line 330
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 331
    :pswitch_b
    invoke-static {p2}, Le/c/a/p2;->p(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->E:Ljava/lang/Float;

    .line 332
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x8000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 333
    :pswitch_c
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 334
    invoke-static {}, Le/c/a/s;->a()Le/c/a/s;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->D:Le/c/a/i1;

    goto :goto_2

    .line 335
    :cond_5
    invoke-static {p2}, Le/c/a/p2;->e(Ljava/lang/String;)Le/c/a/r;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->D:Le/c/a/i1;

    .line 336
    :goto_2
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x4000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 337
    :pswitch_d
    invoke-static {p2, p1}, Le/c/a/p2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->A:Ljava/lang/String;

    .line 338
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x800000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 339
    :pswitch_e
    invoke-static {p2, p1}, Le/c/a/p2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->z:Ljava/lang/String;

    .line 340
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x400000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 341
    :pswitch_f
    invoke-static {p2, p1}, Le/c/a/p2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->y:Ljava/lang/String;

    .line 342
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x200000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 343
    :pswitch_10
    invoke-static {p2, p1}, Le/c/a/p2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->y:Ljava/lang/String;

    .line 344
    iput-object p1, p0, Le/c/a/y0;->z:Ljava/lang/String;

    .line 345
    iput-object p1, p0, Le/c/a/y0;->A:Ljava/lang/String;

    .line 346
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0xe00000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 347
    :pswitch_11
    invoke-static {p2}, Le/c/a/p2;->l(Ljava/lang/String;)Le/c/a/r0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->s:Le/c/a/r0;

    .line 348
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x10000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 349
    :pswitch_12
    invoke-static {p2}, Le/c/a/p2;->m(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->r:Ljava/lang/Integer;

    .line 350
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x8000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 351
    :pswitch_13
    invoke-static {p2}, Le/c/a/p2;->k(Ljava/lang/String;)Le/c/a/b0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->q:Le/c/a/b0;

    .line 352
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x4000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 353
    :pswitch_14
    invoke-static {p2}, Le/c/a/p2;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->p:Ljava/util/List;

    .line 354
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x2000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 355
    :pswitch_15
    invoke-static {p0, p2}, Le/c/a/p2;->a(Le/c/a/y0;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 356
    :pswitch_16
    invoke-static {p2}, Le/c/a/p2;->p(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->e:Ljava/lang/Float;

    .line 357
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 358
    :pswitch_17
    invoke-static {p2}, Le/c/a/p2;->h(Ljava/lang/String;)Le/c/a/q0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->d:Le/c/a/q0;

    .line 359
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    :pswitch_18
    const-string p1, "fill"

    .line 360
    invoke-static {p2, p1}, Le/c/a/p2;->b(Ljava/lang/String;Ljava/lang/String;)Le/c/a/i1;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->c:Le/c/a/i1;

    .line 361
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 362
    :pswitch_19
    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_6

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v1, :cond_6

    .line 363
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->B:Ljava/lang/Boolean;

    .line 364
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x1000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 365
    :cond_6
    new-instance p0, Lorg/xml/sax/SAXException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Invalid value for \"display\" attribute: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 366
    :cond_7
    invoke-static {p2}, Le/c/a/p2;->z(Ljava/lang/String;)Le/c/a/v0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->t:Le/c/a/v0;

    .line 367
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x20000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 368
    :cond_8
    invoke-static {p2}, Le/c/a/p2;->y(Ljava/lang/String;)Le/c/a/u0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->v:Le/c/a/u0;

    .line 369
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x40000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 370
    :cond_9
    invoke-static {p2}, Le/c/a/p2;->p(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->J:Ljava/lang/Float;

    .line 371
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide v0, 0x100000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 372
    :cond_a
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 373
    invoke-static {}, Le/c/a/s;->a()Le/c/a/s;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->I:Le/c/a/i1;

    goto :goto_3

    .line 374
    :cond_b
    invoke-static {p2}, Le/c/a/p2;->e(Ljava/lang/String;)Le/c/a/r;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->I:Le/c/a/i1;

    .line 375
    :goto_3
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide v0, 0x80000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 376
    :cond_c
    invoke-static {p2}, Le/c/a/p2;->B(Ljava/lang/String;)Le/c/a/x0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->M:Le/c/a/x0;

    .line 377
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide v0, 0x800000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto/16 :goto_4

    .line 378
    :cond_d
    invoke-static {p2}, Le/c/a/p2;->q(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->w:Ljava/lang/Boolean;

    .line 379
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x80000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 380
    :cond_e
    invoke-static {p2}, Le/c/a/p2;->p(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->n:Ljava/lang/Float;

    .line 381
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 382
    :cond_f
    invoke-static {p2, p1}, Le/c/a/p2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->H:Ljava/lang/String;

    .line 383
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x40000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 384
    :cond_10
    invoke-static {p2}, Le/c/a/p2;->A(Ljava/lang/String;)Le/c/a/w0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->u:Le/c/a/w0;

    .line 385
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide v0, 0x1000000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 386
    :cond_11
    invoke-static {p2}, Le/c/a/p2;->e(Ljava/lang/String;)Le/c/a/r;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->o:Le/c/a/r;

    .line 387
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/16 v0, 0x1000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 388
    :cond_12
    invoke-static {p2}, Le/c/a/p2;->h(Ljava/lang/String;)Le/c/a/q0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->G:Le/c/a/q0;

    .line 389
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x20000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 390
    :cond_13
    invoke-static {p2, p1}, Le/c/a/p2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->F:Ljava/lang/String;

    .line 391
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x10000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    goto :goto_4

    .line 392
    :cond_14
    invoke-static {p2}, Le/c/a/p2;->d(Ljava/lang/String;)Le/c/a/o;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->x:Le/c/a/o;

    .line 393
    iget-wide p1, p0, Le/c/a/y0;->b:J

    const-wide/32 v0, 0x100000

    or-long/2addr p1, v0

    iput-wide p1, p0, Le/c/a/y0;->b:J

    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1d
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3f
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x59
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic a()[I
    .locals 3

    .line 1
    sget-object v0, Le/c/a/p2;->p:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Le/c/a/n2;->values()[Le/c/a/n2;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Le/c/a/n2;->b:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Le/c/a/n2;->O0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x5c

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Le/c/a/n2;->c:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Le/c/a/n2;->e:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Le/c/a/n2;->d:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v1, Le/c/a/n2;->f:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Le/c/a/n2;->g:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v1, Le/c/a/n2;->h:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v1, Le/c/a/n2;->i:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v1, Le/c/a/n2;->o:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xe

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :try_start_a
    sget-object v1, Le/c/a/n2;->j:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :try_start_b
    sget-object v1, Le/c/a/n2;->p:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xf

    aput v2, v0, v1
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v1, Le/c/a/n2;->k:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    :try_start_d
    sget-object v1, Le/c/a/n2;->l:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xb

    aput v2, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :try_start_e
    sget-object v1, Le/c/a/n2;->q:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x10

    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    sget-object v1, Le/c/a/n2;->s:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x12

    aput v2, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    :try_start_10
    sget-object v1, Le/c/a/n2;->r:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x11

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :try_start_11
    sget-object v1, Le/c/a/n2;->t:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x13

    aput v2, v0, v1
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    :try_start_12
    sget-object v1, Le/c/a/n2;->u:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x14

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    :try_start_13
    sget-object v1, Le/c/a/n2;->v:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x15

    aput v2, v0, v1
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    :try_start_14
    sget-object v1, Le/c/a/n2;->x:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x17

    aput v2, v0, v1
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :try_start_15
    sget-object v1, Le/c/a/n2;->w:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x16

    aput v2, v0, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    :try_start_16
    sget-object v1, Le/c/a/n2;->m:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xc

    aput v2, v0, v1
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    :try_start_17
    sget-object v1, Le/c/a/n2;->n:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xd

    aput v2, v0, v1
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :try_start_18
    sget-object v1, Le/c/a/n2;->y:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x18

    aput v2, v0, v1
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    :try_start_19
    sget-object v1, Le/c/a/n2;->z:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x19

    aput v2, v0, v1
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :try_start_1a
    sget-object v1, Le/c/a/n2;->A:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1a

    aput v2, v0, v1
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    :try_start_1b
    sget-object v1, Le/c/a/n2;->B:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1b

    aput v2, v0, v1
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    :try_start_1c
    sget-object v1, Le/c/a/n2;->C:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1c

    aput v2, v0, v1
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    :try_start_1d
    sget-object v1, Le/c/a/n2;->D:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1d

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1e
    sget-object v1, Le/c/a/n2;->H:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x21

    aput v2, v0, v1
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    :try_start_1f
    sget-object v1, Le/c/a/n2;->I:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x22

    aput v2, v0, v1
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    :try_start_20
    sget-object v1, Le/c/a/n2;->J:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x23

    aput v2, v0, v1
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_20 .. :try_end_20} :catch_20

    :catch_20
    :try_start_21
    sget-object v1, Le/c/a/n2;->G:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x20

    aput v2, v0, v1
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_21} :catch_21

    :catch_21
    :try_start_22
    sget-object v1, Le/c/a/n2;->F:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1f

    aput v2, v0, v1
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_22} :catch_22

    :catch_22
    :try_start_23
    sget-object v1, Le/c/a/n2;->E:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1e

    aput v2, v0, v1
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_23} :catch_23

    :catch_23
    :try_start_24
    sget-object v1, Le/c/a/n2;->K:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x24

    aput v2, v0, v1
    :try_end_24
    .catch Ljava/lang/NoSuchFieldError; {:try_start_24 .. :try_end_24} :catch_24

    :catch_24
    :try_start_25
    sget-object v1, Le/c/a/n2;->L:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x25

    aput v2, v0, v1
    :try_end_25
    .catch Ljava/lang/NoSuchFieldError; {:try_start_25 .. :try_end_25} :catch_25

    :catch_25
    :try_start_26
    sget-object v1, Le/c/a/n2;->M:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x26

    aput v2, v0, v1
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_26} :catch_26

    :catch_26
    :try_start_27
    sget-object v1, Le/c/a/n2;->N:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x27

    aput v2, v0, v1
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_27} :catch_27

    :catch_27
    :try_start_28
    sget-object v1, Le/c/a/n2;->O:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x28

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_28} :catch_28

    :catch_28
    :try_start_29
    sget-object v1, Le/c/a/n2;->P:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x29

    aput v2, v0, v1
    :try_end_29
    .catch Ljava/lang/NoSuchFieldError; {:try_start_29 .. :try_end_29} :catch_29

    :catch_29
    :try_start_2a
    sget-object v1, Le/c/a/n2;->Q:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x2a

    aput v2, v0, v1
    :try_end_2a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2a .. :try_end_2a} :catch_2a

    :catch_2a
    :try_start_2b
    sget-object v1, Le/c/a/n2;->R:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x2b

    aput v2, v0, v1
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2b .. :try_end_2b} :catch_2b

    :catch_2b
    :try_start_2c
    sget-object v1, Le/c/a/n2;->S:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x2c

    aput v2, v0, v1
    :try_end_2c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2c .. :try_end_2c} :catch_2c

    :catch_2c
    :try_start_2d
    sget-object v1, Le/c/a/n2;->T:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x2d

    aput v2, v0, v1
    :try_end_2d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2d .. :try_end_2d} :catch_2d

    :catch_2d
    :try_start_2e
    sget-object v1, Le/c/a/n2;->U:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x2e

    aput v2, v0, v1
    :try_end_2e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2e .. :try_end_2e} :catch_2e

    :catch_2e
    :try_start_2f
    sget-object v1, Le/c/a/n2;->V:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x2f

    aput v2, v0, v1
    :try_end_2f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2f .. :try_end_2f} :catch_2f

    :catch_2f
    :try_start_30
    sget-object v1, Le/c/a/n2;->W:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x30

    aput v2, v0, v1
    :try_end_30
    .catch Ljava/lang/NoSuchFieldError; {:try_start_30 .. :try_end_30} :catch_30

    :catch_30
    :try_start_31
    sget-object v1, Le/c/a/n2;->X:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x31

    aput v2, v0, v1
    :try_end_31
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_31} :catch_31

    :catch_31
    :try_start_32
    sget-object v1, Le/c/a/n2;->Y:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x32

    aput v2, v0, v1
    :try_end_32
    .catch Ljava/lang/NoSuchFieldError; {:try_start_32 .. :try_end_32} :catch_32

    :catch_32
    :try_start_33
    sget-object v1, Le/c/a/n2;->Z:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x33

    aput v2, v0, v1
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_33} :catch_33

    :catch_33
    :try_start_34
    sget-object v1, Le/c/a/n2;->a0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x34

    aput v2, v0, v1
    :try_end_34
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_34} :catch_34

    :catch_34
    :try_start_35
    sget-object v1, Le/c/a/n2;->c0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x36

    aput v2, v0, v1
    :try_end_35
    .catch Ljava/lang/NoSuchFieldError; {:try_start_35 .. :try_end_35} :catch_35

    :catch_35
    :try_start_36
    sget-object v1, Le/c/a/n2;->b0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x35

    aput v2, v0, v1
    :try_end_36
    .catch Ljava/lang/NoSuchFieldError; {:try_start_36 .. :try_end_36} :catch_36

    :catch_36
    :try_start_37
    sget-object v1, Le/c/a/n2;->e0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x38

    aput v2, v0, v1
    :try_end_37
    .catch Ljava/lang/NoSuchFieldError; {:try_start_37 .. :try_end_37} :catch_37

    :catch_37
    :try_start_38
    sget-object v1, Le/c/a/n2;->d0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x37

    aput v2, v0, v1
    :try_end_38
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_38} :catch_38

    :catch_38
    :try_start_39
    sget-object v1, Le/c/a/n2;->f0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x39

    aput v2, v0, v1
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_39} :catch_39

    :catch_39
    :try_start_3a
    sget-object v1, Le/c/a/n2;->g0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x3a

    aput v2, v0, v1
    :try_end_3a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3a .. :try_end_3a} :catch_3a

    :catch_3a
    :try_start_3b
    sget-object v1, Le/c/a/n2;->h0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x3b

    aput v2, v0, v1
    :try_end_3b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3b .. :try_end_3b} :catch_3b

    :catch_3b
    :try_start_3c
    sget-object v1, Le/c/a/n2;->i0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x3c

    aput v2, v0, v1
    :try_end_3c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3c .. :try_end_3c} :catch_3c

    :catch_3c
    :try_start_3d
    sget-object v1, Le/c/a/n2;->j0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x3d

    aput v2, v0, v1
    :try_end_3d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3d .. :try_end_3d} :catch_3d

    :catch_3d
    :try_start_3e
    sget-object v1, Le/c/a/n2;->k0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x3e

    aput v2, v0, v1
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3f
    sget-object v1, Le/c/a/n2;->l0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x3f

    aput v2, v0, v1
    :try_end_3f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3f .. :try_end_3f} :catch_3f

    :catch_3f
    :try_start_40
    sget-object v1, Le/c/a/n2;->m0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x40

    aput v2, v0, v1
    :try_end_40
    .catch Ljava/lang/NoSuchFieldError; {:try_start_40 .. :try_end_40} :catch_40

    :catch_40
    :try_start_41
    sget-object v1, Le/c/a/n2;->n0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x41

    aput v2, v0, v1
    :try_end_41
    .catch Ljava/lang/NoSuchFieldError; {:try_start_41 .. :try_end_41} :catch_41

    :catch_41
    :try_start_42
    sget-object v1, Le/c/a/n2;->o0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x42

    aput v2, v0, v1
    :try_end_42
    .catch Ljava/lang/NoSuchFieldError; {:try_start_42 .. :try_end_42} :catch_42

    :catch_42
    :try_start_43
    sget-object v1, Le/c/a/n2;->p0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x43

    aput v2, v0, v1
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_43} :catch_43

    :catch_43
    :try_start_44
    sget-object v1, Le/c/a/n2;->q0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x44

    aput v2, v0, v1
    :try_end_44
    .catch Ljava/lang/NoSuchFieldError; {:try_start_44 .. :try_end_44} :catch_44

    :catch_44
    :try_start_45
    sget-object v1, Le/c/a/n2;->r0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x45

    aput v2, v0, v1
    :try_end_45
    .catch Ljava/lang/NoSuchFieldError; {:try_start_45 .. :try_end_45} :catch_45

    :catch_45
    :try_start_46
    sget-object v1, Le/c/a/n2;->s0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x46

    aput v2, v0, v1
    :try_end_46
    .catch Ljava/lang/NoSuchFieldError; {:try_start_46 .. :try_end_46} :catch_46

    :catch_46
    :try_start_47
    sget-object v1, Le/c/a/n2;->t0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x47

    aput v2, v0, v1
    :try_end_47
    .catch Ljava/lang/NoSuchFieldError; {:try_start_47 .. :try_end_47} :catch_47

    :catch_47
    :try_start_48
    sget-object v1, Le/c/a/n2;->u0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x48

    aput v2, v0, v1
    :try_end_48
    .catch Ljava/lang/NoSuchFieldError; {:try_start_48 .. :try_end_48} :catch_48

    :catch_48
    :try_start_49
    sget-object v1, Le/c/a/n2;->v0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x49

    aput v2, v0, v1
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_49 .. :try_end_49} :catch_49

    :catch_49
    :try_start_4a
    sget-object v1, Le/c/a/n2;->w0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x4a

    aput v2, v0, v1
    :try_end_4a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4a .. :try_end_4a} :catch_4a

    :catch_4a
    :try_start_4b
    sget-object v1, Le/c/a/n2;->x0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x4b

    aput v2, v0, v1
    :try_end_4b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4b .. :try_end_4b} :catch_4b

    :catch_4b
    :try_start_4c
    sget-object v1, Le/c/a/n2;->y0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x4c

    aput v2, v0, v1
    :try_end_4c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4c .. :try_end_4c} :catch_4c

    :catch_4c
    :try_start_4d
    sget-object v1, Le/c/a/n2;->z0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x4d

    aput v2, v0, v1
    :try_end_4d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4d .. :try_end_4d} :catch_4d

    :catch_4d
    :try_start_4e
    sget-object v1, Le/c/a/n2;->A0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x4e

    aput v2, v0, v1
    :try_end_4e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4e .. :try_end_4e} :catch_4e

    :catch_4e
    :try_start_4f
    sget-object v1, Le/c/a/n2;->B0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x4f

    aput v2, v0, v1
    :try_end_4f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4f .. :try_end_4f} :catch_4f

    :catch_4f
    :try_start_50
    sget-object v1, Le/c/a/n2;->C0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x50

    aput v2, v0, v1
    :try_end_50
    .catch Ljava/lang/NoSuchFieldError; {:try_start_50 .. :try_end_50} :catch_50

    :catch_50
    :try_start_51
    sget-object v1, Le/c/a/n2;->D0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x51

    aput v2, v0, v1
    :try_end_51
    .catch Ljava/lang/NoSuchFieldError; {:try_start_51 .. :try_end_51} :catch_51

    :catch_51
    :try_start_52
    sget-object v1, Le/c/a/n2;->L0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x59

    aput v2, v0, v1
    :try_end_52
    .catch Ljava/lang/NoSuchFieldError; {:try_start_52 .. :try_end_52} :catch_52

    :catch_52
    :try_start_53
    sget-object v1, Le/c/a/n2;->M0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x5a

    aput v2, v0, v1
    :try_end_53
    .catch Ljava/lang/NoSuchFieldError; {:try_start_53 .. :try_end_53} :catch_53

    :catch_53
    :try_start_54
    sget-object v1, Le/c/a/n2;->N0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x5b

    aput v2, v0, v1
    :try_end_54
    .catch Ljava/lang/NoSuchFieldError; {:try_start_54 .. :try_end_54} :catch_54

    :catch_54
    :try_start_55
    sget-object v1, Le/c/a/n2;->E0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x52

    aput v2, v0, v1
    :try_end_55
    .catch Ljava/lang/NoSuchFieldError; {:try_start_55 .. :try_end_55} :catch_55

    :catch_55
    :try_start_56
    sget-object v1, Le/c/a/n2;->F0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x53

    aput v2, v0, v1
    :try_end_56
    .catch Ljava/lang/NoSuchFieldError; {:try_start_56 .. :try_end_56} :catch_56

    :catch_56
    :try_start_57
    sget-object v1, Le/c/a/n2;->H0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x55

    aput v2, v0, v1
    :try_end_57
    .catch Ljava/lang/NoSuchFieldError; {:try_start_57 .. :try_end_57} :catch_57

    :catch_57
    :try_start_58
    sget-object v1, Le/c/a/n2;->J0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x57

    aput v2, v0, v1
    :try_end_58
    .catch Ljava/lang/NoSuchFieldError; {:try_start_58 .. :try_end_58} :catch_58

    :catch_58
    :try_start_59
    sget-object v1, Le/c/a/n2;->G0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x54

    aput v2, v0, v1
    :try_end_59
    .catch Ljava/lang/NoSuchFieldError; {:try_start_59 .. :try_end_59} :catch_59

    :catch_59
    :try_start_5a
    sget-object v1, Le/c/a/n2;->I0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x56

    aput v2, v0, v1
    :try_end_5a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5a .. :try_end_5a} :catch_5a

    :catch_5a
    :try_start_5b
    sget-object v1, Le/c/a/n2;->K0:Le/c/a/n2;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x58

    aput v2, v0, v1
    :try_end_5b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5b .. :try_end_5b} :catch_5b

    :catch_5b
    sput-object v0, Le/c/a/p2;->p:[I

    return-object v0
.end method

.method public static b(Le/c/a/o2;)Le/c/a/b0;
    .locals 1

    const-string v0, "auto"

    .line 39
    invoke-virtual {p0, v0}, Le/c/a/o2;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    new-instance p0, Le/c/a/b0;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le/c/a/b0;-><init>(F)V

    return-object p0

    .line 41
    :cond_0
    invoke-virtual {p0}, Le/c/a/o2;->i()Le/c/a/b0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Le/c/a/i1;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "url("

    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, ")"

    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    .line 32
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    add-int/lit8 v0, v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 35
    invoke-static {p0}, Le/c/a/p2;->g(Ljava/lang/String;)Le/c/a/i1;

    move-result-object v1

    .line 36
    :cond_0
    new-instance p0, Le/c/a/g0;

    invoke-direct {p0, p1, v1}, Le/c/a/g0;-><init>(Ljava/lang/String;Le/c/a/i1;)V

    return-object p0

    .line 37
    :cond_1
    new-instance p0, Lorg/xml/sax/SAXException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bad "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " attribute. Unterminated url() reference"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 38
    :cond_2
    invoke-static {p0}, Le/c/a/p2;->g(Ljava/lang/String;)Le/c/a/i1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Le/c/a/o;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "auto"

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 14
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "rect("

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 15
    new-instance v0, Le/c/a/o2;

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 17
    invoke-static {v0}, Le/c/a/p2;->b(Le/c/a/o2;)Le/c/a/b0;

    move-result-object v1

    .line 18
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 19
    invoke-static {v0}, Le/c/a/p2;->b(Le/c/a/o2;)Le/c/a/b0;

    move-result-object v2

    .line 20
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 21
    invoke-static {v0}, Le/c/a/p2;->b(Le/c/a/o2;)Le/c/a/b0;

    move-result-object v3

    .line 22
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 23
    invoke-static {v0}, Le/c/a/p2;->b(Le/c/a/o2;)Le/c/a/b0;

    move-result-object v4

    .line 24
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    const/16 v5, 0x29

    .line 25
    invoke-virtual {v0, v5}, Le/c/a/o2;->a(C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26
    new-instance p0, Le/c/a/o;

    invoke-direct {p0, v1, v2, v3, v4}, Le/c/a/o;-><init>(Le/c/a/b0;Le/c/a/b0;Le/c/a/b0;Le/c/a/b0;)V

    return-object p0

    .line 27
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad rect() clip definition: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :cond_2
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid clip attribute shape. Only rect() is supported."

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/lang/String;)Le/c/a/r;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x10

    const/4 v2, 0x4

    const/16 v3, 0x23

    if-ne v0, v3, :cond_2

    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x7

    const/4 v4, 0x1

    if-ne v0, v3, :cond_0

    .line 15
    new-instance v0, Le/c/a/r;

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-direct {v0, v1}, Le/c/a/r;-><init>(I)V

    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 17
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    and-int/lit16 v1, v0, 0xf00

    and-int/lit16 v3, v0, 0xf0

    and-int/lit8 v0, v0, 0xf

    .line 18
    new-instance v4, Le/c/a/r;

    shl-int/lit8 v5, v1, 0x10

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr v1, v5

    shl-int/lit8 v5, v3, 0x8

    or-int/2addr v1, v5

    shl-int/lit8 v2, v3, 0x4

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x4

    or-int/2addr v1, v2

    or-int/2addr v0, v1

    invoke-direct {v4, v0}, Le/c/a/r;-><init>(I)V

    return-object v4

    .line 19
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad hex colour value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :catch_0
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad colour value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 21
    :cond_2
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "rgb("

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 22
    new-instance v0, Le/c/a/o2;

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 24
    invoke-static {v0}, Le/c/a/p2;->a(Le/c/a/o2;)I

    move-result v2

    .line 25
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 26
    invoke-static {v0}, Le/c/a/p2;->a(Le/c/a/o2;)I

    move-result v3

    .line 27
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 28
    invoke-static {v0}, Le/c/a/p2;->a(Le/c/a/o2;)I

    move-result v4

    .line 29
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    const/16 v5, 0x29

    .line 30
    invoke-virtual {v0, v5}, Le/c/a/o2;->a(C)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    new-instance p0, Le/c/a/r;

    shl-int/lit8 v0, v2, 0x10

    shl-int/lit8 v1, v3, 0x8

    or-int/2addr v0, v1

    or-int/2addr v0, v4

    invoke-direct {p0, v0}, Le/c/a/r;-><init>(I)V

    return-object p0

    .line 32
    :cond_3
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad rgb() colour value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_4
    invoke-static {p0}, Le/c/a/p2;->f(Ljava/lang/String;)Le/c/a/r;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;)Le/c/a/r;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 14
    sget-object v0, Le/c/a/p2;->j:Ljava/util/HashMap;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 15
    new-instance p0, Le/c/a/r;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Le/c/a/r;-><init>(I)V

    return-object p0

    .line 16
    :cond_0
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid colour keyword: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(Ljava/lang/String;)Le/c/a/i1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "none"

    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "currentColor"

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    invoke-static {}, Le/c/a/s;->a()Le/c/a/s;

    move-result-object p0

    return-object p0

    .line 16
    :cond_1
    invoke-static {p0}, Le/c/a/p2;->e(Ljava/lang/String;)Le/c/a/r;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;)Le/c/a/q0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "nonzero"

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object p0, Le/c/a/q0;->b:Le/c/a/q0;

    return-object p0

    :cond_0
    const-string v0, "evenodd"

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    sget-object p0, Le/c/a/q0;->c:Le/c/a/q0;

    return-object p0

    .line 17
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid fill-rule property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i(Ljava/lang/String;)F
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Lorg/xml/sax/SAXException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid float value: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 17
    :cond_0
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid float value (empty string)"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 14
    :cond_0
    invoke-virtual {v0}, Le/c/a/o2;->j()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/16 v1, 0x2c

    .line 15
    invoke-virtual {v0, v1}, Le/c/a/o2;->b(C)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    if-nez p0, :cond_3

    .line 16
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    :cond_3
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 19
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-object p0
.end method

.method public static k(Ljava/lang/String;)Le/c/a/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    sget-object v0, Le/c/a/p2;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/b0;

    if-nez v0, :cond_0

    .line 14
    invoke-static {p0}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static l(Ljava/lang/String;)Le/c/a/r0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 14
    sget-object v0, Le/c/a/p2;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/r0;

    if-eqz v0, :cond_0

    return-object v0

    .line 15
    :cond_0
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid font-style property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    sget-object v0, Le/c/a/p2;->l:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid font-weight property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static n(Ljava/lang/String;)Le/c/a/b0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 15
    sget-object v1, Le/c/a/x1;->b:Le/c/a/x1;

    add-int/lit8 v2, v0, -0x1

    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x25

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 17
    sget-object v1, Le/c/a/x1;->j:Le/c/a/x1;

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-le v0, v3, :cond_1

    .line 18
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, v0, -0x2

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, -0x2

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 20
    :try_start_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le/c/a/x1;->valueOf(Ljava/lang/String;)Le/c/a/x1;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 21
    :catch_0
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid length unit specifier: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 22
    :try_start_1
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    .line 23
    new-instance v2, Le/c/a/b0;

    invoke-direct {v2, v0, v1}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v0

    .line 24
    new-instance v1, Lorg/xml/sax/SAXException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid length value: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 25
    :cond_2
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid length value (empty string)"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static o(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Le/c/a/b0;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    new-instance v1, Le/c/a/o2;

    invoke-direct {v1, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 17
    :goto_0
    invoke-virtual {v1}, Le/c/a/o2;->c()Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    .line 18
    :cond_0
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 19
    invoke-virtual {v1}, Le/c/a/o2;->l()Le/c/a/x1;

    move-result-object v2

    if-nez v2, :cond_1

    .line 20
    sget-object v2, Le/c/a/x1;->b:Le/c/a/x1;

    .line 21
    :cond_1
    new-instance v3, Le/c/a/b0;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-direct {v3, p0, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    goto :goto_0

    .line 23
    :cond_2
    new-instance p0, Lorg/xml/sax/SAXException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Invalid length list value: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Le/c/a/o2;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 24
    :cond_3
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid length list (empty string)"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p(Ljava/lang/String;)F
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    invoke-static {p0}, Le/c/a/p2;->i(Ljava/lang/String;)F

    move-result p0

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    cmpg-float v2, p0, v1

    if-gez v2, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    cmpl-float v1, p0, v0

    if-lez v1, :cond_1

    const/high16 p0, 0x3f800000    # 1.0f

    :cond_1
    :goto_0
    return p0
.end method

.method public static q(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "visible"

    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "auto"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "hidden"

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "scroll"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid toverflow property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_2
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 15
    :cond_3
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static r(Ljava/lang/String;)Le/c/a/i0;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 14
    new-instance v0, Le/c/a/o2;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 15
    new-instance v9, Le/c/a/i0;

    invoke-direct {v9}, Le/c/a/i0;-><init>()V

    .line 16
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v9

    .line 17
    :cond_0
    invoke-virtual {v0}, Le/c/a/o2;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x4d

    const/16 v10, 0x6d

    if-eq v1, v2, :cond_1

    if-eq v1, v10, :cond_1

    return-object v9

    :cond_1
    move v12, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 18
    :goto_0
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    const/16 v5, 0x6c

    const/high16 v6, 0x40000000    # 2.0f

    const-string v7, " path segment"

    const-string v8, "Bad path coords for "

    const-string v15, "SVGParser"

    sparse-switch v12, :sswitch_data_0

    return-object v9

    .line 19
    :sswitch_0
    invoke-virtual {v9}, Le/c/a/i0;->close()V

    move v1, v13

    move v2, v1

    move v3, v14

    :goto_1
    move v4, v3

    :goto_2
    const/16 v19, 0x0

    goto/16 :goto_4

    .line 20
    :sswitch_1
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_2
    const/16 v5, 0x76

    if-ne v12, v5, :cond_3

    .line 22
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v4, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 23
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v9, v1, v3}, Le/c/a/i0;->b(FF)V

    .line 24
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_1

    :sswitch_2
    mul-float v5, v1, v6

    sub-float/2addr v5, v2

    .line 25
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    mul-float v6, v6, v3

    sub-float/2addr v6, v4

    .line 26
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 27
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v5

    .line 28
    invoke-virtual {v0, v5}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v6

    if-nez v6, :cond_4

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_4
    const/16 v7, 0x74

    if-ne v12, v7, :cond_5

    .line 30
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 31
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 32
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v9, v1, v3, v7, v8}, Le/c/a/i0;->a(FFFF)V

    .line 33
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 34
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 35
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 36
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto/16 :goto_2

    :sswitch_3
    mul-float v5, v1, v6

    sub-float/2addr v5, v2

    .line 37
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    mul-float v6, v6, v3

    sub-float/2addr v6, v4

    .line 38
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 39
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v5

    .line 40
    invoke-virtual {v0, v5}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v6

    .line 41
    invoke-virtual {v0, v6}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v11

    .line 42
    invoke-virtual {v0, v11}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v16

    if-nez v16, :cond_6

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_6
    const/16 v7, 0x73

    if-ne v12, v7, :cond_7

    .line 44
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    .line 45
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    .line 46
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 47
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    :cond_7
    move-object v8, v5

    move-object v15, v11

    move-object v11, v6

    .line 48
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    move-result v7

    move-object v1, v9

    invoke-virtual/range {v1 .. v7}, Le/c/a/i0;->a(FFFFFF)V

    .line 49
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 50
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 51
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 52
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto/16 :goto_2

    .line 53
    :sswitch_4
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    .line 55
    invoke-virtual {v0, v4}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v5

    .line 56
    invoke-virtual {v0, v5}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v6

    if-nez v6, :cond_8

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_8
    const/16 v7, 0x71

    if-ne v12, v7, :cond_9

    .line 58
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 59
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    add-float/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 60
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 61
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 62
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v9, v1, v3, v7, v8}, Le/c/a/i0;->a(FFFF)V

    .line 63
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 64
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 65
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 66
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto/16 :goto_2

    .line 67
    :sswitch_5
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 68
    invoke-virtual {v0, v2}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_a

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_a
    if-ne v12, v10, :cond_b

    .line 70
    invoke-virtual {v9}, Le/c/a/i0;->a()Z

    move-result v6

    if-nez v6, :cond_b

    .line 71
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 72
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 73
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v9, v1, v3}, Le/c/a/i0;->a(FF)V

    .line 74
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 75
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    if-ne v12, v10, :cond_c

    goto :goto_3

    :cond_c
    const/16 v5, 0x4c

    :goto_3
    move v2, v1

    move v13, v2

    move v4, v3

    move v14, v4

    move v12, v5

    goto/16 :goto_2

    .line 76
    :sswitch_6
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_d

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_d
    if-ne v12, v5, :cond_e

    .line 79
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 80
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 81
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v9, v1, v3}, Le/c/a/i0;->b(FF)V

    .line 82
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 83
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    move v2, v1

    goto/16 :goto_1

    .line 84
    :sswitch_7
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    if-nez v2, :cond_f

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_f
    const/16 v5, 0x68

    if-ne v12, v5, :cond_10

    .line 86
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 87
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v9, v1, v3}, Le/c/a/i0;->b(FF)V

    .line 88
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    move v2, v1

    goto/16 :goto_2

    .line 89
    :sswitch_8
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 90
    invoke-virtual {v0, v2}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    .line 91
    invoke-virtual {v0, v4}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v5

    .line 92
    invoke-virtual {v0, v5}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v6

    .line 93
    invoke-virtual {v0, v6}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v11

    .line 94
    invoke-virtual {v0, v11}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v16

    if-nez v16, :cond_11

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    :cond_11
    const/16 v7, 0x63

    if-ne v12, v7, :cond_12

    .line 96
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    .line 97
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    .line 98
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 99
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v4, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 100
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 101
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    :cond_12
    move-object v8, v5

    move-object v15, v11

    move-object v11, v6

    .line 102
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    move-result v7

    move-object v1, v9

    invoke-virtual/range {v1 .. v7}, Le/c/a/i0;->a(FFFFFF)V

    .line 103
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 104
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 105
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 106
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto/16 :goto_2

    .line 107
    :sswitch_9
    invoke-virtual {v0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 108
    invoke-virtual {v0, v2}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    .line 109
    invoke-virtual {v0, v4}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v5

    .line 110
    invoke-virtual {v0, v5}, Le/c/a/o2;->a(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v6

    .line 111
    invoke-virtual {v0, v6}, Le/c/a/o2;->a(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v11

    .line 112
    invoke-virtual {v0, v11}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v10

    .line 113
    invoke-virtual {v0, v10}, Le/c/a/o2;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v17

    if-eqz v17, :cond_17

    .line 114
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v18

    const/16 v19, 0x0

    cmpg-float v18, v18, v19

    if-ltz v18, :cond_17

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v18

    cmpg-float v18, v18, v19

    if-gez v18, :cond_13

    goto :goto_5

    :cond_13
    const/16 v7, 0x61

    if-ne v12, v7, :cond_14

    .line 115
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    .line 116
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    .line 117
    :cond_14
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Float;->floatValue()F

    move-result v8

    move-object v1, v9

    invoke-virtual/range {v1 .. v8}, Le/c/a/i0;->a(FFFZZFF)V

    .line 118
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 119
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Float;->floatValue()F

    move-result v3

    move v2, v1

    move v4, v3

    .line 120
    :goto_4
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 121
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v5

    if-eqz v5, :cond_15

    return-object v9

    .line 122
    :cond_15
    invoke-virtual {v0}, Le/c/a/o2;->d()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 123
    invoke-virtual {v0}, Le/c/a/o2;->e()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v12

    :cond_16
    const/16 v10, 0x6d

    goto/16 :goto_0

    .line 124
    :cond_17
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v9

    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_9
        0x43 -> :sswitch_8
        0x48 -> :sswitch_7
        0x4c -> :sswitch_6
        0x4d -> :sswitch_5
        0x51 -> :sswitch_4
        0x53 -> :sswitch_3
        0x54 -> :sswitch_2
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
        0x61 -> :sswitch_9
        0x63 -> :sswitch_8
        0x68 -> :sswitch_7
        0x6c -> :sswitch_6
        0x6d -> :sswitch_5
        0x71 -> :sswitch_4
        0x73 -> :sswitch_3
        0x74 -> :sswitch_2
        0x76 -> :sswitch_1
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static s(Ljava/lang/String;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 3
    :goto_0
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 4
    :cond_0
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http://www.w3.org/TR/SVG11/feature#"

    .line 5
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x23

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string v1, "UNSUPPORTED"

    .line 7
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 8
    :goto_1
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    goto :goto_0
.end method

.method public static t(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 14
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 15
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 16
    :goto_0
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    goto :goto_0
.end method

.method public static u(Ljava/lang/String;)[Le/c/a/b0;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 15
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 16
    :cond_0
    invoke-virtual {v0}, Le/c/a/o2;->i()Le/c/a/b0;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    .line 17
    :cond_1
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v3

    const-string v4, "Invalid stroke-dasharray. Dash segemnts cannot be negative: "

    if-nez v3, :cond_6

    .line 18
    invoke-virtual {v1}, Le/c/a/b0;->a()F

    move-result v3

    .line 19
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    :goto_0
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p0, 0x0

    cmpl-float p0, v3, p0

    if-nez p0, :cond_2

    return-object v2

    .line 22
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Le/c/a/b0;

    invoke-interface {v5, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Le/c/a/b0;

    return-object p0

    .line 23
    :cond_3
    invoke-virtual {v0}, Le/c/a/o2;->p()Z

    .line 24
    invoke-virtual {v0}, Le/c/a/o2;->i()Le/c/a/b0;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 25
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v6

    if-nez v6, :cond_4

    .line 26
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    invoke-virtual {v1}, Le/c/a/b0;->a()F

    move-result v1

    add-float/2addr v3, v1

    goto :goto_0

    .line 28
    :cond_4
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_5
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid stroke-dasharray. Non-Length content found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_6
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static v(Ljava/lang/String;)Le/c/a/s0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "butt"

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    sget-object p0, Le/c/a/s0;->b:Le/c/a/s0;

    return-object p0

    :cond_0
    const-string v0, "round"

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    sget-object p0, Le/c/a/s0;->c:Le/c/a/s0;

    return-object p0

    :cond_1
    const-string v0, "square"

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19
    sget-object p0, Le/c/a/s0;->d:Le/c/a/s0;

    return-object p0

    .line 20
    :cond_2
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid stroke-linecap property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static w(Ljava/lang/String;)Le/c/a/t0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "miter"

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    sget-object p0, Le/c/a/t0;->b:Le/c/a/t0;

    return-object p0

    :cond_0
    const-string v0, "round"

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    sget-object p0, Le/c/a/t0;->c:Le/c/a/t0;

    return-object p0

    :cond_1
    const-string v0, "bevel"

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    sget-object p0, Le/c/a/t0;->d:Le/c/a/t0;

    return-object p0

    .line 22
    :cond_2
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid stroke-linejoin property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static x(Ljava/lang/String;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 17
    new-instance v0, Le/c/a/o2;

    invoke-direct {v0, p0}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 18
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 19
    :goto_0
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0}, Le/c/a/o2;->k()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2d

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x0

    .line 22
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 23
    :cond_1
    new-instance v2, Ljava/util/Locale;

    const-string v3, ""

    invoke-direct {v2, v1, v3, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    goto :goto_0
.end method

.method public static y(Ljava/lang/String;)Le/c/a/u0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "start"

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object p0, Le/c/a/u0;->b:Le/c/a/u0;

    return-object p0

    :cond_0
    const-string v0, "middle"

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    sget-object p0, Le/c/a/u0;->c:Le/c/a/u0;

    return-object p0

    :cond_1
    const-string v0, "end"

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 23
    sget-object p0, Le/c/a/u0;->d:Le/c/a/u0;

    return-object p0

    .line 24
    :cond_2
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid text-anchor property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static z(Ljava/lang/String;)Le/c/a/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "none"

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    sget-object p0, Le/c/a/v0;->b:Le/c/a/v0;

    return-object p0

    :cond_0
    const-string v0, "underline"

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    sget-object p0, Le/c/a/v0;->c:Le/c/a/v0;

    return-object p0

    :cond_1
    const-string v0, "overline"

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19
    sget-object p0, Le/c/a/v0;->d:Le/c/a/v0;

    return-object p0

    :cond_2
    const-string v0, "line-through"

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 21
    sget-object p0, Le/c/a/v0;->e:Le/c/a/v0;

    return-object p0

    :cond_3
    const-string v0, "blink"

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 23
    sget-object p0, Le/c/a/v0;->f:Le/c/a/v0;

    return-object p0

    .line 24
    :cond_4
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid text-decoration property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final A(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<view>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/z1;

    invoke-direct {v0}, Le/c/a/z1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/l1;Lorg/xml/sax/Attributes;)V

    .line 9
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 10
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 11
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final B(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<switch>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/m1;

    invoke-direct {v0}, Le/c/a/m1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/io/InputStream;)Le/c/a/a2;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/caverock/androidsvg/SVGParseException;
        }
    .end annotation

    const-string v0, "Exception thrown closing input stream"

    const-string v1, "SVGParser"

    .line 2
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v2

    :cond_0
    const/4 v2, 0x3

    .line 4
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 5
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v3

    shl-int/lit8 v3, v3, 0x8

    add-int/2addr v2, v3

    .line 6
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    const v3, 0x8b1f

    if-ne v2, v3, :cond_1

    .line 7
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v2, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v2

    .line 8
    :catch_0
    :cond_1
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v2

    .line 9
    :try_start_1
    invoke-virtual {v2}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v2

    .line 11
    invoke-interface {v2, p0}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    const-string v3, "http://xml.org/sax/properties/lexical-handler"

    .line 12
    invoke-interface {v2, v3, p0}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    new-instance v3, Lorg/xml/sax/InputSource;

    invoke-direct {v3, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    invoke-interface {v2, v3}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/xml/sax/SAXException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 15
    :catch_1
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    :goto_0
    iget-object p1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    return-object p1

    :catchall_0
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    .line 17
    :try_start_3
    new-instance v3, Lcom/caverock/androidsvg/SVGParseException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "SVG parse error: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/xml/sax/SAXException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lcom/caverock/androidsvg/SVGParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_3
    move-exception v2

    .line 18
    new-instance v3, Lcom/caverock/androidsvg/SVGParseException;

    const-string v4, "XML Parser problem"

    invoke-direct {v3, v4, v2}, Lcom/caverock/androidsvg/SVGParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_4
    move-exception v2

    .line 19
    new-instance v3, Lcom/caverock/androidsvg/SVGParseException;

    const-string v4, "File error"

    invoke-direct {v3, v4, v2}, Lcom/caverock/androidsvg/SVGParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 20
    :goto_1
    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_2

    .line 21
    :catch_5
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    :goto_2
    throw v2
.end method

.method public final a(Le/c/a/a0;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 48
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 49
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x1a

    if-eq v2, v3, :cond_5

    const/16 v3, 0x1b

    if-eq v2, v3, :cond_3

    const/16 v3, 0x31

    if-eq v2, v3, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 51
    :pswitch_0
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/a0;->q:Le/c/a/b0;

    goto :goto_1

    .line 52
    :pswitch_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/a0;->p:Le/c/a/b0;

    goto :goto_1

    .line 53
    :pswitch_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/a0;->r:Le/c/a/b0;

    .line 54
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 55
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <use> element. width cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_2
    invoke-static {p1, v1}, Le/c/a/p2;->a(Le/c/a/j1;Ljava/lang/String;)V

    goto :goto_1

    .line 57
    :cond_3
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://www.w3.org/1999/xlink"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    .line 58
    :cond_4
    iput-object v1, p1, Le/c/a/a0;->o:Ljava/lang/String;

    goto :goto_1

    .line 59
    :cond_5
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/a0;->s:Le/c/a/b0;

    .line 60
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :cond_6
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <use> element. height cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x52
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 153
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v1, v2, :cond_0

    return-void

    .line 154
    :cond_0
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v3

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0x4a

    if-eq v3, v4, :cond_2

    packed-switch v3, :pswitch_data_0

    goto :goto_2

    .line 156
    :pswitch_0
    invoke-static {v2}, Le/c/a/p2;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 157
    new-instance v3, Ljava/util/HashSet;

    if-eqz v2, :cond_1

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    :cond_1
    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 158
    :goto_1
    invoke-interface {p1, v3}, Le/c/a/a1;->b(Ljava/util/Set;)V

    goto :goto_2

    .line 159
    :pswitch_1
    invoke-static {v2}, Le/c/a/p2;->t(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {p1, v2}, Le/c/a/a1;->a(Ljava/util/Set;)V

    goto :goto_2

    .line 160
    :pswitch_2
    invoke-interface {p1, v2}, Le/c/a/a1;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 161
    :pswitch_3
    invoke-static {v2}, Le/c/a/p2;->s(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {p1, v2}, Le/c/a/a1;->d(Ljava/util/Set;)V

    goto :goto_2

    .line 162
    :cond_2
    invoke-static {v2}, Le/c/a/p2;->x(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {p1, v2}, Le/c/a/a1;->c(Ljava/util/Set;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x35
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/c0;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 117
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 118
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 120
    :pswitch_0
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/c0;->r:Le/c/a/b0;

    goto :goto_1

    .line 121
    :pswitch_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/c0;->q:Le/c/a/b0;

    goto :goto_1

    .line 122
    :pswitch_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/c0;->p:Le/c/a/b0;

    goto :goto_1

    .line 123
    :pswitch_3
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/c0;->o:Le/c/a/b0;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/d0;Lorg/xml/sax/Attributes;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 163
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v1, v2, :cond_0

    return-void

    .line 164
    :cond_0
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 165
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v3

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0x2a

    if-eq v3, v4, :cond_7

    const/16 v4, 0x33

    if-eq v3, v4, :cond_6

    const/16 v4, 0x34

    if-eq v3, v4, :cond_5

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 166
    :pswitch_0
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/d0;->s:Le/c/a/b0;

    .line 167
    invoke-virtual {v2}, Le/c/a/b0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 168
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <marker> element. markerWidth cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const-string v3, "strokeWidth"

    .line 169
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 170
    iput-boolean v0, p1, Le/c/a/d0;->p:Z

    goto :goto_1

    :cond_2
    const-string v3, "userSpaceOnUse"

    .line 171
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    .line 172
    iput-boolean v2, p1, Le/c/a/d0;->p:Z

    goto :goto_1

    .line 173
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute markerUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 174
    :pswitch_2
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/d0;->t:Le/c/a/b0;

    .line 175
    invoke-virtual {v2}, Le/c/a/b0;->b()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    .line 176
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <marker> element. markerHeight cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 177
    :cond_5
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/d0;->r:Le/c/a/b0;

    goto :goto_1

    .line 178
    :cond_6
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/d0;->q:Le/c/a/b0;

    goto :goto_1

    :cond_7
    const-string v3, "auto"

    .line 179
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 180
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, p1, Le/c/a/d0;->u:Ljava/lang/Float;

    goto :goto_1

    .line 181
    :cond_8
    invoke-static {v2}, Le/c/a/p2;->i(Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, p1, Le/c/a/d0;->u:Ljava/lang/Float;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/e0;Lorg/xml/sax/Attributes;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 255
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 256
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v0, v2, :cond_0

    return-void

    .line 257
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 258
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_8

    const/16 v4, 0x25

    const-string v5, "userSpaceOnUse"

    const-string v6, "objectBoundingBox"

    const/4 v7, 0x1

    if-eq v3, v4, :cond_5

    const/16 v4, 0x26

    if-eq v3, v4, :cond_2

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 259
    :pswitch_0
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/e0;->q:Le/c/a/b0;

    goto :goto_1

    .line 260
    :pswitch_1
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/e0;->p:Le/c/a/b0;

    goto :goto_1

    .line 261
    :pswitch_2
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/e0;->r:Le/c/a/b0;

    .line 262
    invoke-virtual {v2}, Le/c/a/b0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 263
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <mask> element. width cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 264
    :cond_2
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 265
    iput-object v1, p1, Le/c/a/e0;->n:Ljava/lang/Boolean;

    goto :goto_1

    .line 266
    :cond_3
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 267
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/e0;->n:Ljava/lang/Boolean;

    goto :goto_1

    .line 268
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute maskUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 269
    :cond_5
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 270
    iput-object v1, p1, Le/c/a/e0;->o:Ljava/lang/Boolean;

    goto :goto_1

    .line 271
    :cond_6
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 272
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/e0;->o:Ljava/lang/Boolean;

    goto :goto_1

    .line 273
    :cond_7
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute maskContentUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 274
    :cond_8
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/e0;->s:Le/c/a/b0;

    .line 275
    invoke-virtual {v2}, Le/c/a/b0;->b()Z

    move-result v2

    if-nez v2, :cond_9

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 276
    :cond_9
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <mask> element. height cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x52
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 277
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_2

    .line 278
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    .line 279
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "xml:id"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "xml:space"

    .line 280
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 281
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v0, "default"

    .line 282
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p2, p1, Le/c/a/f1;->d:Ljava/lang/Boolean;

    goto :goto_2

    :cond_2
    const-string v0, "preserve"

    .line 284
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 285
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p2, p1, Le/c/a/f1;->d:Ljava/lang/Boolean;

    goto :goto_2

    .line 286
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid value for \"xml:space\" attribute: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 287
    :cond_5
    :goto_1
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Le/c/a/f1;->c:Ljava/lang/String;

    :goto_2
    return-void
.end method

.method public final a(Le/c/a/g1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 195
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 196
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 197
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 198
    :pswitch_0
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/g1;->p:Le/c/a/b0;

    goto :goto_1

    .line 199
    :pswitch_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/g1;->o:Le/c/a/b0;

    goto :goto_1

    .line 200
    :pswitch_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/g1;->n:Le/c/a/b0;

    goto :goto_1

    .line 201
    :pswitch_3
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/g1;->m:Le/c/a/b0;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/h0;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 62
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 63
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 64
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0xe

    if-eq v2, v3, :cond_3

    const/16 v3, 0x2c

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 65
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->i(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p1, Le/c/a/h0;->p:Ljava/lang/Float;

    .line 66
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_2

    goto :goto_1

    .line 67
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <path> element. pathLength cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :cond_3
    invoke-static {v1}, Le/c/a/p2;->r(Ljava/lang/String;)Le/c/a/i0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/h0;->o:Le/c/a/i0;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/k0;Lorg/xml/sax/Attributes;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 230
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 231
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v0, v2, :cond_0

    return-void

    .line 232
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 233
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_8

    const/16 v4, 0x1b

    if-eq v3, v4, :cond_6

    const-string v4, "userSpaceOnUse"

    const-string v5, "objectBoundingBox"

    const/4 v6, 0x1

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    goto/16 :goto_1

    .line 234
    :pswitch_0
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->t:Le/c/a/b0;

    goto/16 :goto_1

    .line 235
    :pswitch_1
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->s:Le/c/a/b0;

    goto/16 :goto_1

    .line 236
    :pswitch_2
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->u:Le/c/a/b0;

    .line 237
    invoke-virtual {v2}, Le/c/a/b0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 238
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <pattern> element. width cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 239
    :pswitch_3
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 240
    iput-object v1, p1, Le/c/a/k0;->p:Ljava/lang/Boolean;

    goto :goto_1

    .line 241
    :cond_2
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 242
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->p:Ljava/lang/Boolean;

    goto :goto_1

    .line 243
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute patternUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 244
    :pswitch_4
    invoke-virtual {p0, v2}, Le/c/a/p2;->c(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->r:Landroid/graphics/Matrix;

    goto :goto_1

    .line 245
    :pswitch_5
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 246
    iput-object v1, p1, Le/c/a/k0;->q:Ljava/lang/Boolean;

    goto :goto_1

    .line 247
    :cond_4
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 248
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->q:Ljava/lang/Boolean;

    goto :goto_1

    .line 249
    :cond_5
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute patternContentUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 250
    :cond_6
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "http://www.w3.org/1999/xlink"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_1

    .line 251
    :cond_7
    iput-object v2, p1, Le/c/a/k0;->w:Ljava/lang/String;

    goto :goto_1

    .line 252
    :cond_8
    invoke-static {v2}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v2

    iput-object v2, p1, Le/c/a/k0;->v:Le/c/a/b0;

    .line 253
    invoke-virtual {v2}, Le/c/a/b0;->b()Z

    move-result v2

    if-nez v2, :cond_9

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 254
    :cond_9
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <pattern> element. height cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x2d
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x52
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/k1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 202
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 203
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 204
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x7

    if-eq v2, v3, :cond_6

    const/16 v3, 0x8

    if-eq v2, v3, :cond_5

    const/16 v3, 0xc

    if-eq v2, v3, :cond_4

    const/16 v3, 0xd

    if-eq v2, v3, :cond_3

    const/16 v3, 0x32

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 205
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/k1;->o:Le/c/a/b0;

    .line 206
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 207
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <radialGradient> element. r cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 208
    :cond_3
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/k1;->q:Le/c/a/b0;

    goto :goto_1

    .line 209
    :cond_4
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/k1;->p:Le/c/a/b0;

    goto :goto_1

    .line 210
    :cond_5
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/k1;->n:Le/c/a/b0;

    goto :goto_1

    .line 211
    :cond_6
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/k1;->m:Le/c/a/b0;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/l0;Lorg/xml/sax/Attributes;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 124
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v1, v2, :cond_0

    return-void

    .line 125
    :cond_0
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v2

    sget-object v3, Le/c/a/n2;->W:Le/c/a/n2;

    if-ne v2, v3, :cond_5

    .line 126
    new-instance v2, Le/c/a/o2;

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 127
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 128
    invoke-virtual {v2}, Le/c/a/o2;->q()V

    .line 129
    :goto_1
    invoke-virtual {v2}, Le/c/a/o2;->c()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 130
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [F

    iput-object v2, p1, Le/c/a/l0;->o:[F

    .line 131
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v2, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    .line 132
    iget-object v5, p1, Le/c/a/l0;->o:[F

    add-int/lit8 v6, v2, 0x1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v5, v2

    move v2, v6

    goto :goto_2

    .line 133
    :cond_2
    invoke-virtual {v2}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v4

    const-string v5, "Invalid <"

    if-eqz v4, :cond_4

    .line 134
    invoke-virtual {v2}, Le/c/a/o2;->p()Z

    .line 135
    invoke-virtual {v2}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 136
    invoke-virtual {v2}, Le/c/a/o2;->p()Z

    .line 137
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 139
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "> points attribute. There should be an even number of coordinates."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 140
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "> points attribute. Non-coordinate content found in list."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0
.end method

.method public final a(Le/c/a/l1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 394
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 395
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 396
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x31

    if-eq v2, v3, :cond_2

    const/16 v3, 0x51

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 397
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->C(Ljava/lang/String;)Le/c/a/n;

    move-result-object v1

    iput-object v1, p1, Le/c/a/l1;->o:Le/c/a/n;

    goto :goto_1

    .line 398
    :cond_2
    invoke-static {p1, v1}, Le/c/a/p2;->a(Le/c/a/j1;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/n0;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 69
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 70
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x1a

    if-eq v2, v3, :cond_6

    const/16 v3, 0x39

    if-eq v2, v3, :cond_4

    const/16 v3, 0x3a

    if-eq v2, v3, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 72
    :pswitch_0
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/n0;->p:Le/c/a/b0;

    goto :goto_1

    .line 73
    :pswitch_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/n0;->o:Le/c/a/b0;

    goto :goto_1

    .line 74
    :pswitch_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/n0;->q:Le/c/a/b0;

    .line 75
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 76
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <rect> element. width cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 77
    :cond_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/n0;->t:Le/c/a/b0;

    .line 78
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 79
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <rect> element. ry cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 80
    :cond_4
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/n0;->s:Le/c/a/b0;

    .line 81
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    .line 82
    :cond_5
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <rect> element. rx cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_6
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/n0;->r:Le/c/a/b0;

    .line 84
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_7

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 85
    :cond_7
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <rect> element. height cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x52
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/o1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 148
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 149
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 150
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x1b

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 151
    :cond_1
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://www.w3.org/1999/xlink"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    .line 152
    :cond_2
    iput-object v1, p1, Le/c/a/o1;->n:Ljava/lang/String;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/p0;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 212
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 213
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 214
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x28

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 215
    :cond_1
    invoke-virtual {p0, v1}, Le/c/a/p2;->b(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p1, Le/c/a/p0;->h:Ljava/lang/Float;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/p;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 98
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 99
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 100
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x7

    if-eq v2, v3, :cond_4

    const/16 v3, 0x8

    if-eq v2, v3, :cond_3

    const/16 v3, 0x32

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 101
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/p;->q:Le/c/a/b0;

    .line 102
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 103
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <circle> element. r cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 104
    :cond_3
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/p;->p:Le/c/a/b0;

    goto :goto_1

    .line 105
    :cond_4
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/p;->o:Le/c/a/b0;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/q;Lorg/xml/sax/Attributes;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 216
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v1, v2, :cond_0

    return-void

    .line 217
    :cond_0
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 218
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v3

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "objectBoundingBox"

    .line 219
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 220
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/q;->o:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    const-string v3, "userSpaceOnUse"

    .line 221
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    .line 222
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/q;->o:Ljava/lang/Boolean;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 223
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute clipPathUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Le/c/a/t1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 224
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 225
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 226
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x1b

    if-eq v2, v3, :cond_2

    const/16 v3, 0x3e

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 227
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/t1;->o:Le/c/a/b0;

    goto :goto_1

    .line 228
    :cond_2
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://www.w3.org/1999/xlink"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    .line 229
    :cond_3
    iput-object v1, p1, Le/c/a/t1;->n:Ljava/lang/String;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/u1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 141
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 142
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0xa

    if-eq v2, v3, :cond_4

    const/16 v3, 0xb

    if-eq v2, v3, :cond_3

    const/16 v3, 0x53

    if-eq v2, v3, :cond_2

    const/16 v3, 0x54

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 144
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u1;->o:Ljava/util/List;

    goto :goto_1

    .line 145
    :cond_2
    invoke-static {v1}, Le/c/a/p2;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u1;->n:Ljava/util/List;

    goto :goto_1

    .line 146
    :cond_3
    invoke-static {v1}, Le/c/a/p2;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u1;->q:Ljava/util/List;

    goto :goto_1

    .line 147
    :cond_4
    invoke-static {v1}, Le/c/a/p2;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u1;->p:Ljava/util/List;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/u;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 106
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 107
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x7

    if-eq v2, v3, :cond_6

    const/16 v3, 0x8

    if-eq v2, v3, :cond_5

    const/16 v3, 0x39

    if-eq v2, v3, :cond_3

    const/16 v3, 0x3a

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 109
    :cond_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u;->r:Le/c/a/b0;

    .line 110
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 111
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <ellipse> element. ry cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_3
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u;->q:Le/c/a/b0;

    .line 113
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    .line 114
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <ellipse> element. rx cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 115
    :cond_5
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u;->p:Le/c/a/b0;

    goto :goto_1

    .line 116
    :cond_6
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/u;->o:Le/c/a/b0;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Le/c/a/v;Lorg/xml/sax/Attributes;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 182
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-lt v1, v2, :cond_0

    return-void

    .line 183
    :cond_0
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 184
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v3

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0x18

    if-eq v3, v4, :cond_7

    const/16 v4, 0x19

    if-eq v3, v4, :cond_4

    const/16 v4, 0x1b

    if-eq v3, v4, :cond_2

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_1

    goto :goto_1

    .line 185
    :cond_1
    :try_start_0
    invoke-static {v2}, Le/c/a/w;->valueOf(Ljava/lang/String;)Le/c/a/w;

    move-result-object v3

    iput-object v3, p1, Le/c/a/v;->k:Le/c/a/w;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 186
    :catch_0
    new-instance p1, Lorg/xml/sax/SAXException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid spreadMethod attribute. \""

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" is not a valid value."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 187
    :cond_2
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "http://www.w3.org/1999/xlink"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 188
    :cond_3
    iput-object v2, p1, Le/c/a/v;->l:Ljava/lang/String;

    goto :goto_1

    :cond_4
    const-string v3, "objectBoundingBox"

    .line 189
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 190
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/v;->i:Ljava/lang/Boolean;

    goto :goto_1

    :cond_5
    const-string v3, "userSpaceOnUse"

    .line 191
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    .line 192
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Le/c/a/v;->i:Ljava/lang/Boolean;

    goto :goto_1

    .line 193
    :cond_6
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid value for attribute gradientUnits"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 194
    :cond_7
    invoke-virtual {p0, v2}, Le/c/a/p2;->c(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v2

    iput-object v2, p1, Le/c/a/v;->j:Landroid/graphics/Matrix;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0
.end method

.method public final a(Le/c/a/y1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 35
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 36
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x1a

    if-eq v2, v3, :cond_4

    const/16 v3, 0x1b

    if-eq v2, v3, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 38
    :pswitch_0
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/y1;->q:Le/c/a/b0;

    goto :goto_1

    .line 39
    :pswitch_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/y1;->p:Le/c/a/b0;

    goto :goto_1

    .line 40
    :pswitch_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/y1;->r:Le/c/a/b0;

    .line 41
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <use> element. width cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :cond_2
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://www.w3.org/1999/xlink"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    .line 44
    :cond_3
    iput-object v1, p1, Le/c/a/y1;->o:Ljava/lang/String;

    goto :goto_1

    .line 45
    :cond_4
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/y1;->s:Le/c/a/b0;

    .line 46
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_5

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 47
    :cond_5
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <use> element. height cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x52
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/z0;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 24
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x1a

    if-eq v2, v3, :cond_3

    const/16 v3, 0x50

    if-eq v2, v3, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 26
    :pswitch_0
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/z0;->q:Le/c/a/b0;

    goto :goto_1

    .line 27
    :pswitch_1
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/z0;->p:Le/c/a/b0;

    goto :goto_1

    .line 28
    :pswitch_2
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/z0;->r:Le/c/a/b0;

    .line 29
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 30
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <svg> element. width cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 31
    :cond_2
    iput-object v1, p1, Le/c/a/z0;->t:Ljava/lang/String;

    goto :goto_1

    .line 32
    :cond_3
    invoke-static {v1}, Le/c/a/p2;->n(Ljava/lang/String;)Le/c/a/b0;

    move-result-object v1

    iput-object v1, p1, Le/c/a/z0;->s:Le/c/a/b0;

    .line 33
    invoke-virtual {v1}, Le/c/a/b0;->b()Z

    move-result v1

    if-nez v1, :cond_4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 34
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid <svg> element. height cannot be negative"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x52
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/z;Lorg/xml/sax/Attributes;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 399
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 400
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v1

    sget-object v2, Le/c/a/n2;->z0:Le/c/a/n2;

    if-ne v1, v2, :cond_1

    .line 401
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/c/a/p2;->c(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-interface {p1, v1}, Le/c/a/z;->a(Landroid/graphics/Matrix;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 446
    new-instance v0, Le/c/a/j;

    sget-object v1, Le/c/a/e;->i:Le/c/a/e;

    invoke-direct {v0, v1}, Le/c/a/j;-><init>(Le/c/a/e;)V

    .line 447
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    invoke-virtual {v0, p1}, Le/c/a/j;->a(Ljava/lang/String;)Le/c/a/g;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/c/a/a2;->a(Le/c/a/g;)V

    return-void
.end method

.method public final varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final a(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<circle>"

    .line 86
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 88
    new-instance v0, Le/c/a/p;

    invoke-direct {v0}, Le/c/a/p;-><init>()V

    .line 89
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 90
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 91
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 92
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 93
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 94
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 95
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/p;Lorg/xml/sax/Attributes;)V

    .line 96
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 97
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/Float;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x25

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4
    :goto_0
    :try_start_0
    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    if-eqz v2, :cond_1

    div-float/2addr v0, v1

    :cond_1
    const/4 v2, 0x0

    cmpg-float v3, v0, v2

    if-gez v3, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    cmpl-float v2, v0, v1

    if-lez v2, :cond_3

    goto :goto_1

    :cond_3
    move v1, v0

    .line 5
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 6
    new-instance v1, Lorg/xml/sax/SAXException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid offset value in <stop>: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 7
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid offset value in <stop> (empty string)"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 24
    :cond_1
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/16 v3, 0x49

    if-eq v2, v3, :cond_3

    .line 25
    iget-object v1, p1, Le/c/a/f1;->e:Le/c/a/y0;

    if-nez v1, :cond_2

    .line 26
    new-instance v1, Le/c/a/y0;

    invoke-direct {v1}, Le/c/a/y0;-><init>()V

    iput-object v1, p1, Le/c/a/f1;->e:Le/c/a/y0;

    .line 27
    :cond_2
    iget-object v1, p1, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Le/c/a/p2;->a(Le/c/a/y0;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_3
    invoke-static {p1, v1}, Le/c/a/p2;->a(Le/c/a/f1;Ljava/lang/String;)V

    goto :goto_1

    .line 29
    :cond_4
    invoke-static {v1}, Le/c/a/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Le/c/a/f1;->g:Ljava/util/List;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final b(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<clipPath>"

    .line 8
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 10
    new-instance v0, Le/c/a/q;

    invoke-direct {v0}, Le/c/a/q;-><init>()V

    .line 11
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 12
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 13
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 14
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 15
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 16
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 17
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/q;Lorg/xml/sax/Attributes;)V

    .line 18
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 19
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 20
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/lang/String;)Landroid/graphics/Matrix;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 12
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 13
    new-instance v1, Le/c/a/o2;

    invoke-direct {v1, p1}, Le/c/a/o2;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 15
    :goto_0
    invoke-virtual {v1}, Le/c/a/o2;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    .line 16
    :cond_0
    invoke-virtual {v1}, Le/c/a/o2;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_13

    const-string v3, "matrix"

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0x29

    const-string v6, "Invalid transform list: "

    if-eqz v3, :cond_2

    .line 18
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 19
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 20
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    .line 21
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v3

    .line 22
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    .line 23
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v7

    .line 24
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    .line 25
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v8

    .line 26
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    .line 27
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v9

    .line 28
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    .line 29
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v10

    .line 30
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    if-eqz v10, :cond_1

    .line 31
    invoke-virtual {v1, v5}, Le/c/a/o2;->a(C)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 32
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    const/16 v6, 0x9

    new-array v6, v6, [F

    const/4 v11, 0x0

    .line 33
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    aput v2, v6, v11

    const/4 v2, 0x1

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    aput v7, v6, v2

    const/4 v2, 0x2

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v7

    aput v7, v6, v2

    const/4 v2, 0x3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v6, v2

    const/4 v2, 0x4

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v6, v2

    const/4 v2, 0x5

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v6, v2

    const/4 v2, 0x6

    aput v4, v6, v2

    const/4 v2, 0x7

    aput v4, v6, v2

    const/16 v2, 0x8

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v6, v2

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->setValues([F)V

    .line 34
    invoke-virtual {v0, v5}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    goto/16 :goto_1

    .line 35
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string v3, "translate"

    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 37
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 38
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 39
    invoke-virtual {v1}, Le/c/a/o2;->m()Ljava/lang/Float;

    move-result-object v3

    .line 40
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    if-eqz v2, :cond_4

    .line 41
    invoke-virtual {v1, v5}, Le/c/a/o2;->a(C)Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez v3, :cond_3

    .line 42
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_1

    .line 43
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_1

    .line 44
    :cond_4
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const-string v3, "scale"

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 46
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 47
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 48
    invoke-virtual {v1}, Le/c/a/o2;->m()Ljava/lang/Float;

    move-result-object v3

    .line 49
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    if-eqz v2, :cond_7

    .line 50
    invoke-virtual {v1, v5}, Le/c/a/o2;->a(C)Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez v3, :cond_6

    .line 51
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_1

    .line 52
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_1

    .line 53
    :cond_7
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const-string v3, "rotate"

    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 55
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 56
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 57
    invoke-virtual {v1}, Le/c/a/o2;->m()Ljava/lang/Float;

    move-result-object v3

    .line 58
    invoke-virtual {v1}, Le/c/a/o2;->m()Ljava/lang/Float;

    move-result-object v4

    .line 59
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    if-eqz v2, :cond_b

    .line 60
    invoke-virtual {v1, v5}, Le/c/a/o2;->a(C)Z

    move-result v5

    if-eqz v5, :cond_b

    if-nez v3, :cond_9

    .line 61
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->preRotate(F)Z

    goto/16 :goto_1

    :cond_9
    if-eqz v4, :cond_a

    .line 62
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    goto/16 :goto_1

    .line 63
    :cond_a
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_b
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    const-string v3, "skewX"

    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 66
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 67
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 68
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    if-eqz v2, :cond_d

    .line 69
    invoke-virtual {v1, v5}, Le/c/a/o2;->a(C)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 70
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto :goto_1

    .line 71
    :cond_d
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    const-string v3, "skewY"

    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 73
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    .line 74
    invoke-virtual {v1}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v2

    .line 75
    invoke-virtual {v1}, Le/c/a/o2;->q()V

    if-eqz v2, :cond_f

    .line 76
    invoke-virtual {v1, v5}, Le/c/a/o2;->a(C)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 77
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v4, v2}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto :goto_1

    .line 78
    :cond_f
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    if-nez v2, :cond_12

    .line 79
    :goto_1
    invoke-virtual {v1}, Le/c/a/o2;->c()Z

    move-result v2

    if-eqz v2, :cond_11

    :goto_2
    return-object v0

    .line 80
    :cond_11
    invoke-virtual {v1}, Le/c/a/o2;->p()Z

    goto/16 :goto_0

    .line 81
    :cond_12
    new-instance p1, Lorg/xml/sax/SAXException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid transform list fn: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 82
    :cond_13
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad transform function encountered in transform list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<defs>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/t;

    invoke-direct {v0}, Le/c/a/t;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 10
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 11
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public characters([CII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/c/a/p2;->c:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Le/c/a/p2;->e:Z

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    .line 5
    :cond_1
    iget-object v0, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    .line 6
    :cond_2
    iget-boolean v0, p0, Le/c/a/p2;->h:Z

    if-eqz v0, :cond_4

    .line 7
    iget-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    .line 9
    :cond_3
    iget-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    .line 10
    :cond_4
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    instance-of v1, v0, Le/c/a/s1;

    if-eqz v1, :cond_7

    .line 11
    check-cast v0, Le/c/a/b1;

    .line 12
    iget-object v1, v0, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_5

    const/4 v0, 0x0

    goto :goto_0

    .line 13
    :cond_5
    iget-object v0, v0, Le/c/a/b1;->i:Ljava/util/List;

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h1;

    .line 14
    :goto_0
    instance-of v1, v0, Le/c/a/w1;

    if-eqz v1, :cond_6

    .line 15
    check-cast v0, Le/c/a/w1;

    iget-object v1, v0, Le/c/a/w1;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Le/c/a/w1;->c:Ljava/lang/String;

    goto :goto_1

    .line 16
    :cond_6
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    check-cast v0, Le/c/a/b1;

    new-instance v1, Le/c/a/w1;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-direct {v1, v2}, Le/c/a/w1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/c/a/b1;->a(Le/c/a/h1;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public comment([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/c/a/p2;->c:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Le/c/a/p2;->h:Z

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    .line 5
    :cond_1
    iget-object v0, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    :cond_2
    return-void
.end method

.method public final d(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<ellipse>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/u;

    invoke-direct {v0}, Le/c/a/u;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/u;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<g>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/y;

    invoke-direct {v0}, Le/c/a/y;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public endDocument()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lorg/xml/sax/ext/DefaultHandler2;->endDocument()V

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/ext/DefaultHandler2;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-boolean p3, p0, Le/c/a/p2;->c:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 3
    iget p3, p0, Le/c/a/p2;->d:I

    add-int/lit8 p3, p3, -0x1

    iput p3, p0, Le/c/a/p2;->d:I

    if-nez p3, :cond_0

    .line 4
    iput-boolean v0, p0, Le/c/a/p2;->c:Z

    return-void

    :cond_0
    const-string p3, "http://www.w3.org/2000/svg"

    .line 5
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    const-string p3, ""

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    const-string p1, "title"

    .line 6
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const-string v1, "desc"

    if-nez p3, :cond_6

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string p1, "style"

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_3

    .line 8
    iput-boolean v0, p0, Le/c/a/p2;->h:Z

    .line 9
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/c/a/p2;->a(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->i:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void

    :cond_3
    const-string p1, "svg"

    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "defs"

    .line 12
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "g"

    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "use"

    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "image"

    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "text"

    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "tspan"

    .line 17
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "switch"

    .line 18
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "symbol"

    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "marker"

    .line 20
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "linearGradient"

    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "radialGradient"

    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "stop"

    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "clipPath"

    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "textPath"

    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "pattern"

    .line 26
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "view"

    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "mask"

    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "solidColor"

    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 30
    :cond_4
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    check-cast p1, Le/c/a/h1;

    iget-object p1, p1, Le/c/a/h1;->b:Le/c/a/d1;

    iput-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    :cond_5
    return-void

    .line 31
    :cond_6
    :goto_0
    iput-boolean v0, p0, Le/c/a/p2;->e:Z

    .line 32
    iget-object p2, p0, Le/c/a/p2;->f:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 33
    iget-object p1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iget-object p2, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/c/a/a2;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 34
    :cond_7
    iget-object p1, p0, Le/c/a/p2;->f:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 35
    iget-object p1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iget-object p2, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/c/a/a2;->c(Ljava/lang/String;)V

    .line 36
    :cond_8
    :goto_1
    iget-object p1, p0, Le/c/a/p2;->g:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method

.method public final f(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<image>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/a0;

    invoke-direct {v0}, Le/c/a/a0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a0;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 13
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<line>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/c0;

    invoke-direct {v0}, Le/c/a/c0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/c0;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<linearGradiant>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/g1;

    invoke-direct {v0}, Le/c/a/g1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/v;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/g1;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<marker>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/d0;

    invoke-direct {v0}, Le/c/a/d0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/l1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/d0;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 13
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<mask>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/e0;

    invoke-direct {v0}, Le/c/a/e0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/e0;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<path>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/h0;

    invoke-direct {v0}, Le/c/a/h0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/h0;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final l(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<pattern>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/k0;

    invoke-direct {v0}, Le/c/a/k0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/l1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/k0;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 13
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<polygon>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/m0;

    invoke-direct {v0}, Le/c/a/m0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    const-string v1, "polygon"

    .line 10
    invoke-virtual {p0, v0, p1, v1}, Le/c/a/p2;->a(Le/c/a/l0;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<polyline>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/l0;

    invoke-direct {v0}, Le/c/a/l0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    const-string v1, "polyline"

    .line 10
    invoke-virtual {p0, v0, p1, v1}, Le/c/a/p2;->a(Le/c/a/l0;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<radialGradient>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/k1;

    invoke-direct {v0}, Le/c/a/k1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/v;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/k1;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<rect>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/n0;

    invoke-direct {v0}, Le/c/a/n0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/n0;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<solidColor>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/o0;

    invoke-direct {v0}, Le/c/a/o0;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 9
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 10
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<stop>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_1

    .line 3
    instance-of v0, v0, Le/c/a/v;

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Le/c/a/p0;

    invoke-direct {v0}, Le/c/a/p0;-><init>()V

    .line 5
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 6
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/p0;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements."

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s(Lorg/xml/sax/Attributes;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "<style>"

    .line 9
    invoke-virtual {p0, v2, v1}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    const-string v2, "all"

    const/4 v3, 0x1

    .line 11
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-lt v0, v4, :cond_1

    if-eqz v3, :cond_0

    .line 12
    sget-object p1, Le/c/a/e;->i:Le/c/a/e;

    invoke-static {v2, p1}, Le/c/a/j;->a(Ljava/lang/String;Le/c/a/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    iput-boolean v1, p0, Le/c/a/p2;->h:Z

    goto :goto_1

    .line 14
    :cond_0
    iput-boolean v1, p0, Le/c/a/p2;->c:Z

    .line 15
    iput v1, p0, Le/c/a/p2;->d:I

    :goto_1
    return-void

    .line 16
    :cond_1
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-static {}, Le/c/a/p2;->a()[I

    move-result-object v5

    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Le/c/a/n2;->a(Ljava/lang/String;)Le/c/a/n2;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/16 v6, 0x27

    if-eq v5, v6, :cond_3

    const/16 v6, 0x4e

    if-eq v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "text/css"

    .line 18
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_3
    move-object v2, v4

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 19
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startDocument()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lorg/xml/sax/ext/DefaultHandler2;->startDocument()V

    .line 2
    new-instance v0, Le/c/a/a2;

    invoke-direct {v0}, Le/c/a/a2;-><init>()V

    iput-object v0, p0, Le/c/a/p2;->a:Le/c/a/a2;

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xml/sax/ext/DefaultHandler2;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 2
    iget-boolean p3, p0, Le/c/a/p2;->c:Z

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    .line 3
    iget p1, p0, Le/c/a/p2;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Le/c/a/p2;->d:I

    return-void

    :cond_0
    const-string p3, "http://www.w3.org/2000/svg"

    .line 4
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    const-string p3, ""

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    const-string p1, "svg"

    .line 5
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p0, p4}, Le/c/a/p2;->t(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_2
    const-string p1, "g"

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p0, p4}, Le/c/a/p2;->e(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_3
    const-string p1, "defs"

    .line 9
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 10
    invoke-virtual {p0, p4}, Le/c/a/p2;->c(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_4
    const-string p1, "use"

    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 12
    invoke-virtual {p0, p4}, Le/c/a/p2;->z(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_5
    const-string p1, "path"

    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 14
    invoke-virtual {p0, p4}, Le/c/a/p2;->k(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_6
    const-string p1, "rect"

    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 16
    invoke-virtual {p0, p4}, Le/c/a/p2;->p(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_7
    const-string p1, "circle"

    .line 17
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 18
    invoke-virtual {p0, p4}, Le/c/a/p2;->a(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_8
    const-string p1, "ellipse"

    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 20
    invoke-virtual {p0, p4}, Le/c/a/p2;->d(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_9
    const-string p1, "line"

    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 22
    invoke-virtual {p0, p4}, Le/c/a/p2;->g(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_a
    const-string p1, "polyline"

    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 24
    invoke-virtual {p0, p4}, Le/c/a/p2;->n(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_b
    const-string p1, "polygon"

    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 26
    invoke-virtual {p0, p4}, Le/c/a/p2;->m(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_c
    const-string p1, "text"

    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 28
    invoke-virtual {p0, p4}, Le/c/a/p2;->v(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_d
    const-string p1, "tspan"

    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 30
    invoke-virtual {p0, p4}, Le/c/a/p2;->y(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_e
    const-string p1, "tref"

    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 32
    invoke-virtual {p0, p4}, Le/c/a/p2;->x(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_f
    const-string p1, "switch"

    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 34
    invoke-virtual {p0, p4}, Le/c/a/p2;->B(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_10
    const-string p1, "symbol"

    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    .line 36
    invoke-virtual {p0, p4}, Le/c/a/p2;->u(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_11
    const-string p1, "marker"

    .line 37
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 38
    invoke-virtual {p0, p4}, Le/c/a/p2;->i(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_12
    const-string p1, "linearGradient"

    .line 39
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 40
    invoke-virtual {p0, p4}, Le/c/a/p2;->h(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_13
    const-string p1, "radialGradient"

    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 42
    invoke-virtual {p0, p4}, Le/c/a/p2;->o(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_14
    const-string p1, "stop"

    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15

    .line 44
    invoke-virtual {p0, p4}, Le/c/a/p2;->r(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_15
    const-string p1, "a"

    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 46
    invoke-virtual {p0, p4}, Le/c/a/p2;->e(Lorg/xml/sax/Attributes;)V

    goto/16 :goto_1

    :cond_16
    const-string p1, "title"

    .line 47
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_20

    const-string p1, "desc"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_17

    goto/16 :goto_0

    :cond_17
    const-string p1, "clipPath"

    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 49
    invoke-virtual {p0, p4}, Le/c/a/p2;->b(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_18
    const-string p1, "textPath"

    .line 50
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 51
    invoke-virtual {p0, p4}, Le/c/a/p2;->w(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_19
    const-string p1, "pattern"

    .line 52
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 53
    invoke-virtual {p0, p4}, Le/c/a/p2;->l(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_1a
    const-string p1, "image"

    .line 54
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1b

    .line 55
    invoke-virtual {p0, p4}, Le/c/a/p2;->f(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_1b
    const-string p1, "view"

    .line 56
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 57
    invoke-virtual {p0, p4}, Le/c/a/p2;->A(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_1c
    const-string p1, "mask"

    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    .line 59
    invoke-virtual {p0, p4}, Le/c/a/p2;->j(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_1d
    const-string p1, "style"

    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1e

    .line 61
    invoke-virtual {p0, p4}, Le/c/a/p2;->s(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_1e
    const-string p1, "solidColor"

    .line 62
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1f

    .line 63
    invoke-virtual {p0, p4}, Le/c/a/p2;->q(Lorg/xml/sax/Attributes;)V

    goto :goto_1

    .line 64
    :cond_1f
    iput-boolean v0, p0, Le/c/a/p2;->c:Z

    .line 65
    iput v0, p0, Le/c/a/p2;->d:I

    goto :goto_1

    .line 66
    :cond_20
    :goto_0
    iput-boolean v0, p0, Le/c/a/p2;->e:Z

    .line 67
    iput-object p2, p0, Le/c/a/p2;->f:Ljava/lang/String;

    :goto_1
    return-void
.end method

.method public final t(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<svg>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    new-instance v0, Le/c/a/z0;

    invoke-direct {v0}, Le/c/a/z0;-><init>()V

    .line 3
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 4
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 5
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/l1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z0;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-nez p1, :cond_0

    .line 11
    iget-object p1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    invoke-virtual {p1, v0}, Le/c/a/a2;->a(Le/c/a/z0;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 13
    :goto_0
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void
.end method

.method public final u(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<symbol>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/n1;

    invoke-direct {v0}, Le/c/a/n1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/l1;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<text>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/q1;

    invoke-direct {v0}, Le/c/a/q1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/u1;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 13
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<textPath>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Le/c/a/t1;

    invoke-direct {v0}, Le/c/a/t1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/t1;Lorg/xml/sax/Attributes;)V

    .line 10
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 11
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    .line 12
    iget-object p1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    instance-of v1, p1, Le/c/a/v1;

    if-eqz v1, :cond_0

    .line 13
    check-cast p1, Le/c/a/v1;

    invoke-virtual {v0, p1}, Le/c/a/t1;->a(Le/c/a/v1;)V

    goto :goto_0

    .line 14
    :cond_0
    check-cast p1, Le/c/a/r1;

    invoke-interface {p1}, Le/c/a/r1;->d()Le/c/a/v1;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/c/a/t1;->a(Le/c/a/v1;)V

    :goto_0
    return-void

    .line 15
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<tref>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_2

    .line 3
    instance-of v0, v0, Le/c/a/s1;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Le/c/a/o1;

    invoke-direct {v0}, Le/c/a/o1;-><init>()V

    .line 5
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 6
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/o1;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iget-object p1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    instance-of v1, p1, Le/c/a/v1;

    if-eqz v1, :cond_0

    .line 13
    check-cast p1, Le/c/a/v1;

    invoke-virtual {v0, p1}, Le/c/a/o1;->a(Le/c/a/v1;)V

    goto :goto_0

    .line 14
    :cond_0
    check-cast p1, Le/c/a/r1;

    invoke-interface {p1}, Le/c/a/r1;->d()Le/c/a/v1;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/c/a/o1;->a(Le/c/a/v1;)V

    :goto_0
    return-void

    .line 15
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<tspan>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_2

    .line 3
    instance-of v0, v0, Le/c/a/s1;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Le/c/a/p1;

    invoke-direct {v0}, Le/c/a/p1;-><init>()V

    .line 5
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 6
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/u1;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    .line 13
    iget-object p1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    instance-of v1, p1, Le/c/a/v1;

    if-eqz v1, :cond_0

    .line 14
    check-cast p1, Le/c/a/v1;

    invoke-virtual {v0, p1}, Le/c/a/p1;->a(Le/c/a/v1;)V

    goto :goto_0

    .line 15
    :cond_0
    check-cast p1, Le/c/a/r1;

    invoke-interface {p1}, Le/c/a/r1;->d()Le/c/a/v1;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/c/a/p1;->a(Le/c/a/v1;)V

    :goto_0
    return-void

    .line 16
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(Lorg/xml/sax/Attributes;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<use>"

    .line 1
    invoke-virtual {p0, v1, v0}, Le/c/a/p2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/c/a/y1;

    invoke-direct {v0}, Le/c/a/y1;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/p2;->a:Le/c/a/a2;

    iput-object v1, v0, Le/c/a/h1;->a:Le/c/a/a2;

    .line 5
    iget-object v1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    iput-object v1, v0, Le/c/a/h1;->b:Le/c/a/d1;

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 7
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->b(Le/c/a/f1;Lorg/xml/sax/Attributes;)V

    .line 8
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/z;Lorg/xml/sax/Attributes;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/a1;Lorg/xml/sax/Attributes;)V

    .line 10
    invoke-virtual {p0, v0, p1}, Le/c/a/p2;->a(Le/c/a/y1;Lorg/xml/sax/Attributes;)V

    .line 11
    iget-object p1, p0, Le/c/a/p2;->b:Le/c/a/d1;

    invoke-interface {p1, v0}, Le/c/a/d1;->a(Le/c/a/h1;)V

    .line 12
    iput-object v0, p0, Le/c/a/p2;->b:Le/c/a/d1;

    return-void

    .line 13
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
